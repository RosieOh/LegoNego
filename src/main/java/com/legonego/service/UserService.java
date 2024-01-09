package com.legonego.service;

import com.legonego.domain.User;
import org.springframework.security.crypto.password.PasswordEncoder;

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
    public User findByPw(String email, String tel, String name);
    public int userJoin(User user);
    public int userUpdate(User user);
    public int updateLevel(String name, String lev);
    public int userRemove(String name);
    public PasswordEncoder passwordEncoder();
    public User getUserById(Integer id);
    public User getUserByName(String name);
    public int updatePasswordFailChange(User user);
}
