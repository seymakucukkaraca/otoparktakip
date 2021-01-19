package com.otoparktakip.services;


import java.util.List;

import com.otoparktakip.model.Abone;

public interface AboneService {


    public List<Abone> getAllAbones();

    public Abone getAboneById(long id);

    public void addAbone(Abone abone);

    public void deleteAbone(long id);


}