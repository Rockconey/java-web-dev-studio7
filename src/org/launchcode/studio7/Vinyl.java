package org.launchcode.studio7;

import java.util.Objects;

public class Vinyl extends BaseDisc implements OpticalDisc {
    private static final String discType = "Vinyl";
    private static int nextId = 1;
    private int id;
    private String name;
    private String side;


    public Vinyl (){
        id = nextId;
        nextId++;
    }


    public Vinyl (String name, String side) {
        this();
        this.name = name;
        this.side = side;

    }

    @Override
    public void spinDisc() {
        System.out.println(getContents());
    }

    @Override
    public String toString() {

        return "ID: " + getId() + "\n" + "Disc Type: " + getDiscType() + "\n" + "Name: " + getName() + "\n" + "Side: " + getSide() + "\n" + "Spin Rate: " + getSpinRate() + "\n" + "Storage Capacity: " + getStorageCapacity() + "\n" + "Contents: " + getContents();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vinyl)) return false;
        Vinyl vinyl = (Vinyl) o;
        return id == vinyl.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDiscType() {
        return discType;
    }
}
