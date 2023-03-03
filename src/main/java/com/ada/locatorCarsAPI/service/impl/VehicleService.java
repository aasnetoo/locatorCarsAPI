package com.ada.locatorCarsAPI.service.impl;

import com.ada.locatorCarsAPI.entity.VehicleEntity;
import com.ada.locatorCarsAPI.repository.VehicleRepository;
import com.ada.locatorCarsAPI.service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements IVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public VehicleEntity saveVehicle(VehicleEntity vehicleEntity) {
        return vehicleRepository.save(vehicleEntity);
    }

    @Override
    public Optional<VehicleEntity> findByPlate(String plate) {
        return vehicleRepository.findByPlateEquals(plate);
    }

    @Override
    public List<VehicleEntity> allVehicles() {
        return vehicleRepository.findAll();
    }


}
