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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
        mockMvc.perform(post("/rocket/fill?caliber=" + caliber + "&amount=" + amount))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received",is(".25")))
                .andExpect(jsonPath("$.amount",is(0)))
                .andExpect(jsonPath("$.ready",is(false)))
                .andExpect(jsonPath("$.shipstatus",is("empty")))
                .andDo(print());
    }
}