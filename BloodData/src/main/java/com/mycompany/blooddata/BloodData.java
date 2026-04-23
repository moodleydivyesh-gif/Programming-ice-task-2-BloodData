/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blooddata;

/**
 *
 * @author User
 */
public class BloodData {

//Declare fields
private String bloodType;
private String rhFactor;

//Default constructor
public BloodData(){
  this.bloodType = "O" ;
  this.rhFactor = "+";
}
//Parametised the constructor
public BloodData(String bloodType, String rhFactor){
    this.bloodType = "O" ;
  this.rhFactor = "+";

}
//Getters and setters 
public String getBloodType(){
  return bloodType;  
}
public void setBloodType(String bloodType){
this.bloodType = bloodType;
}

public String getRhFactor(){
 return rhFactor;   
}
public void setRhFactor(String rhFactor){
this.rhFactor = rhFactor;
}   
}
