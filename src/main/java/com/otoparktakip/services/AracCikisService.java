package com.otoparktakip.services;



import java.util.List;

import com.otoparktakip.model.AracCikis;

public interface AracCikisService {


    public List<AracCikis> getAllAracCikis();

    public AracCikis getAracCikisById(long id);

    public void addAracCikis(AracCikis aracCikis);

    public void deleteAracCikis(long id);


}
