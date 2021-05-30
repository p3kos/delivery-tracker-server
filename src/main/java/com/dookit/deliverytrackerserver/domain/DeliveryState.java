package com.dookit.deliverytrackerserver.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeliveryState {
    @Id
    @GeneratedValue
    private UUID uuid;
    @ManyToOne
    private Delivery delivery;
    @ManyToOne
    private State state;
    private boolean currentState;
    /*@ManyToOne
    private DeliveryActor responsable;*/
    private Date startDate;
    private Date endDate;
}
