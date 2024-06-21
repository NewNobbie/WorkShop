package com.riwi.Library.Management.infrastructure.Services;

import com.riwi.Library.Management.api.request.UserReq;
import com.riwi.Library.Management.api.response.UserResponse;
import com.riwi.Library.Management.domain.entities.User;
import com.riwi.Library.Management.domain.repositories.UserRepository;
import com.riwi.Library.Management.infrastructure.abstractServices.IUserService;
import com.riwi.Library.Management.infrastructure.helpers.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserentityService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserResponse create(UserReq request) {
        User user = this.userMapper.toUserEntity(request);
        return this.userMapper.toUserResponse(this.userRepository.save(user));
    }

    @Override
    public UserResponse update(Long id, UserReq request) {
        return null;
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        return null;
    }
}
