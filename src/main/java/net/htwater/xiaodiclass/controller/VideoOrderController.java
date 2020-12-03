package net.htwater.xiaodiclass.controller;

import net.htwater.xiaodiclass.model.entity.Video;
import net.htwater.xiaodiclass.model.entity.VideoOrder;
import net.htwater.xiaodiclass.model.request.VideoOrderRequest;
import net.htwater.xiaodiclass.service.VideoOrderService;
import net.htwater.xiaodiclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pri/videoOrder")
public class VideoOrderController {

    @Autowired
    private VideoOrderService videoOrderService;

    //下单接口
    @PostMapping("save")
    public JsonData saveOrder(@RequestBody VideoOrderRequest videoOrderRequest, HttpServletRequest httpServletRequest){

        String userId= (String) httpServletRequest.getAttribute("userId");

        int count= videoOrderService.save(Integer.parseInt(userId),videoOrderRequest.getVideoId());

        if (count==0){
            return JsonData.buildError("下单失败");
        }else {
            return JsonData.buildSuccess();
        }

    }


    //视频订单列表
    @GetMapping("list")
    public JsonData videoList(HttpServletRequest httpServletRequest){
        String userId= (String) httpServletRequest.getAttribute("userId");
        List<VideoOrder> videoOrderList=videoOrderService.videoOrderList(Integer.parseInt(userId));
        return JsonData.buildSuccess(videoOrderList);
    }
}
