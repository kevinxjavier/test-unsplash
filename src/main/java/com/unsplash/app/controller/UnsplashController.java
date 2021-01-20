package com.unsplash.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unsplash.app.service.UnsplashService;
import com.unsplash.app.utils.CollectionFiltrado;

@RestController
public class UnsplashController {

	@Autowired
	private UnsplashService unsplashService;

	@RequestMapping(value = "/collections", method = { RequestMethod.GET })
	public ResponseEntity<Object[]> getCollections(@RequestParam(value = "filter", required = false) String filter) {
		return new ResponseEntity<Object[]>(new CollectionFiltrado().filtrar(unsplashService.getCollections(), filter),
				HttpStatus.OK);
	}

}
