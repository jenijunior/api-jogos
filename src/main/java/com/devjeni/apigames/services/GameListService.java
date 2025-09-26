package com.devjeni.apigames.services;

import com.devjeni.apigames.dtos.GameDTO;
import com.devjeni.apigames.dtos.GameMinDTO;
import com.devjeni.apigames.entities.Game;
import com.devjeni.apigames.repositories.GameRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //anotação para garantir que a operação sempre ira ocorrer no banco de dados e boas praticas em todas classes service
    //readonly - especifica que essa transação não haverá alterações no banco de dados. apenas leitura, tornando a operação mais rapida.
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        //armazena a consulta no banco de dados
        Game gameResult = gameRepository.findById(id).get();
        //instancia o dto e passa a consulta como parâmetro
        GameDTO dto = new GameDTO(gameResult);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findall (){
      List<Game> resultQuerry = gameRepository.findAll();
        List<GameMinDTO> dto = resultQuerry.stream().map(game -> new GameMinDTO(game)).toList();
        return dto;
    }

}