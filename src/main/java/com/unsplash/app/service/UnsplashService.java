package com.unsplash.app.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.unsplash.app.dto.Root;
import com.unsplash.app.utils.Constantes;

@Service
public class UnsplashService {

	@Autowired
	private RestTemplate restTemplate;

	public Root[] getCollections() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(Constantes.HEADER_AUTHORIZATION, Constantes.HEADER_AUTHORIZATION_VALUE);
		return restTemplate
				.exchange(Constantes.ENDPOINT_COLLECTIONS, HttpMethod.GET, new HttpEntity<>(headers), Root[].class)
				.getBody();
	}

}
