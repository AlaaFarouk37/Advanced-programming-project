/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Alaa Farouk
 */
public class Subject {
    
    
    String Subject_Name;
    int Subject_ID;
    int weight;
    Linked_List students;
    Exam_LL tests;
    
    public Subject(String n, int i){
        Subject_Name=n;
        Subject_ID=i;
        students = new Linked_List();
        tests= new Exam_LL();
    }
    
    
    public void addStudent(Student student) {        
        students.add(student);
        student.addSubject(this);
    }
     
    public void addExam(Exam ex){
        ex.subject=this;
        tests.add(ex);   
    }
    
    public void set_exams_acc_subject(){
    
        int id = Subject_ID;
        
        if(id == 123){
            addExam(new Exam("Quiz","2024-03-07"));
            addExam(new Exam("Midterm","2024-05-01"));
        }else if (id == 111 ){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        }else if (id == 332 ){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Final","2024-03-27"));
        }else if (id == 444 ){
            addExam(new Exam("Final","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        }else if (id == 265 ){
            addExam(new Exam("Quiz","2024-01-25"));
           addExam(new Exam("Quiz","2024-03-22"));
        
        }else if (id == 898 ){
            addExam(new Exam("Final","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        
        }else if (id == 222 ){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        
        }else if (id == 999 ){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
       
        }else if (id == 412 ){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Quiz","2024-03-22"));
        
        }else if (id == 369 ){
            addExam(new Exam("Final","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        
        }else if (id == 564 ){
            addExam(new Exam("Quiz","2024-01-25"));
           addExam(new Exam("Final","2024-03-22"));
        
        }else if (id == 1010 ){
            addExam(new Exam("Quiz","2024-01-25"));
           addExam(new Exam("Final","2024-03-22"));
        
        }else if (id == 80){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Final","2024-03-22"));
        
        }else if (id == 365 ){
           addExam(new Exam("Final","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        
        }else if (id == 100 ){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Final","2024-03-22"));
        
        }else if (id == 101){
            addExam(new Exam("Quiz","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        
        }else if (id == 1 ){
            addExam(new Exam("Final","2024-01-25"));
            addExam(new Exam("Midterm","2024-03-22"));
        }
        
        
    }
    
    
    
}
