package webscraper;

/**
 *
 * @author Alessandro
 */
class Standing {
    private String name = null,
            secondName = null,
            code = null,
            pos = null,
            laps = null,
            number = null,
            constructor = null,
            time = null;

    public Standing() {}

    public void setName(String n) {
        name = n;
    }

    public void setSecondName(String s){
        secondName = s;
    }

    public void setCode(String c){
        code = c;
    }

    public void setPos(String p) {
        pos = p;
    }

    public void setLaps(String l) {
        laps = l;
    }

    public void setNumber(String n) {
        number = n;
    }

    public void setConstructor(String c){
        constructor = c;
    }

    public void setTime(String t){
        time = t;
    }

    public String getNumber() {
        return number;
    }
    
    public Standing build(){
        return this;
    }

    @Override
    public String toString() {
        return "Standing{" + "name=" + name + ", secondName=" + secondName + ", code=" + code + ", pos=" + pos + ", laps=" + laps + ", number=" + number + ", constructor=" + constructor + ", time=" + time + '}';
    }
}
