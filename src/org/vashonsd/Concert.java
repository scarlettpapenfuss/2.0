package org.vashonsd;

import java.util.ArrayList;

public class Concert {
    String location;
    String description;
    String name;
    ArrayList<String> performers;
    String Concert;


   public Concert(String theLocation, String theDescription, String theName) {
        name = theName;
        description = theDescription;
        location = theLocation;
       performers = new ArrayList<>();

    }
    public void addPerformer(String performer) {
        Performer.add(performer);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {


        return name +
                ": " + description + ". " +
                name + " is located in " + location + ".";

    }


    public void addPerformers(String john) {
    }
}

