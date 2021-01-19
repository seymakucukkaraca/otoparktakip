package com.otoparktakip.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "araccikis")
public class AracCikis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="ucret", nullable = false, length = 11)
    private Float ucret;

    @OneToOne
    @JoinColumn(name = "aracgiris_id")
    private AracGiris aracgiris;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getUcret() {
        return ucret;
    }

    public void setUcret(Float ucret) {
        this.ucret = ucret;
    }

    public AracGiris getAracgiris() {
        return aracgiris;
    }

    public void setAracgiris(AracGiris aracgiris) {
        this.aracgiris = aracgiris;
    }
}