package org.vashonsd;

public class Concert {
    String name;
    String description;
    String location;


    public Concert(String name, String description, String location){
        this.name=name;
        this.description=description;
        this.location=location;

    }

    public String getName2() {
        return name;
    }

    public void setName2(String name) {
        this.name = name;
    }

    public String getDescription2() {
        return description;
    }

    public void setDescription2(String description) {
        this.description = description;
    }

    public String getLocation2() {return location;}

    public void setLocation2(String location) {this.location = location;}

    @Override
    public String toString(){
        return "Welcome to " + location + ", Today's concert is " + "festival" + name + " and it is a " + description + " concert. Our preformers will be: ";
    }
}
