package com.ada.locatorCarsAPI.service;

import com.ada.locatorCarsAPI.entity.VehicleEntity;

import java.util.List;
import java.util.Optional;

public interface IVehicleService {
    public VehicleEntity saveVehicle (VehicleEntity vehicleEntity);

    public Optional<VehicleEntity> findByPlate (String plate);

    public List<VehicleEntity> allVehicles();

}
