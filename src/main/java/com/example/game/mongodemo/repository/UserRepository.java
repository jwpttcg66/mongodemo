package com.example.game.mongodemo.repository;

import com.example.game.mongodemo.model.User;

public interface UserRepository {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);

}
