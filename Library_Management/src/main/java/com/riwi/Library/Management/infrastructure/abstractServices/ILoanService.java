package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.dtos.request.LoanReq;
import com.riwi.Library.Management.api.dtos.response.LoanResponse;

public interface ILoanService extends CRUDService <LoanReq, LoanResponse,Long> {
}
