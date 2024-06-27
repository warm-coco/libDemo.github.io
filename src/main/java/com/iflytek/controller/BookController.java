package com.iflytek.controller;

import com.iflytek.domain.Book;
import com.iflytek.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @RequestMapping("/list")
    public String booklist(Model model) {
        List<Book> booklist = bookService.booklist();
        model.addAttribute("booklist", booklist);
        return "booklist"; // 返回视图名
    }
    //添加

    @RequestMapping("/add")
    public String add(Book book){
        boolean add = bookService.add(book);
        if(add){
            return "redirect:/book/list";
        }else {
            request.getSession().getServletContext().setAttribute("message","添加异常！！！");
            return "bookadd";
        }

    }
    //查询
    @RequestMapping("/find")
    public ModelAndView find(int id) {
        ModelAndView modelAndView = new ModelAndView();
        String id1 = request.getParameter("id");
        System.out.println(id1);
        List<Book> booklist = bookService.find(id);
        modelAndView.setViewName("booklist");
        modelAndView.addObject("booklist",booklist);
        return modelAndView;
    }
    //数据回显
    @RequestMapping("detail")
    public String detail(int id) {
        Book book = bookService.detail(id);
        System.out.println(book);
        request.setAttribute("book", book);
        try {
            request.getRequestDispatcher("/bookupdate.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    //修改
    @RequestMapping ("/update")
    public String update(Book book){
        int count = bookService.update(book);
        if (count>0){
            System.out.println("修改成功");
            return "redirect:/book/list";
        }
        return "redirect:/book/list";
    }
        //删除
        @RequestMapping("/remove/{id}")
        public String remove( @PathVariable int id){
            bookService.remove(id);
            return "redirect:/book/list";
        }
}
