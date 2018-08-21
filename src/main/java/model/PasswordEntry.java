package model;

// kazdy obiekt tej klasy bedzie odpowiadal jednemu rekordowi zawierajacemu adres strony, haslo i login
// same dane

public class PasswordEntry {
    String website;
    String password;
    String login;

    public PasswordEntry(String website, String password, String login){
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
}
