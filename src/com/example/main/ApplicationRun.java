package com.example.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

import com.example.anu.Quote;

public class ApplicationRun implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationRun.class);

    public static void main(String args[]) {
        SpringApplication.run(ApplicationRun.class);
    }

    
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }

}
