package com.example.msreservation.controller;

import com.example.msreservation.entities.Reservation;
import com.example.msreservation.repositories.ChambreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class controller {
    @Autowired
    ChambreRepo chambreRepo;


    @GetMapping("/chambres/{id}/reservations")
    List<Reservation> getReservations(@PathVariable("id") Long idc){

        return chambreRepo.findChambresByIdchambre(idc).getReservations();

    }


}
