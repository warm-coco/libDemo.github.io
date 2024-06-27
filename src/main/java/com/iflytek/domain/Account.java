package com.iflytek.domain;

public class Account {
    private int id;
    private String name;
    private  String money;

    @Override
    public String toString(){
        return "Account{"+"id="+id+",name='"+name+'\''+",money="+money+'}';
    };
}
