package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.dtos.request.UserReq;
import com.riwi.Library.Management.api.dtos.response.UserBasicResponse;

public interface IUserService extends CRUDService <UserReq, UserBasicResponse, Long> {
}
