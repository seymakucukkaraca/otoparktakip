package com.otoparktakip.services;


import com.otoparktakip.model.Personel;
import com.otoparktakip.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class PersonelServiceImplementation implements PersonelService {

    @Autowired
    PersonelRepository personelRepository;


    @Override
    public List<Personel> getAllPersonel() {
        return (List<Personel>) personelRepository.findAll();
    }

    @Override
    public Personel getPersonelById(long id) {
        return personelRepository.findById(id).get();
    }

    @Override
    public void addPersonel(Personel personel) {
        personelRepository.save(personel);
    }

    @Override
    public void deletePersonel(long id) {
        personelRepository.deleteById(id);
    }


}