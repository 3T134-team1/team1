package com.accp.demo;

import com.accp.entity.UserMessage;
import com.alibaba.fastjson.JSON;

public class Test {

    public static void main(String[] args) {
        //   {"error":"exixt","message":"出错了","age":18,"birthdate":"2015-1-1"}

        //  {rows:1 ,data:[{"error":"exixt","message":"出错了"},{"error":"exixt","message":"出错了"}] }
        UserMessage um = new UserMessage();
        String jsonString = JSON.toJSONString(um);
        System.out.println(jsonString);
    }

}
