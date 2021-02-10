package com.cuit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//使用Conmponent注解
//这里还处理了test.properties 传值的方式
@Component("User")
public class User {
    @Value("${id}")
    private int id;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void Test() {
        System.out.println("id = " + id);
        System.out.println("username = " + username);
        System.out.println("passwd = " + password);
    }

    public void SayHello() {
        System.out.println("Hello " + username);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
