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
        hits = new ArrayList<String>();
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

    public void addHit(String hit) {
        hits.add(hit);
    }

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
