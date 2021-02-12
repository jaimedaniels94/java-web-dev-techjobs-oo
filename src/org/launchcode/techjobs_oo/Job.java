package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // constructors

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


//    custom to string method

    @Override
    public String toString(){
        String jobListing = "";
        ArrayList<String> labels = new ArrayList<>();
        labels.add("Name: ");
        labels.add("Employer: ");
        labels.add("Location: ");
        labels.add("Position Type: ");
        labels.add("Core Competency: ");

        ArrayList<String> fieldData = new ArrayList<>();
        fieldData.add(this.getName());
        fieldData.add(this.getEmployer().getValue());
        fieldData.add(this.getLocation().getValue());
        fieldData.add(this.getPositionType().getValue());
        fieldData.add(this.getCoreCompetency().getValue());

        for (int i = 0; i<labels.size(); i++) {
            if (fieldData.get(i).isBlank()) {
                jobListing += labels.get(i) + "Data not available\n";
            } else {
                jobListing += labels.get(i) + fieldData.get(i) + "\n";
            }
        }

        return  "\n"+ "ID: " + this.getId() + "\n" + jobListing;
    }

    //      custom equals and hashCode methods.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // getters and setters for each field EXCEPT nextID and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {

        return id;
    }
}

