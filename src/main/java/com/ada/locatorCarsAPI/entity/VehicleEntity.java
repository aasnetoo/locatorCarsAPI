package com.ada.locatorCarsAPI.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "db_vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long id;
    @Column(nullable = false)
    public String model;
    @Column(nullable = false)
    public String plate;
    @Column(nullable = false)
    public String type;
    public boolean isAvailable;

    public boolean getAvailabe() {
        return isAvailable;
    }

    public void setDisponivel(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
