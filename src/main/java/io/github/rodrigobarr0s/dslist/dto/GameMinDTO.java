package io.github.rodrigobarr0s.dslist.dto;

import io.github.rodrigobarr0s.dslist.entities.Game;
import io.github.rodrigobarr0s.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }
}
