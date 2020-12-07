package net.htwater.xiaodiclass.exception;

import net.htwater.xiaodiclass.utils.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


//异常处理类
@ControllerAdvice
public class CustomExceptionHandler {

    private final static Logger LOGGER= LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handle(Exception e){

        LOGGER.error("[ 系统异常 ]{}",e);

        if (e instanceof CustomException){
            CustomException customException= (CustomException) e;
            return ResultBean.buildError(customException.getCode(),customException.toString());
        }else{
            return ResultBean.buildError(e.toString()+" ____ "+e.getStackTrace()[0].toString());
        }
    }
}
