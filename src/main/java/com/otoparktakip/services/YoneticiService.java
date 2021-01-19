package com.otoparktakip.services;

import java.util.List;
import com.otoparktakip.model.Yonetici;

public interface YoneticiService {


    public List<Yonetici> getAllYonetici();

    public Yonetici getYoneticiById(long id);

    public void addYonetici(Yonetici yonetici);

    public void deleteYonetici(long id);


}