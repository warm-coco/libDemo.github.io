package com.iflytek.exception.resolver;

import com.iflytek.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView view = new ModelAndView();
        ex.printStackTrace();
        if(ex instanceof NullPointerException){
            view.setViewName("exception/NullPointerException");
            view.addObject("info","NullPointerException");
        } else if(ex instanceof ClassCastException){
            view.setViewName("exception/ClassCastException");
            view.addObject("info","ClassCastException");
        }else if(ex instanceof FileNotFoundException){
            view.setViewName("exception/FileNotFoundException");
            view.addObject("info","FileNotFoundException");
        }else if(ex instanceof MyException){
            view.setViewName("exception/MyException");
            view.addObject("info","MyException");
        }else {
            view.setViewName("exception/defaultError");
            view.addObject("info","defaultError");
        }

        return view;
    }
}
