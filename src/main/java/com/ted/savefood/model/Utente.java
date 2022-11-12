package com.ted.savefood.model;

import javax.persistence.*;

@Entity
@Table(name = "utenti")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public Utente() {
    }

    public Utente(String email, String password) {
        this.email = email;
        this.password = password;
    }
}