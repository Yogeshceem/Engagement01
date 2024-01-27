/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.spring24.cs44542.sec01.eng01.s5732178eng01;

/**
 *
 * @author S572178
 */
import java.util.*;

public class S5732178Eng01 {
    
    private String firstName;
    private String lastName;
    private double salPerAnnum;
    private static final double BONUS_PERCENTAGE = 10.80;
    
    public S5732178Eng01(String firstName, String lastName, double salPerAnnum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salPerAnnum = salPerAnnum;
    }
    
    public final double calculateBonus() {
        return (this.salPerAnnum * BONUS_PERCENTAGE) / 100;
    }

   
    public String toString() {
        return firstName +" "+ lastName  +
                " Bonus amount per annum is " + String.format("%.02f", calculateBonus());
    }
    
}
  
