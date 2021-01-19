package com.otoparktakip.services;

import java.util.List;
import com.otoparktakip.model.ParkAlani;

public interface ParkAlaniService {


    public List<ParkAlani> getAllParkAlani();

    public ParkAlani getParkAlaniById(long id);

    public void addParkAlani(ParkAlani parkAlani);

    public void deleteParkAlani(long id);


}