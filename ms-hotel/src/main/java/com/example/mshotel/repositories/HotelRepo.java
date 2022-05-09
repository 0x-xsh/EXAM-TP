package com.example.mshotel.repositories;

import com.example.mshotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HotelRepo extends JpaRepository<Hotel, Long> {
}
