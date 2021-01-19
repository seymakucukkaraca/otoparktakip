package com.otoparktakip.services;

import java.util.List;

import com.otoparktakip.model.AracGiris;

public interface AracGirisService {


    public List<AracGiris> getAllAracGiris();

    public AracGiris getAracGirisById(long id);

    public void addAracGiris(AracGiris aracGiris);

    public void deleteAracGiris(long id);


}
