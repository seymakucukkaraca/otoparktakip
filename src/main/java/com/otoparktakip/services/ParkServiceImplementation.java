package com.otoparktakip.services;

import com.otoparktakip.model.Park;
import com.otoparktakip.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ParkServiceImplementation implements ParkService {

    @Autowired
    ParkRepository parkRepository;


    @Override
    public List<Park> getAllPark() {
        return (List<Park>) parkRepository.findAll();
    }

    @Override
    public Park getParkById(long id) {
        return parkRepository.findById(id).get();
    }

    @Override
    public void addPark(Park park) {
        parkRepository.save(park);
    }

    @Override
    public void deletePark(long id) {
        parkRepository.deleteById(id);
    }


}