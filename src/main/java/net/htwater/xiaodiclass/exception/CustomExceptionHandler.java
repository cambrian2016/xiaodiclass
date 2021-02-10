package net.htwater.xiaodiclass.exception;

import net.htwater.xiaodiclass.utils.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;
import java.util.List;


//异常处理类
@ControllerAdvice
public class CustomExceptionHandler {


    private final static Logger LOGGER = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean ExceptionHandle(Exception e) {

        LOGGER.error("[ 系统异常 ]{}", e);

        return ResultBean.buildError(e.toString() + " ____ " + e.getStackTrace()[0].toString());
    }

    //自定义异常
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResultBean CustomExceptionHandle(CustomException e) {

        LOGGER.error("[ 系统异常 ]{}", e);

        CustomException customException = (CustomException) e;
        return ResultBean.buildError(customException.getCode(), customException.getMessage());
    }

    //url异常
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public ResultBean ConstraintViolationExceptionHandle(ConstraintViolationException e) {

        LOGGER.error("[ 系统异常 ]{}", e);

        return ResultBean.buildError(e.getMessage(), e.toString() + " ____ " + e.getStackTrace()[0].toString());
    }

    //方法异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResultBean MethodArgumentNotValidExceptionHandle(MethodArgumentNotValidException e) {

        LOGGER.error("[ 系统异常 ]{}", e);

        String message = parseMessage(e);

        return ResultBean.buildError(message, e.toString() + " ____ " + e.getStackTrace()[0].toString());
    }

    //解析message
    private String parseMessage(MethodArgumentNotValidException e) {
        String message = "";
        List<ObjectError> objectErrorList = e.getAllErrors();
        for (ObjectError objectError : objectErrorList) {
            message = message + objectError.getDefaultMessage() + "; ";
        }

        return message;
    }
}
