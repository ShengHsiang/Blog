package com.sheng.service;

import com.sheng.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
