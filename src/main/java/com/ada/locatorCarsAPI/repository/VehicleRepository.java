package com.ada.locatorCarsAPI.repository;

import com.ada.locatorCarsAPI.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity,Long> {

    public Optional<VehicleEntity> findByPlateEquals (String plate);
}
