package com.ada.locatorCarsAPI.dto;


import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ClientDTO {
    public Long id;
    public String name;
    private String phone;
    private String document;
    private String clientType;
}
