package com.cuit;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    /**
     * 增加用户
     */
    public void addUser(User user) {
        System.out.println("增加用户:" + user.toString());
    }

    /**
     * 删除用户
     */
    public void deleteUser(User user) {
        System.out.println("删除用户:" + user.toString());
        throw new RuntimeException("edit person throw exception");
    }

}
