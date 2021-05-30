package com.dookit.deliverytrackerserver.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeliveryLocation {
    @Id
    @GeneratedValue
    private UUID uuid;
    private Double latitude;
    private Double longitude;
    private long timestamp;
}
