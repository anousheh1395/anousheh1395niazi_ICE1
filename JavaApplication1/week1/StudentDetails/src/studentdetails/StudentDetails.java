/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetails;

/**
 *
 * @author anousheh
 */
public class StudentDetails {

    
    public static void main(String[] args) {
      Student[] StudentLst=new Student[3];
        
        Student s1=new Student("Sivagama",123);
        StudentLst[0]=s1;
        
        StudentLst[1]=new Student("amrit kaur",345);
        StudentLst[2]=new Student("Denbin",567);
        
        for(int i=0;i<StudentLst.length;i++)
        {
            System.out.println(StudentLst[i].getName() + StudentLst[i].getSid());
        }
        
        }
        
        }
    

