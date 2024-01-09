package com.legonego.service;

import com.legonego.domain.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();
    public User getUser(String name);
    public int getWithDraw(Integer id);
    public int getActive(String name);
    public int getDormant(String name);
    public User getByEmail(String email);
    public User getByName(String name);
    public User findById(String email, String tel);
    public User 
}
