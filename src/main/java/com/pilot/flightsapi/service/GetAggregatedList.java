package com.pilot.flightsapi.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pilot.flightsapi.entity.Business;
import com.pilot.flightsapi.entity.Cheap;
import com.pilot.flightsapi.entity.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GetAggregatedList {

	public List<Data> getData() throws IOException, Exception, IOException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> entity1 = restTemplate
				.getForEntity("https://tokigames-challenge.herokuapp.com/api/flights/cheap", String.class);
		ResponseEntity<String> entity2 = restTemplate
				.getForEntity("https://tokigames-challenge.herokuapp.com/api/flights/business", String.class);
		String json_list_cheap = entity1.getBody();
		json_list_cheap = json_list_cheap.substring(8);
		json_list_cheap = json_list_cheap.substring(0, json_list_cheap.length() - 1);
		String json_list_business = entity2.getBody();
		json_list_business = json_list_business.substring(8);
		json_list_business = json_list_business.substring(0, json_list_business.length() - 1);

		ObjectMapper mapper = new ObjectMapper();
		List<Cheap> cheap = Arrays.asList(mapper.readValue(json_list_cheap, Cheap[].class));
		List<Business> business = Arrays.asList(mapper.readValue(json_list_business, Business[].class));
		List<Data> al = new ArrayList<Data>();

		for (Cheap person : cheap) {

			String[] value_split = person.getRoute().split("-");
			String Str1 = value_split[0];
			String Str2 = value_split[1];
			al.add(new Data(Str1, Str2, person.getArrival(), person.getDeparture()));

		}

		for (Business person : business) {

			al.add(new Data(person.getArrival(), person.getDeparture(), person.getDepartureTime(),
					person.getArrivalTime()));

		}

		return al;

	}
}
