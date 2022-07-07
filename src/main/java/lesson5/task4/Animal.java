package lesson5.task4;

public class Animal {

    int legs;
    protected String kind;
    public boolean isPredator;

    public Animal(int legs, String kind, boolean isPredator) {
        this.legs = legs;
        this.kind = kind;
        this.isPredator = isPredator;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPredator() {
        if (this.isPredator == true) {
            return "Yes";
        } else return "No";
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
