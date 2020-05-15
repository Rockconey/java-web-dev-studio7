package org.launchcode.studio7;


public abstract class BaseDisc {

    private String discType;
    private int spinRate;
    private double storageCapacity;
    private String name;
    private String contents;
    private int id;
    private static int nextId = 1;

    public BaseDisc(){
        id = nextId;
            nextId++;
    }


    public BaseDisc(String name) {
        this();
        this.name = name;
    }



    public String toString() {

        return "ID: " + getId() + "\n" + "Disc Type: " + getDiscType() + "\n" + "Name: " + getName() + "\n" + "Spin Rate: " + getSpinRate() + "\n" + "Storage Capacity: " + getStorageCapacity() + "\n" + "Contents: " + getContents();

    }

    public int getId() {
        return id;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }
}
