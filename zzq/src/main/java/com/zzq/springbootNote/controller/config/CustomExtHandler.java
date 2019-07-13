package com.zzq.springbootNote.controller.config;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
/**
 * @author qq1036916439
 */
@RestControllerAdvice
public class CustomExtHandler {
    /**
     * 通过注解和全局异常处理实现参数校验和自定义的返回状态码
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    Object handleException(MethodArgumentNotValidException e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        map.put("message", objectError.getObjectName() + objectError.getDefaultMessage());
        map.put("code", 100);
        return map;
    }

}