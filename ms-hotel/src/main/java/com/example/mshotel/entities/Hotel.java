package com.example.mshotel.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idhotel;

    private String nom;

    @OneToMany(mappedBy = "hotel")
    private List<Chambre> chambres;




}
