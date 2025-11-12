package övningarTDD;

import java.util.Locale;

public class User {
    String username;
    String password;
    String typeOfUser = "normal";
    int logInCount = 0;
    int solidus = 5;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        if (typeOfUser.equals("normal") || typeOfUser.equals("admin") || typeOfUser.equals("super")) {
            this.typeOfUser = typeOfUser;
        }
    }

    public void setUsername(String username) {
        if (username.length() >= 4) {
            this.username = username;
        }

    }

    public void setPassword(String password) {

        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!$#&]).{7,20}$")) {
            this.password = password;
        }
    }

    public int logIn() {
        logInCount++;
        solidus++;

        if (logInCount == 20 && !typeOfUser.equals("gold member")) {
            typeOfUser = "gold member";
            solidus += 20;
        }

        return solidus;
    }

    public int getLogInCount() {
        return logInCount;
    }

    public int getSolidus(){
        return solidus;

    }

    public void setSolidus(int solidus) {
        this.solidus = solidus;
    }


}
