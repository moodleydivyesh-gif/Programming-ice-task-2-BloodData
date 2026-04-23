/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blooddata;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TestBloodData {
 public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Enter blood type ( O , A , B , AB ) : ");
   
   String type = input.nextLine();
   
   System.out.print("Enter Rh factor (+ or -): ");
   
   String rh = input.nextLine();
  
   BloodData userBlood = new BloodData(type ,rh);
   
   BloodData defaultBlood = new BloodData();
   
   System.out.println(" \n Initial Values ");
   
   System.out.println(" User object : ");
   
   System.out.println(" BloodType " + userBlood.getBloodType());
   
   System.out.println(" Rh factor " + userBlood.getRhFactor());
   
   System.out.println(" \n Default object : ");
   
   System.out.println(" BloodType :" + userBlood.getBloodType());
   
   System.out.println(" Rh factor :" + userBlood.getRhFactor());
   
   System.out.println("\nDefault object "); 
   
   System.out.println("BloodType" + defaultBlood.getBloodType());
   
   System.out.println("Rh factor " + defaultBlood.getRhFactor());
   
   //Update default object 
   
   defaultBlood.setBloodType(type);
   defaultBlood.setRhFactor(rh);
   
   System.out.println("\n Update default object ");
   
   System.out.println(" Blood Type : " + defaultBlood.getBloodType());
   
   System.out.println(" Rh factor : " + defaultBlood.getRhFactor()); 
 }   
}
