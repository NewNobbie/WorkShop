package com.riwi.Library.Management.infrastructure.Services;

import com.riwi.Library.Management.api.dtos.request.UserReq;
import com.riwi.Library.Management.api.dtos.response.UserBasicResponse;
import com.riwi.Library.Management.domain.entities.User;
import com.riwi.Library.Management.domain.repositories.UserRepository;
import com.riwi.Library.Management.infrastructure.abstractServices.IUserService;
import com.riwi.Library.Management.infrastructure.helpers.mappers.UserMapper;
import com.riwi.Library.Management.util.Exception.IdNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserBasicResponse create(UserReq request) {
        User user = this.userMapper.toUserEntity(request);
        return this.userMapper.toUserResponse(this.userRepository.save(user));
    }

    @Override
    public Page<UserBasicResponse> getAll(int page, int size) {
        PageRequest pagination = PageRequest.of(page, size);
        Page<UserBasicResponse> response = userRepository.findAll(pagination).map(user -> userMapper.toUserResponse(user));
        return response;
    }

    @Override
    public UserBasicResponse update(UserReq request, Long aLong) {
        User user = userMapper.toUserEntity(request);
        UserBasicResponse response = userMapper.toUserResponse(userRepository.save(user));
        return response;
    }

    @Override
    public UserBasicResponse get(Long aLong) {
        User user = userRepository.findById(aLong).orElseThrow(()->new IdNotFoundException("User"));
        return userMapper.toUserResponse(user);
    }

    @Override
    public void delete(Long aLong) {
        userRepository.findById(aLong).orElseThrow(()->new IdNotFoundException("User"));
        userRepository.deleteById(aLong);
    }
}
