package com.devjeni.apigames.services;

import com.devjeni.apigames.dtos.GameMinDTO;
import com.devjeni.apigames.entities.Game;
import com.devjeni.apigames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findall (){
      List<Game> resultQuerry = gameRepository.findAll();
        List<GameMinDTO> dto = resultQuerry.stream().map(game -> new GameMinDTO(game)).toList();
        return dto;
    }
}