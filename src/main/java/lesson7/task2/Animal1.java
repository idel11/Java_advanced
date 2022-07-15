package lesson7.task2;

import java.io.Serializable;

public class Animal1 implements Serializable {

    private int legs;
    protected String kind;
    public boolean isPredator;

    public Animal1(int legs, String kind, boolean isPredator) {
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
        if (this.isPredator) {
            return "Yes";
        } else return "No";
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
