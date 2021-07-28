package com.practice.Practice.dao;

import com.practice.Practice.domain.User;

import java.util.List;

/**
 * 用户操作的DAO
 */
public interface UserDao {
    public List<User> findAll();

    public User findUserByUsernameAndPassword(String username, String password);

    public boolean addUser(User user);

    public boolean delUser(int id);

    public boolean updateUser(User user);

    public User getUserById(int id);

    public List<User> searchByCondition(String name, String address, String email);
}
