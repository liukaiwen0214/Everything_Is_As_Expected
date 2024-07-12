package org.example.pojo;


public class LoginUserPojo {

    private int login_User_Id;
    private String login_User_Name;
    private String login_User_Password;
    private String login_User_Phone;


    public LoginUserPojo() {
    }

    public LoginUserPojo(int login_User_Id, String login_User_Name, String login_User_Password, String login_User_Phone) {
        this.login_User_Id = login_User_Id;
        this.login_User_Name = login_User_Name;
        this.login_User_Password = login_User_Password;
        this.login_User_Phone = login_User_Phone;
    }

    public int getLogin_User_Id() {
        return login_User_Id;
    }

    public void setLogin_User_Id(int login_User_Id) {
        this.login_User_Id = login_User_Id;
    }

    public String getLogin_User_Name() {
        return login_User_Name;
    }

    public void setLogin_User_Name(String login_User_Name) {
        this.login_User_Name = login_User_Name;
    }

    public String getLogin_User_Password() {
        return login_User_Password;
    }

    public void setLogin_User_Password(String login_User_Password) {
        this.login_User_Password = login_User_Password;
    }

    public String getLogin_User_Phone() {
        return login_User_Phone;
    }

    public void setLogin_User_Phone(String login_User_Phone) {
        this.login_User_Phone = login_User_Phone;
    }

    @Override
    public String toString() {
        return "LoginUserPojo{" +
                "login_User_Id=" + login_User_Id +
                ", login_User_Name='" + login_User_Name + '\'' +
                ", login_User_Password='" + login_User_Password + '\'' +
                ", login_User_Phone='" + login_User_Phone + '\'' +
                '}';
    }
}