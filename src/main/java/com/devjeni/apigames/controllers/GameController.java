package com.devjeni.apigames.controllers;

import com.devjeni.apigames.dtos.GameMinDTO;
import com.devjeni.apigames.entities.Game;
import com.devjeni.apigames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameMinDTO>> findALl(){
        List<GameMinDTO> resultQuerry = gameService.findall();
        return ResponseEntity.ok(resultQuerry);
    }
}
