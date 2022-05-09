package com.example.mshotel.proxies;


import com.example.mshotel.entities.Chambre;
import com.example.mshotel.model.Reservation;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-reservation")
@LoadBalancerClient(name = "ms-reservation")
public interface ReservationProxy {

    @GetMapping("/api/chambres/{id}/reservations")
    CollectionModel<Reservation> getReservations(@PathVariable("id") Long idr);


}
