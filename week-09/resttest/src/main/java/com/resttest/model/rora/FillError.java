package com.resttest.model.rora;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FillError {
    private String error;

    public FillError() {
        this.error = "Bad Request, please add to the mandatory fields.";
    }
}
