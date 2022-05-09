package com.example.mshotel.API;



import com.example.mshotel.model.Reservation;
import com.example.mshotel.proxies.ReservationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api")
public class HotelController {


    @Autowired
    ReservationProxy reservationProxy;
    @GetMapping("/chambres/{id}/reservations")
    CollectionModel<Reservation> getReservation(@PathVariable("id") Long id){
       return  reservationProxy.getReservations(id);


    }



}
