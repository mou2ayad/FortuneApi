package org.printing.fortuneApi.services;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.printing.fortuneApi.Service.RestApiEpigramProvider;
import org.printing.fortuneApi.contract.IEpigramProvider;
import org.printing.fortuneApi.Service.StaticEpigramProvider;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EpigramServicesTests {

	@Test
	void staticEpigramProviderShouldReturnRandomMessage() {
		IEpigramProvider sut=StaticEpigramProvider.getInatance();

		var firstMessage=sut.GetRandomEpigram();
		var secondMessage=sut.GetRandomEpigram();

		assertNotNull(firstMessage);
		assertNotNull(secondMessage);
		assertNotEquals(firstMessage, secondMessage);;
	}

	@Test
	void RestApiEpigramProviderShouldReturnRandomMessage() {
		IEpigramProvider sut=RestApiEpigramProvider.getInatance();

		var firstMessage=sut.GetRandomEpigram();
		var secondMessage=sut.GetRandomEpigram();

		assertNotNull(firstMessage);
		assertNotNull(secondMessage);
		assertNotEquals(firstMessage, secondMessage);;
	}

}
