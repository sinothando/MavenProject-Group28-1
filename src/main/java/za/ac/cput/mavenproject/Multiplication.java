/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenproject;

/**
 *
 * @author Lenovo
 * 216250811
 */
public class Multiplication {
    private int number1;
    private int number2;
    
    
    public Multiplication (int number1, int number2)
    {
        this.number1 = number1;
        this.number2 = number2;
        
}
 
    public int getNumber1()
    {
        return number1;
    }

    public void setNumber1(int number1)
    {
        this.number1= number1;
    }
public int getNumber2()
    {
        return number2;
    }

    public void setLast_name(String last_name)
    {
        this.number2 = number2;
    }

     @Override
    public String toString()
    {
        return "Multiplication{" + "number1=" + number1 + 
                ", number2=" + number2 + '}';
    }
}

