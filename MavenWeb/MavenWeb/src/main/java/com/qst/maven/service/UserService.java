package com.qst.maven.service;



import com.qst.maven.entity.User;

import java.util.List;

public interface UserService {

    List<User> list(String username);
}
