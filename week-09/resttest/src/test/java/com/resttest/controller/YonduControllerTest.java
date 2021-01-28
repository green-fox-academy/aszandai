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
@WebMvcTest(YonduController.class)
public class YonduControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getSpeedWithGivenValues() throws Exception {
        Double distance = 100.0;
        Double time = 10.0;

        mockMvc.perform(get("/yondu?distance=" + distance + "&time=" + time))
                .andExpect(status().isOk())
                .andExpect(jsonPath("distance", is(distance)))
                .andExpect(jsonPath("time", is(time)))
                .andExpect(jsonPath("speed", is(10.0)))
                .andDo(print());
    }

    @Test
    public void toInfinityAndBeyond() throws Exception {
        Double distance = 100.0;
        Double time = 0.0;

        mockMvc.perform(get("/yondu?distance=" + distance + "&time=" + time))
                .andExpect(status().isOk())
                .andExpect(jsonPath("distance", is(distance)))
                .andExpect(jsonPath("time", is(time)))
                .andExpect(jsonPath("speed", is("Infinity")))
                .andDo(print());
    }


    @Test
    public void getSpeedWithoutValues() throws Exception {
        mockMvc.perform(get("/yondu?distance=&time="))
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("error", is("ERROR 500: That's an internal error my friend")))
                .andDo(print());
    }

}