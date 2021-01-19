package com.otoparktakip.services;

import java.util.List;
import com.otoparktakip.model.Personel;

public interface PersonelService {


    public List<Personel> getAllPersonel();

    public Personel getPersonelById(long id);

    public void addPersonel(Personel personel);

    public void deletePersonel(long id);


}