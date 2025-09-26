package com.devjeni.apigames.dtos;

import com.devjeni.apigames.entities.GameList;

public record GameListDTO(Long id, String name) {
    public GameListDTO(GameList entity){
        this(entity.getId(), entity.getName());
    }
}
