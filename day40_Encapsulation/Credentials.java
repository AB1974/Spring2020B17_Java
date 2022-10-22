package day40_Encapsulation;

public class Credentials {

    private String UserName;
    private String PassWord;

    public String getUserName() {
        return UserName;//return private instance variable
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;//return private instance variable
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

}
