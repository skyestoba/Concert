package org.vashonsd;

import java.util.ArrayList;

public class Performer {
    String name;
    String description;
    ArrayList<String> hits;

    /**
     * Creates a Performer with the given name and description.
     * @param name - The name of the performer.
     * @param description - The description of the performer.
     */
    public Performer(String name, String description) {
        this.name = name;
        this.description = description;
        hits = new ArrayList<>();
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

    /**
     * Adds a string, which is the name of a hit song, to the list of hits.
     * @param hit String The name of the hit.
     */
    public void addHit(String hit) {
        hits.add(hit);
    }

    /**
     * Returns a String representing the object.
     * If the list of hits is not empty, it adds the names of the hits.
     * @return String
     */
    @Override
    public String toString() {
        String result = name + ": " + description + ". ";
        if (hits.size() > 0) {
            result += "Known for the hit";
            if (hits.size() == 1) {
                result += " \"" + hits.get(0) + ".\"";
            } else {
                result += "s \"" + String.join("\", \"", hits) + ".\"";
            }
        }
        return result;
    }
}
