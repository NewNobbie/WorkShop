package com.riwi.Library.Management.infrastructure.Services;

import com.riwi.Library.Management.api.dtos.request.ReservationReq;
import com.riwi.Library.Management.api.dtos.response.ReservationResponse;
import com.riwi.Library.Management.infrastructure.abstractServices.IReservationService;
import com.riwi.Library.Management.domain.entities.Reservation;
import com.riwi.Library.Management.domain.repositories.ReservationRepository;
import com.riwi.Library.Management.infrastructure.helpers.mappers.ReservationMapper;
import com.riwi.Library.Management.util.Exception.IdNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    ReservationMapper reservationMapper;

    @Override
    public ReservationResponse create(ReservationReq request) {
        Reservation reservation = this.reservationMapper.toEntity(request);
        return this.reservationMapper.toResponse(this.reservationRepository.save(reservation));
    }

    @Override
    public Page<ReservationResponse> getAll(int page, int size) {
        PageRequest pagination = PageRequest.of(page, size);
        Page<ReservationResponse> response = reservationRepository.findAll(pagination).map(reservation -> reservationMapper.toResponse(reservation));
        return response;
    }

    @Override
    public ReservationResponse update(ReservationReq request, Long aLong) {
        Reservation reservation = reservationMapper.toEntity(request);
        ReservationResponse response = reservationMapper.toResponse(reservationRepository.save(reservation));
        return response;
    }

    @Override
    public ReservationResponse get(Long aLong) {
        Reservation reservation = reservationRepository.findById(aLong).orElseThrow(()->new IdNotFoundException("Reservation"));
        return reservationMapper.toResponse(reservation);
    }

    @Override
    public void delete(Long aLong) {
        reservationRepository.findById(aLong).orElseThrow(()->new  IdNotFoundException("Reservation"));
        reservationRepository.deleteById(aLong);
    }
}
