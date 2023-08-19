package com.driver.models;

import javax.persistence.*;

@Entity
@Table
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer imageId;
    private String description;
    private String dimendions;

    public Image() {
    }

    public Image(Integer imageId, String description, String dimendions) {
        this.imageId = imageId;
        this.description = description;
        this.dimendions = dimendions;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimendions() {
        return dimendions;
    }

    public void setDimendions(String dimendions) {
        this.dimendions = dimendions;
    }

    @ManyToOne
    @JoinColumn
    private Blog blog;
}