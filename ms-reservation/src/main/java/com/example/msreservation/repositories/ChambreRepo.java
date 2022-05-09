package com.example.msreservation.repositories;

import com.example.msreservation.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChambreRepo extends JpaRepository<Chambre, Long> {

   Chambre findChambresByIdchambre(Long idc);
}
