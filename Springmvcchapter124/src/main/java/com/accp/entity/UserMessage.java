package com.accp.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class UserMessage {
    private String error = "exixt";
    private String message ="出错了";
    private int age = 18;
    @JSONField(format = "yyyy-MM-dd")  //如果 不指定就转换成  毫秒
    private Date birthdate = new Date();

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
