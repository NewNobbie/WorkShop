package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.request.LoanReq;
import com.riwi.Library.Management.api.response.LoanResponse;

public interface ILoanService extends CRUDService <LoanReq, LoanResponse,Long> {
}
