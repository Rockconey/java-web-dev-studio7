package org.launchcode.studio7;


import java.util.Objects;

public class CD extends BaseDisc implements OpticalDisc, Rewritable{
    private static final String discType = "CD";
    private static int nextId = 1;
    private int id;
    private String name;


    public CD(){
        id = nextId;
        nextId++;
    }


    public CD(String name) {
        this();
        this.name = name;

    }



    @Override
    public void spinDisc() {
            System.out.println(getContents());

    }
    @Override
    public void eraseDisc() {
        this.setContents("");

        System.out.println("Your disc has been erased. Begin recording.");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CD)) return false;
        CD cd = (CD) o;
        return getId() == cd.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



    public String getDiscType() {
        return discType;
    }


// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
