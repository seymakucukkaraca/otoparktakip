package com.otoparktakip.services;

import java.util.List;
import com.otoparktakip.model.Park;

public interface ParkService {


    public List<Park> getAllPark();

    public Park getParkById(long id);

    public void addPark(Park park);

    public void deletePark(long id);


}