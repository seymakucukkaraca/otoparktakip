package com.otoparktakip.services;

import com.otoparktakip.model.AracCikis;
import com.otoparktakip.repository.AracCikisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AracCikisServiceImplementation implements AracCikisService{

    @Autowired
    AracCikisRepository aracCikisRepository;


    @Override
    public List<AracCikis> getAllAracCikis() {
        return (List<AracCikis>) aracCikisRepository.findAll();
    }

    @Override
    public AracCikis getAracCikisById(long id) {
        return aracCikisRepository.findById(id).get();
    }

    @Override
    public void addAracCikis(AracCikis aracCikis) {
        aracCikisRepository.save(aracCikis);
    }

    @Override
    public void deleteAracCikis(long id) {
        aracCikisRepository.deleteById(id);
    }


}