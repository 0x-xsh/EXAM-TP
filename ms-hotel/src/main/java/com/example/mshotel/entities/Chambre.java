package com.example.mshotel.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idchambre;

    private Long numero;

    private String type;


    @ManyToOne
    @JoinColumn(name = "idhotel")
    private Hotel hotel;



}
