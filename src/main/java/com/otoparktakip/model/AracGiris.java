package com.otoparktakip.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "aracgiris")
public class AracGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="tc", nullable = false, length = 11)
    private String tc;

    @Column(name="konum", nullable = false, length = 5)
    private String konum;

    @Column(name="geliszamani", nullable = false)
    private java.sql.Date geliszamani;

    @Column(name="plaka", nullable = false, length = 10)
    private String plaka;

    @OneToOne(mappedBy = "aracgiris", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AracCikis araccikis;

    @OneToOne
    @JoinColumn(name = "abone_id")
    private Abone abone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public Date getGeliszamani() {
        return geliszamani;
    }

    public void setGeliszamani(Date geliszamani) {
        this.geliszamani = geliszamani;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public AracCikis getAraccikis() {
        return araccikis;
    }

    public void setAraccikis(AracCikis araccikis) {
        this.araccikis = araccikis;
    }

    public Abone getAbone() {
        return abone;
    }

    public void setAbone(Abone abone) {
        this.abone = abone;
    }
}