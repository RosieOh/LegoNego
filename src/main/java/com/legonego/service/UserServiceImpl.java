package com.legonego.service;

import com.legonego.domain.User;
import com.legonego.mapper.UserMapper;
import org.modelmapper.ModelMapper;
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
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUser(String name) {
        User user = userMapper.getUser(name);
        return user;
    }

    @Override
    public int getWithDraw(Integer id) {
        return userMapper.getWithDraw(id);
    }

    @Override
    public int getActive(String name) {
        return userMapper.getActive(name);
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
    public int userUpdate(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userMapper.userUpdate(user);
    }

    @Override
    public int updateLevel(String name, String lev) {
        return userMapper.updateLevel(name, lev);
    }

    @Override
    public int userRemove(String name) {
        return userMapper.userRemove(name);
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
    public int updatePasswordFailChange(User user) {
        return userMapper.updatePasswordFailChange(user);
    }
}
