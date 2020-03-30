/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{
    private List<Order> orders=new ArrayList<Order>();
    private List<Order> shoppingCarts=new ArrayList<Order>();
    
}
