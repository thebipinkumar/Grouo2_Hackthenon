package com.hack.portfolio.portfoliomanagement.functionalTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hack.portfolio.portfoliomanagement.PortfolioManagementApplication;
import com.hack.portfolio.portfoliomanagement.domain.PortfolioSummary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = PortfolioManagementApplication.class)
public class EndPointTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ObjectMapper mapper;


    @Test
    public void shouldfetchSummary() throws JsonProcessingException {

        PortfolioSummary summary= new PortfolioSummary();
        summary.setPortfolioRefNumber(2);

        HttpEntity<String> entity = getStringHttpEntity(summary);

        ResponseEntity<String> response = restTemplate.postForEntity("/portfolioSummary", entity, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }


    private HttpEntity<String> getStringHttpEntity(Object object) throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String jsonMeterData = mapper.writeValueAsString(object);
        return (HttpEntity<String>) new HttpEntity(jsonMeterData, headers);
    }
}
