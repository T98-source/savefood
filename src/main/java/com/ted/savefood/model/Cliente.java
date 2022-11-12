package com.ted.savefood.model;

import javax.persistence.*;

@Entity
@Table(name = "clienti")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@Column(name = "posizione_geografica")
    //private String posizioneGeografica;

    @ManyToOne
    @JoinColumn(name = "id")
    private Utente utente;
}
