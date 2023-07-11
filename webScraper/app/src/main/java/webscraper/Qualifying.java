/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webscraper;

/**
 *
 * @author Alessandro
 */
public class Qualifying {
    private String name = null,
            secondName = null,
            code = null,
            pos = null,
            laps = null,
            number = null,
            constructor = null,
            q1 = null,
            q2 = null,
            q3 = null;

    public Qualifying() {
    }

    public Qualifying setName(String name) {
        this.name = name;
        return this;
    }

    public Qualifying setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public Qualifying setCode(String code) {
        this.code = code;
        return this;
    }

    public Qualifying setPos(String pos) {
        this.pos = pos;
        return this;
    }

    public Qualifying setLaps(String laps) {
        this.laps = laps;
        return this;
    }

    public Qualifying setNumber(String number) {
        this.number = number;
        return this;
    }

    public Qualifying setConstructor(String constructor) {
        this.constructor = constructor;
        return this;
    }

    public Qualifying setQ1(String q1) {
        this.q1 = q1;
        return this;
    }

    public Qualifying setQ2(String q2) {
        this.q2 = q2;
        return this;
    }

    public Qualifying setQ3(String q3) {
        this.q3 = q3;
        return this;
    }
    
    public Qualifying build(){
        return this;
    } 

    @Override
    public String toString() {
        return "Qualifying{" + "name=" + name + ", secondName=" + secondName + ", code=" + code + ", pos=" + pos + ", laps=" + laps + ", number=" + number + ", constructor=" + constructor + ", q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + '}';
    }
}
