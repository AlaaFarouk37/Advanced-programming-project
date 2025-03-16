/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Alaa Farouk
 */
public class Grade implements Grade_Calculator {
    
    Exam exam;
    double score;
    double percentage;
    char letter_grade;
    
    
    public Grade(double score){
        
     
        this.set_score(score);
        this.set_percentage();
        this.set_letter_grade();
    }
    
    @Override
    public void set_score(double s) {
       score = s;
    }

    @Override
    public void set_percentage() {
        percentage= score/30 * 100;
    }

    @Override
    public void set_letter_grade() {
        
        if(percentage > 90.0){
         letter_grade='A';
        } 
        else if (percentage > 80.0){
         letter_grade='B';  
        }
        else if (percentage > 70.0){
         letter_grade='C';  
        }
        else if (percentage > 60.0){
         letter_grade='D';  
        }
        else{
         letter_grade = 'F';   
        }
    
    }
    

    
  
    
}
