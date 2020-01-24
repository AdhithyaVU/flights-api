package com.pilot.flightsapi.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pilot.flightsapi.entity.Data;
import com.pilot.flightsapi.service.GetAggregatedList;

@RestController
@RequestMapping("/api/flights")
public class FlightsApiRestController {
	@Autowired
	private GetAggregatedList list;

	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Data> getFlightList() throws IOException, Exception {
		List<Data> d = list.getData();
		return d;
	}

}
