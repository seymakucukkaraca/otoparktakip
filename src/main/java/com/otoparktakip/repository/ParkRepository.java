package com.otoparktakip.repository;

import com.otoparktakip.model.Park;
import org.springframework.data.repository.CrudRepository;

public interface ParkRepository extends CrudRepository<Park, Long> {
}
