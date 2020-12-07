package net.htwater.xiaodiclass.controller;

import io.swagger.annotations.*;
import net.htwater.xiaodiclass.model.entity.VideoOrder;
import net.htwater.xiaodiclass.model.request.VideoOrderRequest;
import net.htwater.xiaodiclass.service.VideoOrderService;
import net.htwater.xiaodiclass.utils.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Api(tags="videoOrderController",description = "订单api")
@RestController
@RequestMapping("/api/v1/pri/videoOrder")
public class VideoOrderController {

    @Autowired
    private VideoOrderService videoOrderService;

    //下单接口
    @ApiOperation("订单保存")
    @PostMapping("save")
    public ResultBean saveOrder(@RequestBody VideoOrderRequest videoOrderRequest, HttpServletRequest httpServletRequest){

        String userId= (String) httpServletRequest.getAttribute("userId");

        int count= videoOrderService.save(Integer.parseInt(userId),videoOrderRequest.getVideoId());

        if (count==0){
            return ResultBean.buildError("下单失败");
        }else {
            return ResultBean.buildSuccess();
        }

    }


    //视频订单列表
    @ApiOperation("订单列表")
    @GetMapping("list")
    public ResultBean<List<VideoOrder>> videoList(HttpServletRequest httpServletRequest){
        String userId= (String) httpServletRequest.getAttribute("userId");
        List<VideoOrder> videoOrderList=videoOrderService.videoOrderList(Integer.parseInt(userId));
        return ResultBean.buildSuccess(videoOrderList);
    }
}
