package com.otoparktakip.services;

import com.otoparktakip.model.ParkAlani;
import com.otoparktakip.repository.ParkAlaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ParkAlaniServiceImplementation implements ParkAlaniService {

    @Autowired
    ParkAlaniRepository parkAlaniRepository;


    @Override
    public List<ParkAlani> getAllParkAlani() {
        return (List<ParkAlani>) parkAlaniRepository.findAll();
    }

    @Override
    public ParkAlani getParkAlaniById(long id) {
        return parkAlaniRepository.findById(id).get();
    }

    @Override
    public void addParkAlani(ParkAlani parkAlani) {
        parkAlaniRepository.save(parkAlani);
    }

    @Override
    public void deleteParkAlani(long id) {
        parkAlaniRepository.deleteById(id);
    }


}