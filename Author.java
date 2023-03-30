public class Author {
    String email; String name; char gender;

    public Author(String newName, String newEmail, char newGender){
        email = newEmail; name = newName; gender = newGender;
    }
    public String getEmail(){
        return email;
    }
    public String getName(){return name;}
    public char getGender(){return gender;}

    public void setEmail(String newemail){
        email = newemail;
    }
    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}
