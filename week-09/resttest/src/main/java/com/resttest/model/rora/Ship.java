package com.resttest.model.rora;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
public class Ship {
    private Integer caliber25;
    private Integer caliber30;
    private Integer caliber50;
    @JsonProperty("shipstatus")
    private String shipStatus;
    private Boolean ready;

    public Ship() {
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipStatus = "empty";
        this.ready = false;
    }

    public void shipFill(String caliber, Integer amount) {
        switch (caliber) {
            case ".25" -> caliber25 += amount;
            case ".30" -> caliber30 += amount;
            case ".50" -> caliber50 += amount;
        }

        Integer amountSum = caliber25 + caliber30 + caliber50;
        shipStatus = (int) ((amountSum / 12500D) * 100) + "%";

        if (amountSum == 0) {
            ready = false;
            shipStatus = "empty";
        } else if (amountSum > 0 && amountSum < 12500) {
            ready = false;
        } else if (amountSum == 12500) {
            ready = true;
            shipStatus = "full";
        } else if (amountSum > 12500) {
            ready = false;
            shipStatus = "overloaded";
        }
    }
}
