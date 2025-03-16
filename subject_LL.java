/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Alaa Farouk
 */
public class subject_LL {
        
    public subject_Node head;
        
    public void add(Subject subject) {
        subject_Node newNode = new subject_Node(subject);
        if (head == null) {
            head = newNode;
        } else {
            subject_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
     public void printList() {
        subject_Node current = head;
        while (current != null) {
            System.out.println(current.subject.Subject_Name);
            current = current.next;
        }
    }
}
