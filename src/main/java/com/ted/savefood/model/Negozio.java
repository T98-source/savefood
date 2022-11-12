package com.ted.savefood.model;

import javax.persistence.*;

@Entity
@Table(name = "negozi")
public class Negozio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nom")
    private String nome;

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "telefono")
    private int telefono;

    public Negozio() {
    }

    public Negozio(String nome, String indirizzo, String descrizione, int telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
        this.telefono = telefono;
    }

    // Getter & Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
