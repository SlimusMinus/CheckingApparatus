package org.krylov.entity.baseReadings;


/**
 * entity class for creating users, containing only readout getters and setters*/
public abstract class ReadingsAbstract {
    private int hot_waters;
    private int cold_waters;
    private int heating;
    public ReadingsAbstract() {
    }

    public ReadingsAbstract(int hot_waters, int cold_waters, int heating) {
        this.hot_waters = hot_waters;
        this.cold_waters = cold_waters;
        this.heating = heating;
    }

    public int getHot_waters() {
        return hot_waters;
    }

    public void setHot_waters(int hot_waters) {
        this.hot_waters = hot_waters;
    }

    public int getCold_waters() {
        return cold_waters;
    }

    public void setCold_waters(int cold_waters) {
        this.cold_waters = cold_waters;
    }

    public int getHeating() {
        return heating;
    }

    public void setHeating(int heating) {
        this.heating = heating;
    }

    @Override
    public String toString() {
        return " Readings - " +
                "hot_waters = " + hot_waters +
                ", cold_waters = " + cold_waters +
                ", heating = " + heating +
                '\n';
    }
}
