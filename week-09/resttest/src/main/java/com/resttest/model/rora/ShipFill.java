package com.resttest.model.rora;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipFill {
    private String received;
    private Integer amount;
    @JsonProperty("shipstatus")
    private String shipStatus;
    private Boolean ready;

    public ShipFill(String received, Integer amount, Ship ship) {
        this.received = received;
        this.amount = amount;
        this.shipStatus = ship.getShipStatus();
        this.ready = ship.getReady();
    }
}
