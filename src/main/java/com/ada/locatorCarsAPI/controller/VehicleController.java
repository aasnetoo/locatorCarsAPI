package com.ada.locatorCarsAPI.controller;

import com.ada.locatorCarsAPI.dto.VehicleDTO;
import com.ada.locatorCarsAPI.entity.VehicleEntity;
import com.ada.locatorCarsAPI.service.impl.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    private VehicleEntity convertDTOtoEntity(VehicleDTO dto){
        return VehicleEntity.builder()
                .id(dto.getId())
                .model(dto.getModel())
                .plate(dto.getPlate())
                .type(dto.getType())
                .isAvailable(dto.getAvailabe())
                .build();
    }

    private VehicleDTO convertEntitytoDTO(VehicleEntity entity){
        return VehicleDTO.builder()
                .id(entity.getId())
                .model(entity.getModel())
                .plate(entity.getPlate())
                .type(entity.getType())
                .isAvailable(entity.getAvailabe())
                .build();
    }

    @PostMapping
    public void createVehicle(@RequestBody VehicleDTO vehicleDTO){
        vehicleService.saveVehicle(convertDTOtoEntity(vehicleDTO));
    }

    @GetMapping
    public List<VehicleEntity> listAllVehicles(){
        return vehicleService.allVehicles();
    }




}
