package domain;

public class Actor {
    private int actorID;
    private String firstName;
    private String lastName;
    private String nationality;

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Actor(int actorID, String firstName, String lastName, String nationality) {
        this.actorID = actorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }
}