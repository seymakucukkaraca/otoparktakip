package com.otoparktakip.services;


import com.otoparktakip.model.AracGiris;
import com.otoparktakip.repository.AracGirisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AracGirisServiceImplementation implements AracGirisService{

    @Autowired
    AracGirisRepository aracGirisRepository;


    @Override
    public List<AracGiris> getAllAracGiris() {
        return (List<AracGiris>) aracGirisRepository.findAll();
    }

    @Override
    public AracGiris getAracGirisById(long id) {
        return aracGirisRepository.findById(id).get();
    }

    @Override
    public void addAracGiris(AracGiris aracGiris) {
        aracGirisRepository.save(aracGiris);
    }

    @Override
    public void deleteAracGiris(long id) {
        aracGirisRepository.deleteById(id);
    }


}