package com.resttest.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.Matchers.is;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RoraController.class)
class RoraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testShipStatus() throws Exception {
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testShipFillEmptyState() throws Exception {
        String caliber = ".25";
        int amount = 0;
        boolean ready = false;
        String shipstatus = "empty";
        mockMvc.perform(get("/rocket/fill?caliber=" + caliber + "&amount=" + amount))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received",is(caliber)))
                .andExpect(jsonPath("$.amount",is(amount)))
                .andExpect(jsonPath("$.ready",is(ready)))
                .andExpect(jsonPath("$.shipstatus",is(shipstatus)))
                .andDo(print());
    }

    @Test
    public void testShipFillFortyPercentState() throws Exception {
        String caliber = ".25";
        int amount = 5000;
        boolean ready = false;
        String shipstatus = "40%";
        mockMvc.perform(get("/rocket/fill?caliber=" + caliber + "&amount=" + amount))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received",is(caliber)))
                .andExpect(jsonPath("$.amount",is(amount)))
                .andExpect(jsonPath("$.ready",is(ready)))
                .andExpect(jsonPath("$.shipstatus",is(shipstatus)))
                .andDo(print());
    }

    @Test
    public void testShipFillFullState() throws Exception {
        String caliber = ".25";
        int amount = 12500;
        boolean ready = true;
        String shipstatus = "full";
        mockMvc.perform(get("/rocket/fill?caliber=" + caliber + "&amount=" + amount))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received",is(caliber)))
                .andExpect(jsonPath("$.amount",is(amount)))
                .andExpect(jsonPath("$.ready",is(ready)))
                .andExpect(jsonPath("$.shipstatus",is(shipstatus)))
                .andDo(print());
    }

    @Test
    public void testShipFillOverloadedState() throws Exception {
        String caliber = ".25";
        int amount = 15000;
        boolean ready = false;
        String shipstatus = "overloaded";
        mockMvc.perform(get("/rocket/fill?caliber=" + caliber + "&amount=" + amount))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received",is(caliber)))
                .andExpect(jsonPath("$.amount",is(amount)))
                .andExpect(jsonPath("$.ready",is(ready)))
                .andExpect(jsonPath("$.shipstatus",is(shipstatus)))
                .andDo(print());
    }

}