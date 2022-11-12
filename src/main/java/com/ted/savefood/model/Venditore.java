package com.ted.savefood.model;

import javax.persistence.*;

@Entity
@Table(name = "venditori")
public class Venditore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Utente utente;
}
