package com.ada.locatorCarsAPI.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class VehicleDTO {
    public Long id;
    public String model;
    public String plate;
    public String type;
    public boolean isAvailable;

    public boolean getAvailabe() {
        return isAvailable;
    }

    public void setDisponivel(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
