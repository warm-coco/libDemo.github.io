package com.iflytek.controller;

import com.iflytek.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    @Lazy
    private JdbcTemplate jdbcTemplate;

    //测试修改
    @RequestMapping("/update")
    @ResponseBody
    public void update(){
        jdbcTemplate.update("update account set money=? where name=?",100,"tom");
    }

    //测试删除操作
    @RequestMapping("/delete")
    @ResponseBody
    public void remove(){
        jdbcTemplate.update("delete from account where name=?","tom");
    }

    //测试查询所有操作
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Account> queryAll(){
        return jdbcTemplate.query("select*from account",new BeanPropertyRowMapper<Account>(Account.class));
    }

    //测试查询单个对象操作
    @RequestMapping("queryOne")
    @ResponseBody
    public Account queryOne(){
        return jdbcTemplate.queryForObject("selsct*from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),"xiaoming");
    }

    //测试查询单个简单数据操作(聚合查询)
    @RequestMapping("/queryCount")
    @ResponseBody
    public Long queryCount(){
        return jdbcTemplate.queryForObject("select count(*) from account",Long.class);
    }
}
