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
public class GrandPrix {
    private String url,
            name,
            date;
    
    private ArrayList<Standing> standings;
    
    private ArrayList<Qualifying> qs;
    
    public GrandPrix() {}

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setStandings(ArrayList<Standing> standings) {
        this.standings = standings;
    }

    public ArrayList<Standing> getStandings() {
        return standings;
    }

    public void setQs(ArrayList<Qualifying> qs) {
        this.qs = qs;
    }
    
    public Standing getStandingFromPos(String num){
        for(Standing s : standings){
            if(s.getNumber().equals(num))
                return s;
        }
        return null;
    }

    @Override
    public String toString() {
        return "GrandPrix{" + "url=" + url + ", name=" + name + ", date=" + date + ", standings=" + standings.toString() + '}';
    }
}
