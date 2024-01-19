package com.legonego.mapper;

import com.legonego.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> userList();
    User getUser(String name);
    int getWithdraw(Integer id);
    int getActivate(String name);
    int getDormant(String name);
    User getByEmail(String email);
    User getByName(String name);
    User findById(String email, String tel);
    User findByPw(String email, String tel, String name);
    int userJoin(User user);
    int updateUser(User user);
    int updateLevel(String name, String lev);
    int updateUser(String name);
    int removeUser(String name);
    PasswordEncoder passwordEncoder();
    User getUserById(Integer id);
    User getUserByName(String name);
    int updatePasswordNoChange(User user);
}
