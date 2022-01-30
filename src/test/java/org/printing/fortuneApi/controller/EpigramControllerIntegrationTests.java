package org.printing.fortuneApi.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class EpigramControllerIntegrationTests {
 
	
	@Test
	void getEpigramEndpointShouldReturnValidMessage() {
        ResponseEntity<String> responseEntity = new TestRestTemplate()
            .getForEntity("http://localhost:8080/getEpigram", String.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
		assertTrue(responseEntity.getBody().length()>0);
	}

	@Test
	void homePageStatusShouldBe200() {
        ResponseEntity<String> responseEntity = new TestRestTemplate()
            .getForEntity("http://localhost:8080", String.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
	}

}
