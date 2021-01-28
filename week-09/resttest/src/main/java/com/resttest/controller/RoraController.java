package com.resttest.controller;

import com.resttest.model.rora.FillError;
import com.resttest.model.rora.Ship;
import com.resttest.model.rora.ShipFill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoraController {
    Ship ship = new Ship();

    @GetMapping("/rocket")
    public ResponseEntity<?> getShipStatus() {
        return ResponseEntity.ok(ship);
    }

    @GetMapping("/rocket/fill")
    public ResponseEntity<?> fillShip(@RequestParam(required = false) String caliber,
                                      @RequestParam(required = false) Integer amount) {
        if (caliber == null || amount == null) {
            ResponseEntity.badRequest().body(new FillError());
        }
        ship.shipFill(caliber, amount);
        return ResponseEntity.ok(new ShipFill(caliber, amount, ship));
    }
}
