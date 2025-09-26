package com.devjeni.apigames.controllers;

import com.devjeni.apigames.dtos.GameDTO;
import com.devjeni.apigames.dtos.GameListDTO;
import com.devjeni.apigames.dtos.GameMinDTO;
import com.devjeni.apigames.services.GameListService;
import com.devjeni.apigames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findall(){
        List<GameListDTO> result = gameListService.findall();
        return ResponseEntity.ok(result);
    }



}
