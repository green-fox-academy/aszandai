package com.resttest.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getMessageWithInput() throws Exception {
        String message = "message";
        mockMvc.perform(get("/groot?message=" + message))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received", is(message)))
                .andExpect(jsonPath("translated", is("I am Groot!")))
                .andDo(print());
    }
    @Test
    public void getMessageWithoutInput() throws Exception {
        mockMvc.perform(get("/groot?message"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("I am Groot...")))
                .andDo(print());
    }
}