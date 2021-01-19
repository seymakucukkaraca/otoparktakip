package com.otoparktakip.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "yonetici")
public class  Yonetici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="ad", nullable = false, length = 20)
    private String ad;

    @Column(name="soyad", nullable = false, length = 20)
    private String soyad;

    @Column(name="kullaniciadi", nullable = false)
    private String  kullaniciadi;

    @Column(name="sifre", nullable = false)
    private String sifre;

    @OneToMany(mappedBy = "yonetici")
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

