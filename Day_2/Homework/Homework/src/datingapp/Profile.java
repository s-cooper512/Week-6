package datingapp;

public class Profile {
    private String profileName, profileDescription, hobby, likes;
    private int age;
    private boolean superUser;

    public Profile(String name, String description, String hobby, int age, String likes) {
        setProfileName(name);
        setProfileDescription(description);
        setHobby(hobby);
        setLikes(likes);
        setAge(age);
    }

    //getters
    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getLikes() {
        return likes;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public String getProfileName() {
        return profileName;
    }

    public boolean getSuperUser() {
        return superUser;
    }

    //setters

    private void setAge(int age) {
        this.age = age;
    }

    private void setHobby(String hobby) {
        this.hobby = hobby;
    }

    private void setLikes(String likes) {
        this.likes = likes;
    }

    private void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    private void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    private void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }
}
