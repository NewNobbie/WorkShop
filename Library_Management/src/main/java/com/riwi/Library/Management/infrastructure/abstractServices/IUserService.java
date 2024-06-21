package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.request.UserReq;
import com.riwi.Library.Management.api.response.UserResponse;

public interface IUserService extends CRUDService <UserReq, UserResponse, Long> {
}
