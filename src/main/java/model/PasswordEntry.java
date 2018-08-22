package model;

// kazdy obiekt tej klasy bedzie odpowiadal jednemu rekordowi zawierajacemu adres strony, haslo i login
// same dane

public class PasswordEntry {
    String website;
    String password;
    String login;

    public PasswordEntry(String website, String login, String password){
        this.login=login;
        this.password=password;
        this.website=website;
    }

    public String getWebsite() {
        return website;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        String information = "Password Entry: website: " + getWebsite()  + ", login: " + getLogin() + ", password: "
                + getPassword();
        System.out.println(information);
        return information;
    }

    public String toStringToFile(){
        String information =getWebsite() + ";" + getLogin() + ";" + getPassword();
        return information;
    }

    public String[] toArrayTest(){
        String[] arrayTest = new String[]{getWebsite(),getLogin(),getPassword()};
        return arrayTest;
    }
}
