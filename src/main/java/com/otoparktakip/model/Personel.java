package com.otoparktakip.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="ad", nullable = false, length = 20)
    private String ad;

    @Column(name="soyad", nullable = false, length = 20)
    private String soyad;

    @Column(name="telefonno", nullable = false, length = 11)
    private String telefonno;

    @Column(name="isebaslamatarihi", nullable = false)
    private java.sql.Date isebaslamatarihi;

    @Column(name="kullaniciadi", nullable = false)
    private String  kullaniciadi;

    @Column(name="sifre", nullable = false)
    private String sifre;

    @OneToMany(mappedBy = "personel")
    private Set<Park> park;

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

    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }

    public Date getIsebaslamatarihi() {
        return isebaslamatarihi;
    }

    public void setIsebaslamatarihi(java.sql.Date isebaslamatarihi) {
        this.isebaslamatarihi = isebaslamatarihi;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Set<Park> getPark() {
        return park;
    }

    public void setPark(Set<Park> park) {
        this.park = park;
    }
}