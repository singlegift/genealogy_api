package com.genealogy.conf;

import com.genealogy.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultErrorHandler(Exception e) {
        e.printStackTrace();
        Result result = new Result();
        result.setStatus(0);
        result.setMessage("服务器异常！");
        return result;
    }


}