package com.legonego.mapper;

import com.legonego.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUserList();
    User getUser(String name);
    int getWithDraw(Integer id);
    int getActive(String name);
    int getDormant(String name);
    User getByEmail(String email);
    User getByName(String name);
    User findById(String email, String tel);
    User findByPw(String email, String tel, String name);
    int userJoin(User user);
    int userUpdate(User user);
    int updateLevel(String name, String lev);
    int userRemove(String name);
    PasswordEncoder passwordEncoder();
    User getUserById(Integer id);
    User getUserByName(String name);
    int updatePasswordFailChange(User user);
}
