package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.request.ReservationReq;
import com.riwi.Library.Management.api.response.ReservationResponse;

public interface IReservationService extends CRUDService <ReservationReq, ReservationResponse,Long> {
}
