package com.dookit.deliverytrackerserver.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeliveryType {
    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private State[] states;
    @OneToMany
    private List<DeliveryLocation> locations;

    public DeliveryLocation getLastLocation(){
        return locations.get(locations.size());
    }
}
