package com.dookit.deliverytrackerserver.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Delivery {
    @Id
    @GeneratedValue
    private UUID uuid;
    @ManyToOne
    private DeliveryType type;
    @ManyToOne
    private DeliveryState state;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Supplier supplier;
}
