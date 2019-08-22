/*
Class: Student is a class that is used to hold student data
Victor Lazos-Aragon
Project #1
Windows 10 OS, Personal PC, jGrasp
Rambunctious: Uncontrollably exuberant; boisterous.
"Read a thousand books, and your words will flow like a river." - Lisa See (b. 1995)
*/

/**
* The Student class will construct valid student instances using data, allow retrieval of that data, 
* compare two instances of a Student object to check if they are the same, 
* and allow the a Student object to be displayed.
*
* @author Victor Lazos-Aragon
* @version 06/10/2019
*/

public class Student {

      private String studentid;     // Student's ID number
      private String studentfName;  // Student's First name
      private String studentlName;  // Student's Last name
      private String studenteMail;  // Student's Email address

// **********************************************************************  
      
/**
* Student constructor will first check parameter variables
* If they are all valid it will then assign them
* 
* @param id String Student id number
* @param fName String Student first name
* @param lName String Student last name
* @param eMail String Student email address
*/
      
   public Student(String id, String fName, String lName, String eMail) {
      
/* Ensures all variables are not null or empty */
      
         if (id == null || id.length() == 0) {
         
            throw new IllegalArgumentException("Student id: "+id+" is blank or null.");
            }  //End if
            
         if (fName == null || fName.length() == 0) {
         
            throw new IllegalArgumentException("Student first name: "+fName+" is blank or null.");
            }  //End if
            
         if (lName == null || lName.length() == 0) {
         
            throw new IllegalArgumentException("Student last name: "+lName+" is blank or null.");        
            }  //End if
            
         if (eMail == null || eMail.length() == 0) {
         
            throw new IllegalArgumentException("Student email address: "+eMail+" is blank or null.");
            } //End if
             
/* Ensures the email address variable contains an '@' character */
            
         if (!eMail.contains("@")) {
         
            throw new IllegalArgumentException("Student email address: "+eMail+" must contain an @ symbol.");
            }  //End else
      
      studentid = id;
      studentfName = fName;
      studentlName = lName;
      studenteMail = eMail;
      }
            
// **********************************************************************  

//Getter methods to retrieve private variables

/**
* getid method will return Student id number as a String
* 
* @return Student id number as String
*/ 
        
   public String getid() {
   
      return studentid;
      }
      
/**
* getfname method will return Student's first name as a String
* 
* @return Student's first name as String
*/
          
   public String getfName() {
   
      return studentfName;
      }
      
/**
* getlname method will return Student's last name as a String
* 
* @return Student's first name as String
*/
      
   public String getlName() {
   
      return studentlName;
      }
      
/**
* geteMail method will return Student's email address as a String
* 
* @return Student's email address as String
*/
      
   public String geteMail() {
   
      return studenteMail;
      }
      
// ********************************************************************** 

@Override
/** 
* 
* equals method will compare all the fields of two Student instances for equality
* I copied and modified this equals method from the Java All-in-One for Dummies book by Doug Lowe
*   
* @param obj Temporary Student object
* @return True if the two objects are equal in all fields, false if they are not
*/
         
   public boolean equals(Object obj) {
      
      Student student01 = (Student) obj;
      
      return   studentid.equals(student01.getid()) 
            && studentfName.equals(student01.getfName()) 
            && studentlName.equals(student01.getlName()) 
            && studenteMail.equals(student01.geteMail());
      }
      
// ********************************************************************** 

@Override
/* 
* 
* toString method will return String statements displaying Student information
* 
* @return String of four lines displaying Student id, first name, last name, and email address
*/

   public String toString() {
      
      return "Student ID: "+this.getid()
             +"\nStudent First Name: "+this.getfName()
             +"\nStudent Last Name: "+this.getlName()
             +"\nStudent Email Address: "+this.geteMail();
      }
      }