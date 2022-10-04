package com.yogsoft.com.userservice.api;

import com.yogsoft.com.userservice.model.User;
import org.springframework.http.ResponseEntity;

public class UserController implements UserApi {
    @Override
    public ResponseEntity<User> createUser(User user) {
        return UserApi.super.createUser(user);
    }
}
