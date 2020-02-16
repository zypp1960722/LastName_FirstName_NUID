/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User{
    private String date;
    public Customer(String password,String username)
    {
        super(password,username,"CUSTOMER");
        Date now=new Date();
        date=now.toString();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    @Override
    public boolean verify(String password) {
        if(password.equals(super.getPassword()))
            return true;
        else
            return false;
    }
    
}
