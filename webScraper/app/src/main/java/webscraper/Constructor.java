/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webscraper;

/**
 *
 * @author Alessandro
 */
public class Constructor {
    String name,
            base,
            teamChief,
            techChief,
            chassis,
            powUnit,
            firstTeamEntry,
            worldChamps,
            polePos,
            fastestlap;

    public Constructor() {
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamChief(String teamChief) {
        this.teamChief = teamChief;
    }

    public void setTechChief(String techChief) {
        this.techChief = techChief;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setPowUnit(String powUnit) {
        this.powUnit = powUnit;
    }

    public void setFirstTeamEntry(String firstTeamEntry) {
        this.firstTeamEntry = firstTeamEntry;
    }

    public void setWorldChamps(String worldChamps) {
        this.worldChamps = worldChamps;
    }

    public void setPolePos(String polePos) {
        this.polePos = polePos;
    }

    public void setFastestlap(String fastestlap) {
        this.fastestlap = fastestlap;
    }

    @Override
    public String toString() {
        return "Constructor{" + "name=" + name + ", base=" + base + ", teamChief=" + teamChief + ", techChief=" + techChief + ", chassis=" + chassis + ", powUnit=" + powUnit + ", firstTeamEntry=" + firstTeamEntry + ", worldChamps=" + worldChamps + ", polePos=" + polePos + ", fastestlap=" + fastestlap + '}';
    }
}
