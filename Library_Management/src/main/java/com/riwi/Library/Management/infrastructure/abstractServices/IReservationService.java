package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.dtos.request.ReservationReq;
import com.riwi.Library.Management.api.dtos.response.ReservationResponse;

public interface IReservationService extends CRUDService <ReservationReq, ReservationResponse,Long> {
}
