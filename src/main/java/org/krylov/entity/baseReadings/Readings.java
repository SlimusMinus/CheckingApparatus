package org.krylov.entity.baseReadings;

/**
 * Due to this class, expansions can be made by adding new indications
 * */

public class Readings extends ReadingsAbstract {

    /**
     *formal new indication for test
     */
    int electricity;
    /**
     * formal constructor for passing a new indication*/
    public Readings(int hot_waters, int cold_waters, int heating, int electricity) {
        super(hot_waters, cold_waters, heating);
        this.electricity = electricity;
    }

    public Readings(int hot_waters, int cold_waters, int heating) {
        super(hot_waters, cold_waters, heating);
    }

    public Readings() {
    }
}
