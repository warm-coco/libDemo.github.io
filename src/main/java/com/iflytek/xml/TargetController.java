package com.iflytek.xml;//package com.iflytek.aop.xml;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping("proxy")
//public class TargetController {
//    @Autowired
//    private TargetInterface target;
//    @RequestMapping("/test1")
//    public ModelAndView test1(){
//        target.method();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("success");
//        modelAndView.addObject("username","proxy");
//        return modelAndView;
//    }
//}
