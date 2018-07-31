package com.zhao.boot.exception;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-30 11:34
 * @描述     异常处理器，拦截异常
 **/
@Component
public class MyExceptionHandler implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        //获取前面的异常处理器(DefaultErrorAttributes)的数据
        Object error = request.getAttribute("org.springframework.boot.autoconfigure.web.DefaultErrorAttributes.ERROR");
        System.out.println(error);

        System.out.println(request.getAttribute("javax.servlet.error.status_code"));


        ModelAndView mv  = new ModelAndView();
        System.out.println(o);
        System.out.println(e);
        mv.setViewName("index");
        return mv;
    }
}


/**
方式2：
 @ControllerAdvice
 public class MyExceptionHandler {
     @ResponseBody
     @ExceptionHandler(RuntimeException.class)
     public Map<String,Object> handleException(RuntimeException e){
             Map<String,Object> map = new HashMap<>();
             map.put("code","user.notexist");
             map.put("message",e.getMessage());
             return map;
     }
 }
*/