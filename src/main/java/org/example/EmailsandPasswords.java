package org.example;

import java.util.HashMap;

public class EmailsandPasswords {
    HashMap<String, String> logininfo = new HashMap<String,String>();

    EmailsandPasswords(){
        logininfo.put("A","abc");
        logininfo.put("D","def");
        logininfo.put("G","ghi");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
