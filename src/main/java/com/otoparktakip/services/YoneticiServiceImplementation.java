package com.otoparktakip.services;

import com.otoparktakip.model.Yonetici;
import com.otoparktakip.repository.YoneticiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class YoneticiServiceImplementation implements YoneticiService {

    @Autowired
    YoneticiRepository yoneticiRepository;


    @Override
    public List<Yonetici> getAllYonetici() {
        return (List<Yonetici>) yoneticiRepository.findAll();
    }

    @Override
    public Yonetici getYoneticiById(long id) {
        return yoneticiRepository.findById(id).get();
    }

    @Override
    public void addYonetici(Yonetici yonetici) {
        yoneticiRepository.save(yonetici);
    }

    @Override
    public void deleteYonetici(long id) {
        yoneticiRepository.deleteById(id);
    }


}