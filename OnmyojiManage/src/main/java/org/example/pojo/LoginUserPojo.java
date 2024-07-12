package org.example.pojo;


public class LoginUserPojo {


    private String Login_User_Name;
    private String Login_User_Password;
    private String Login_User_Id;
    private String Login_User_Phone;


    public LoginUserPojo() {
    }

    public LoginUserPojo(String login_User_Name, String login_User_Password) {
        Login_User_Name = login_User_Name;
        Login_User_Password = login_User_Password;
    }

    public LoginUserPojo(String login_User_Name, String login_User_Password, String login_User_Id, String login_User_Phone) {
        Login_User_Name = login_User_Name;
        Login_User_Password = login_User_Password;
        Login_User_Id = login_User_Id;
        Login_User_Phone = login_User_Phone;
    }

    public String getLogin_User_Name() {
        return Login_User_Name;
    }

    public void setLogin_User_Name(String login_User_Name) {
        Login_User_Name = login_User_Name;
    }

    public String getLogin_User_Password() {
        return Login_User_Password;
    }

    public void setLogin_User_Password(String login_User_Password) {
        Login_User_Password = login_User_Password;
    }

    public String getLogin_User_Id() {
        return Login_User_Id;
    }

    public void setLogin_User_Id(String login_User_Id) {
        Login_User_Id = login_User_Id;
    }

    public String getLogin_User_Phone() {
        return Login_User_Phone;
    }

    public void setLogin_User_Phone(String login_User_Phone) {
        Login_User_Phone = login_User_Phone;
    }

    @Override
    public String toString() {
        return "LoginUserPojo{" +
                "Login_User_Name='" + Login_User_Name + '\'' +
                ", Login_User_Password='" + Login_User_Password + '\'' +
                ", Login_User_Id='" + Login_User_Id + '\'' +
                ", Login_User_Phone='" + Login_User_Phone + '\'' +
                '}';
    }
}