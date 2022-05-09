package com.example.msreservation.repositories;

import com.example.msreservation.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ReservationRepo extends JpaRepository<Reservation, Long> {



}
