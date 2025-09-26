package com.devjeni.apigames.services;

import com.devjeni.apigames.dtos.GameDTO;
import com.devjeni.apigames.dtos.GameListDTO;
import com.devjeni.apigames.dtos.GameMinDTO;
import com.devjeni.apigames.entities.Game;
import com.devjeni.apigames.entities.GameList;
import com.devjeni.apigames.repositories.GameListRepository;
import com.devjeni.apigames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findall (){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(GameListDTO::new).toList();
        return dto;
    }

}