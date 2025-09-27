package com.devjeni.apigames.projections;

//nesta interface coloca-se os get para cada dados que a consulta no sql retorna
public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
