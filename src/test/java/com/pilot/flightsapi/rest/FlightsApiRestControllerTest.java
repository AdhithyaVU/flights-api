package com.pilot.flightsapi.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class FlightsApiRestControllerTest {

	private MockMvc mockMvc;

	@InjectMocks
	private FlightsApiRestController flights_api_rest_controller;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(flights_api_rest_controller).build();
	}

	@Test
	public void testFlightsApiRestController() throws Exception {

		//mockMvc.perform(get("/api/flights/list").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());

	}

}
