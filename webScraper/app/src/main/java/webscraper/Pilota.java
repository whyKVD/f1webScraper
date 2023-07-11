/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webscraper;

import java.util.ArrayList;

/**
 *
 * @author Alessandro
 */
public class Pilota {
    private String name,
            number,
            team,
            nationality,
            podiums,
            grandPrixEntered,
            worldChamps,
            dateOfBirth,
            placeOfBirth;

    public Pilota() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPodiums(String podiums) {
        this.podiums = podiums;
    }

    public void setGrandPrixEntered(String grandPrixEntered) {
        this.grandPrixEntered = grandPrixEntered;
    }

    public void setWorldChamps(String worldChamps) {
        this.worldChamps = worldChamps;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return "Pilota{" + "name=" + name + ", number=" + number + ", team=" + team + ", nationality=" + nationality + ", podiums=" + podiums + ", grandPrixEntered=" + grandPrixEntered + ", worldChamps=" + worldChamps + ", dateOfBirth=" + dateOfBirth + ", placeOfBirth=" + placeOfBirth + '}';
    }
}
