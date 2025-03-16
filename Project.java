/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Alaa Farouk
 */
public class Project {
    
   static Linked_List recorded_students = new Linked_List();
   boolean stop = false;
   

    public Project(){
      new createGUI();
    }
    
    
    public class createGUI extends JFrame implements ActionListener {
        
        JFrame frame,studentFrame,gradesFrame; 
        JMenuBar menuBar;
        JMenu studentMenu,gradesMenu;
        JMenuItem addStudent,displayGrades;
        JPanel studentPanel,gradesPanel;
        JLabel l1,l2,l3,l4,l5,l6,gl0,gl1,gl2;
        JTextField t1,t2,t3,t4,t5,t6,gt0,gt1;
        JPanel p1,p2,p3,p4,p5,p6,p7;
        JButton recordStdButton,stopRecord,enterID,showInfo;
        Student x;

    
        public createGUI(){
            
        x = new Student();   
        frame = new JFrame("Student Grading System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setBackground(Color.LIGHT_GRAY);
        //creating the menubar
        menuBar = new JMenuBar();
        studentMenu = new JMenu("Student");
        addStudent = new JMenuItem("Add Student Records");
        studentMenu.add(addStudent);
        gradesMenu = new JMenu("Grade");
        displayGrades = new JMenuItem("Display Grades");
        gradesMenu.add(displayGrades);
        menuBar.add(studentMenu);
        menuBar.add(gradesMenu);
        //Designing the menuBar
        studentMenu.setForeground(Color.DARK_GRAY);
        studentMenu.setFont(new Font("myFont",Font.BOLD + Font.ITALIC,20));
        gradesMenu.setForeground(Color.DARK_GRAY);
        gradesMenu.setFont(new Font("myFont",Font.BOLD + Font.ITALIC,20));
        //setting the menuBar of the frame
        frame.setJMenuBar(menuBar);
        
        // -----------------------------------------------------------------------------------------//
        // Creating the student frame //
        studentFrame = new JFrame("Record a student");
        studentPanel = new JPanel( new GridLayout(6,2));
        studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentFrame.setVisible(false);
        studentFrame.setLocationRelativeTo(frame);
        studentFrame.setSize(500, 500);
        studentFrame.setBackground(Color.LIGHT_GRAY);
        studentFrame.add(studentPanel);
        
        p1 = new JPanel(); p2 = new JPanel(); p3 = new JPanel(); p4 = new JPanel(); p5 = new JPanel(); p6 = new JPanel(); p7 = new JPanel(); 
        l1= new JLabel("First Name");
        l2= new JLabel(" Last Name");
        l3= new JLabel("Student ID");
        l4= new JLabel("Level");
        l5= new JLabel("Semester");
        l6= new JLabel("Status");
        t1=new JTextField(20); t2=new JTextField(20); t3=new JTextField(20); t4=new JTextField(20); t5=new JTextField(20); t6=new JTextField(20);
        recordStdButton= new JButton("Enter");
        stopRecord = new JButton("Stop");
        t3.setEditable(true);
        p1.add(l1);
        p1.add(t1);
        
        p2.add(l2);
        p2.add(t2);
        
        p3.add(l3);
        p3.add(t3);
        
        p4.add(l4);
        p4.add(t4);
        
        p5.add(l5);
        p5.add(t5);
        
        p6.add(l6);
        p6.add(t6);
        p7.add(recordStdButton);
        p7.add(stopRecord);
        studentPanel.add(p1); studentPanel.add(p2); studentPanel.add(p3); studentPanel.add(p4); studentPanel.add(p5); studentPanel.add(p6);studentPanel.add(p7);
       
        //-----------------------------------------------------------------------------------//
        //creating grades frame
        gradesFrame = new JFrame("Grades");
        gradesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gradesFrame.setVisible(false);
        gradesFrame.setLocationRelativeTo(frame);
        gradesFrame.setSize(1000, 500);
        gradesFrame.setBackground(Color.LIGHT_GRAY);   
    
        gradesPanel = new JPanel();
     

        showInfo = new JButton("Show subjects and exams");
        gl0 = new JLabel("Enter Student ID");
        gt0 = new JTextField();
        gt0.setPreferredSize(new Dimension(50,50));
        enterID= new JButton("Enter");
        gradesPanel.add(gl0); gradesPanel.add(gt0); gradesPanel.add(enterID); gradesPanel.add(showInfo);
        gradesFrame.add(gradesPanel);
        //-----------------------------------------------------------------------------------//
       
        //-----------------------------------------------------------------------------------//
        // Event Handling //
        
        addStudent.addActionListener(this);
        recordStdButton.addActionListener(this);
        stopRecord.addActionListener(this);
        displayGrades.addActionListener(this);
        enterID.addActionListener(this);
        showInfo.addActionListener(this);

       } 
        
        

        @Override
        public void actionPerformed(ActionEvent e) { 
            if (e.getSource() == addStudent){
                studentFrame.setVisible(true);
            }
            else if (e.getSource() == recordStdButton && !stop){
                record_student();   
            }
            else if(e.getSource() == stopRecord){
                stop=true;
                recorded_students.printList();
            }
            else if (e.getSource() == displayGrades){
                gradesFrame.setVisible(true);
            }
            else if(e.getSource() == enterID){
            int id = Integer.parseInt(gt0.getText());
             x=recorded_students.search_using_id(id);
            }
            else if(e.getSource() == showInfo){
            x.subjects.printList();
           
            x.exams.printList();
             
             
            }
        
        }
   
    
        public void record_student(){
        Student std = new Student();
        std.First_name=t1.getText();
        std.Last_Name=t2.getText();
        std.Student_ID=Integer.parseInt(t3.getText());
        std.level=Integer.parseInt(t4.getText());
        std.Semester=t5.getText();
        std.Status=t6.getText();
        //--record subjects
        std.set_sujects_acc_level();
        //----recoded exams
       subject_Node current = std.subjects.head;
       while (current != null){
        current.subject.set_exams_acc_subject();
        std.exams.concat(current.subject.tests);
         current = current.next;
       }
        //------------------
        recorded_students.add(std);
        //reset all text fields to blank
            t1.setText("");
            t2.setText("");
            t5.setText("");
            t6.setText("");
        
    }
    }
               public static void main(String[] args) {
        Project project = new Project();
    }
}
    
   
    
    
    
 


    
    
  

