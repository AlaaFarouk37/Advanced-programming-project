/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Alaa Farouk
 */
public class Exam_LL {
    public Exam_Node head;
    
       public void add(Exam exam) {
        Exam_Node newNode = new Exam_Node(exam);
        if (head == null) {
            head = newNode;
        } else {
            Exam_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        
       }
        
         public void concat(Exam_LL otherList) {
        if (head == null) {
            head = otherList.head;
        } else {
            Exam_Node current = head;
            // Traverse to the end of the current list
            while (current.next != null) {
                current = current.next;
            }
            // Link the end of current list to the head of the other list
            current.next = otherList.head;
        }
    }
         
          public void printList() {
        Exam_Node current = head;
        
        while (current != null) {
            Grade gr = new Grade((int) (100* Math.random())% 30);
            current.exam.addGrade(gr);
            System.out.println(current.exam.Exam_Type + "  GRADE:  "+gr.letter_grade);
            current = current.next;
        }
         
         
          }      
         
}

   
          
          
    

