package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    private static final String discType = "DVD";
    private int id;
    private static int nextId = 1;
    private String name;

    public DVD(){
        id = nextId;
        nextId++;
    }


    public DVD(String name) {
        this();
        this.name = name;

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
    public void spinDisc() {
        System.out.println(getContents());

    }

    @Override
    public String getDiscType() {
        return discType;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
