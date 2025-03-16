
package com.mycompany.project;

/**
 *
 * @author Alaa Farouk
 */
public class Student {

    int Student_ID;
    String First_name;
    String Last_Name;
    int level;
    String Semester;
    String Status;
    Exam_LL exams;
    subject_LL subjects;
    Grade total_grades;

    public Student() {
        exams = new Exam_LL();
        subjects = new subject_LL();
    }

    public Student(int id, String Fname, String Lname, int level, String Semester, String Status) {
        Student_ID = id;
        First_name = Fname;
        Last_Name = Lname;
        this.level = level;
        this.Semester = Semester;
        this.Status = Status;
    }

    void addExam(Exam ex) {
        ex.Exam_Taker = this;
        exams.add(ex);

    }

    public void addSubject(Subject s) {
        subjects.add(s);
        s.addStudent(this);
    }
    
    public void set_sujects_acc_level(){
       switch (level) {
           case 1:
               subjects.add(new Subject("Intro to Computer", 123));
               subjects.add(new Subject("Math 1", 111));
               subjects.add(new Subject("Physics", 332));
               subjects.add(new Subject("Human Rights", 444));
               break;
               
           case 2:
               subjects.add(new Subject("Advaced Physics", 265));
               subjects.add(new Subject("Programming 1", 898));
               subjects.add(new Subject("Math 2", 222));
               subjects.add(new Subject("Presentaiton skills", 999));
               break;
               
           case 3:
               subjects.add(new Subject("programming 2", 412));
               subjects.add(new Subject("Number Theory", 369));
               subjects.add(new Subject("Networks", 564));
               subjects.add(new Subject("Database Systems", 1010));
               break;
              
           case 4:
               subjects.add(new Subject("Software Engineering", 80));
               subjects.add(new Subject("Data Science", 365));
               subjects.add(new Subject("Artificial intelligence", 100));
               subjects.add(new Subject("Communication skills", 101));
               break;
              
           default:
               subjects.add(new Subject("Default Subject", 1));
               break;
       }
    }
    
    public void link_student_to_exam(){
     
        subject_Node current = this.subjects.head;
        while(current != null){
            exams.concat(current.subject.tests);
            current = current.next;
        }
        
    }
}
