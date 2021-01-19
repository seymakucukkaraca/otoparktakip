package com.otoparktakip.services;

import com.otoparktakip.model.Abone;
import com.otoparktakip.repository.AboneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
public class AboneServiceImplementation implements AboneService {

    @Autowired
    AboneRepository aboneRepository;


    @Override
    public List<Abone> getAllAbones() {
        return (List<Abone>) aboneRepository.findAll();
    }

    @Override
    public Abone getAboneById(long id) {
        return aboneRepository.findById(id).get();
    }

    @Override
    public void addAbone(Abone abone) {
        aboneRepository.save(abone);
    }

    @Override
    public void deleteAbone(long id) {
        aboneRepository.deleteById(id);
    }


}