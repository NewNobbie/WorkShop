package com.riwi.Library.Management.api.controllers;

import com.riwi.Library.Management.api.dtos.request.UserReq;
import com.riwi.Library.Management.api.dtos.response.UserBasicResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController implements GenericController<UserReq, UserBasicResponse, Long> {

    @Override
    public ResponseEntity<UserBasicResponse> create(UserReq request) {
        return null;
    }

    @Override
    public ResponseEntity<UserBasicResponse> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserBasicResponse> update(UserBasicResponse request, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserBasicResponse> delete(Long id) {
        return null;
    }
}
