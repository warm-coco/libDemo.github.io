package com.iflytek.controller;

import com.iflytek.utilS.VerifyCodeUtils;



import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "verifyCodeServlet", value = "/verifycode")
public class VerifyCodeServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String verifycode = VerifyCodeUtils.generateVerifyCode(4);
        System.out.println(verifycode);

        HttpSession session = req.getSession();
        session.setAttribute("verifycode",verifycode);


        resp.setContentType("image/png");
        ServletOutputStream outputStream = resp.getOutputStream();
        VerifyCodeUtils.outputImage(220,60,outputStream,verifycode);

    }
}


