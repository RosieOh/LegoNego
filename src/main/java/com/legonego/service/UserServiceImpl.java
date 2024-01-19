package com.legonego.service;

import com.legonego.domain.User;
import com.legonego.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    @Override
    public List<User> userList() {
        return userMapper.userList();
    }

    @Override
    public User getUser(String name) {
        User user = userMapper.getUser(name);
        return user;
    }

    @Override
    public int getWithdraw(Integer id) {
        return userMapper.getWithdraw(id);
    }

    @Override
    public int getActivate(String name) {
        return userMapper.getActivate(name);
    }

    @Override
    public int getDormant(String name) {
        return userMapper.getDormant(name);
    }

    @Override
    public User getByEmail(String email) {
        return userMapper.getByEmail(email);
    }

    @Override
    public User getByName(String name) {
        return userMapper.getByName(name);
    }

    @Override
    public User findById(String email, String tel) {
        return userMapper.findById(email, tel);
    }

    @Override
    public User findByPw(String email, String tel, String name) {
        return userMapper.findByPw(email, tel, name);
    }

    @Override
    public int userJoin(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userMapper.userJoin(user);
    }

    @Override
    public int updateUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userMapper.updateUser(user);
    }

    @Override
    public int updateLevel(String name, String lev) {
        return userMapper.updateLevel(name, lev);
    }

    @Override
    public int removeUser(String name) {
        return userMapper.removeUser(name);
    }

    @Override
    public PasswordEncoder passwordEncoder() {
        return this.passwordEncoder;
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public int updatePasswordNoChange(User user) {
        return userMapper.updatePasswordNoChange(user);
    }
}
