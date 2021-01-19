package com.otoparktakip.model;

import javax.persistence.*;

@Entity
@Table(name = "parkalani")
public class ParkAlani {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="sira", nullable = false, length = 5)
    private String sira;

    @Column(name="dolulukorani", nullable = false, length = 1)
    private boolean dolulukorani;

    @OneToOne
    @JoinColumn(name = "abone_id")
    private Abone abone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSira() {
        return sira;
    }

    public void setSira(String sira) {
        this.sira = sira;
    }

    public boolean isDolulukorani() {
        return dolulukorani;
    }

    public void setDolulukorani(boolean dolulukorani) {
        this.dolulukorani = dolulukorani;
    }

    public Abone getAbone() {
        return abone;
    }

    public void setAbone(Abone abone) {
        this.abone = abone;
    }
}