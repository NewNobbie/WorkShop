package com.riwi.Library.Management.domain.repositories;

import com.riwi.Library.Management.domain.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation , Long> {
}
