package com.otoparktakip.model;

import javax.persistence.*;

@Entity
@Table(name = "park")
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="ad", nullable = false, length = 20)
    private String ad;

    @ManyToOne
    @JoinColumn(name="personel_id", nullable=false)
    private Personel personel;

    @ManyToOne
    @JoinColumn(name="yonetici_id", nullable=false)
    private Yonetici yonetici;

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

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public Yonetici getYonetici() {
        return yonetici;
    }

    public void setYonetici(Yonetici yonetici) {
        this.yonetici = yonetici;
    }
}