package com.volod96.theClassicals.reboot.composer;

import com.volod96.theClassicals.reboot.type.constraints.Popularity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Composer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    private LocalDate birthDate;
    private LocalDate deceaseDate;
    @org.hibernate.validator.constraints.URL
    private String wikipediaLink;
    @org.hibernate.validator.constraints.URL
    private String imageLink;

    public Composer() {}

    public Composer(String name, LocalDate birthDate,
                    LocalDate deceaseDate, String wikipediaLink, String imageLink) {
        this.name = name;
        this.birthDate = birthDate;
        this.deceaseDate = deceaseDate;
        this.wikipediaLink = wikipediaLink;
        this.imageLink = imageLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeceaseDate() {
        return deceaseDate;
    }

    public void setDeceaseDate(LocalDate deceaseDate) {
        this.deceaseDate = deceaseDate;
    }

    public String getWikipediaLink() {
        return wikipediaLink;
    }

    public void setWikipediaLink(String wikipediaLink) {
        this.wikipediaLink = wikipediaLink;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
