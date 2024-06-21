package com.riwi.Library.Management.api.controllers;

import com.riwi.Library.Management.api.request.UserReq;
import com.riwi.Library.Management.api.response.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController implements GenericController<UserReq, UserResponse, Long> {

    @Override
    public ResponseEntity<UserResponse> create(UserReq request) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> update(UserResponse request, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> delete(Long id) {
        return null;
    }
}
