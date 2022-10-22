package day46_final_abstract;

public class credentials {


    final private String userName = "Cybertek";
    final private String passWord = "CyberTek12345";

    public String getUserName() {
        return userName;
    }
//
//    public void setUserName(String userName) { you can not create setter because data is final
//        this.userName = userName;
//    }

    public String getPassWprd() {
        return passWord;
    }

//    public void setPassWord(String passWord) { you can not create setter because data is final
//        this.passWord = passWord;
//    }
}
