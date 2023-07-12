package com.carfinder.carfinder.domain;

import java.util.List;
import java.util.Map;

import com.carfinder.carfinder.User;

public interface UserAdapter {
    public void addUser(User u);
    public List<User> getUser();
    public User getUser(long id);
    public void updateUser(Map<String, String> value);
    public void deleteUser(long id);
}
