/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.spring24.cs44542.sec01.eng01.s5732178eng01;

/**
* Class: 44542-01 Object-Oriented Programming
*
* @author Yogesh Ceemarla
* Description: Making sure everything works
* Due: 01/26/2024
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student, internet, or any other source.
* I will not share my source code with anyone under any circumstances.
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
  
