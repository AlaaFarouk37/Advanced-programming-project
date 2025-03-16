
package com.mycompany.project;


public class Linked_List {
    public Node head;
    
    
      public void add(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
      
      
      public Student search_using_id(int id){
          Node c = head;
          while(c != null){
              if (c.student.Student_ID == id){
               return c.student;   
              }
              c = c.next;
          }
         return null; 
      }

    // Method to print all nodes in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.student.Student_ID+"   "+current.student.First_name+ "   "+ current.student.Status );
            current = current.next;
        }
    }
        
    
}
