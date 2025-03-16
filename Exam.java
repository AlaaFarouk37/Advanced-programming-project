/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;



/**
 *
 * @author Alaa Farouk
 */
public class Exam {
    
    String Exam_Type;

    String date;
    Subject subject;
    Grade grade;
    Student Exam_Taker;
    static int Paper_ID=0;
    
    public Exam(String type, String date){
        Paper_ID= ++Paper_ID;
        Exam_Type= type;
        this.date= date;

    }
    
    
    void addGrade(Grade gr){
        gr.exam=this;
        grade=gr;   
    }
    
    
    
       
    
    
    
    
}
