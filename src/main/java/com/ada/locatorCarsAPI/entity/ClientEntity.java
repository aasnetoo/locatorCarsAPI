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
@Table(name = "db_client")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = false)
    public String name;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String document;
    @Column(nullable = false)
    private String clientType;


}
