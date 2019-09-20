/*package com.glx.practice.mahendrafrnd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RestTemplateConfiguration {
	
	
	@Bean
	public RestTemplate restTemplate(){
		ObjectMapper objectMapper = new ObjectMapper();
		HttpComponentsClientHttpRequestFactory  httpComponentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		
		httpComponentsClientHttpRequestFactory.setConnectTimeout(10000);//set from properties
		httpComponentsClientHttpRequestFactory.setReadTimeout(10000);
		
		RestTemplate restTemplate = new RestTemplate();
		
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		messageConverters.add(new ByteArrayHttpMessageConverter() );
		messageConverters.add(new StringHttpMessageConverter() );
		messageConverters.add(new MappingJackson2HttpMessageConverter(objectMapper) );
		
		restTemplate.setMessageConverters(messageConverters);
		
		
		return restTemplate;
		
	}

}

*/