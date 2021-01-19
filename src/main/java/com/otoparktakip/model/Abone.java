package com.otoparktakip.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "abone")
public class Abone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="ad", nullable = false, length = 20)
    private String ad;

    @Column(name="soyad", nullable = false, length = 20)
    private String soyad;

    @Column(name="tc", nullable = false, length = 11)
    private String tc;

    @Column(name="telefonno", nullable = false, length = 11)
    private String telefonno;

    @Column(name="baslangictarihi", nullable = false)
    private java.sql.Date baslangictarihi;

    @Column(name="bitistarihi", nullable = false)
    private java.sql.Date bitistarihi;

    @Column(name="konum", nullable = false, length = 5)
    private String konum;

    @Column(name="plaka", nullable = false, length = 10)
    private String plaka;

    @OneToOne(mappedBy = "abone", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private ParkAlani parkalani;

    @OneToOne(mappedBy = "abone", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AracGiris aracgiris;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }

    public Date getBaslangictarihi() {
        return baslangictarihi;
    }

    public void setBaslangictarihi(java.sql.Date baslangictarihi) {
        this.baslangictarihi = baslangictarihi;
    }

    public Date getBitistarihi() {
        return bitistarihi;
    }

    public void setBitistarihi(java.sql.Date bitistarihi) {
        this.bitistarihi = bitistarihi;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public ParkAlani getParkalani() {
        return parkalani;
    }

    public void setParkalani(ParkAlani parkalani) {
        this.parkalani = parkalani;
    }

    public AracGiris getAracgiris() {
        return aracgiris;
    }

    public void setAracgiris(AracGiris aracgiris) {
        this.aracgiris = aracgiris;
    }
}
