/**
*The GradeItem class will construct valid grade item instances using data, allow retrieval of that data, 
*compare two instances of a GradeItem object to check if they are the same, 
*and allow a GradeItem object to be displayed.
*
*@author Victor Lazos-Aragon
*@version 06/01/2019
*/

import java.util.Arrays;
import java.util.List;

public class GradeItem {
   
      private String gradeItemStudentid; // Student ID number
      private int gradeItemid;           //Unique Grade Item ID number
      private String gradeItemcourseid;  //Course ID number
      private String gradeItemType;      //Grade Item Type: HW, Quiz, Class Work, Test, or Final
      private String gradeItemDate;      //Grade Item Date with format: yyyymmdd
      private int maximumScore;          //Maximum score that must be greater than zero
      private int actualScore;           //Actual score that must be between 0 and maximum score
      private String[] gradeItemTypeArray = new String[] {"HW",      "Quiz", 
                                                          "Class Work",       "Test", 
                                                          "Final"    };  /*Instanciated array that 
                                                                         holds Grade Item types*/
                                                                         
// **********************************************************************  

/**
* GradeItem constructor will first check parameter variables
* If they are all valid it will then assign them
*
* @param studentid String Student id number
* @param gradeid int Unique grade item id number
* @param courseid String Course id number
* @param gradetype String Grade type of HW, Quiz, Class Work, Test, or Final
* @param gradedate String Grade date in format yyyymmdd
* @param maxscore int Maximum possible score
* @param actscore int Actual given score
*/
   public GradeItem(String  studentid, 
                    int gradeid, 
                    String courseid, 
                    String gradetype, 
                    String gradedate, 
                    int maxscore, 
                    int actscore) {
  
/* Ensures all String variables are not null or empty */
   
         if (studentid == null || studentid.length() == 0) {
         
            throw new IllegalArgumentException("Student id: "+studentid+" is blank or null.");
            }  //End if
            
         if (courseid == null || courseid.length() == 0) {
     
            throw new IllegalArgumentException("Course id: "+courseid+" is blank or null.");
            }  //End if
            
         if (gradetype == null || gradetype.length() == 0) {
         
            throw new IllegalArgumentException("Item type: "+gradetype+"is blank or null.");
            }  //End if
             
         if (gradedate == null || gradedate.length() == 0) {
         
            throw new IllegalArgumentException("Date: "+gradedate+" is blank or null.");
            }  //End if

/* Ensures Grade Item id and the maximum score are not negative or 0 */  
              
         if (gradeid <= 0) {
         
            throw new IllegalArgumentException("The id for this grade item: "+gradeid+" is invalid.");
            }  //End if
              
         if (maxscore <= 0) {
            
            throw new IllegalArgumentException("Maximum score: "+maxscore+" is null, less than zero, or 0.");         
            }  //End if

/* Ensures actual score is between 0 and maximum score */
            
         if (actscore < 0 || actscore > maxscore) {
         
            throw new IllegalArgumentException("Actual score: "+actscore+" is null or outside the range of 0 to maximum score: "+maxscore+".");
            }  //End if
                             

   
/*Ensures the Grade Item type is a valid by scanning through the array
  Does nothing if the type is valid, otherwise an exception is thrown
*/
         List<String> list = Arrays.asList(gradeItemTypeArray); 
                          
         if (list.contains(gradetype)) {
            }  //End if
         
         else{
         
            throw new IllegalArgumentException("This grade item type: "+gradetype+" is invalid.");
            }  //End else 
            
   gradeItemStudentid = studentid;
   gradeItemid = gradeid;
   gradeItemcourseid = courseid;
   gradeItemType = gradetype;
   gradeItemDate = gradedate;
   maximumScore = maxscore;
   actualScore = actscore;
   }
            
// **********************************************************************  

/**
* getstudentid method will return Student id number as a String
* 
* @return Student id number as String
*/   
            
   public String getstudentid(){
   
      return gradeItemStudentid;
      }

/**
* getgradeid method will return unique Grade id number as an integer
* 
* @return Grade id number as int
*/   
         
   public int getgradeid(){
   
      return gradeItemid;
      }
      
/**
* getcourseid method will return Course id number as a String
* 
* @return Course id number as String
*/    
    
   public String getcourseid(){
   
      return gradeItemcourseid;
      }
      
/**
* getgradetype method will return Grade type as a String
* 
* @return Grade type as String
*/       
   public String getgradetype(){
   
      return gradeItemType;
      }
      
/**
* getgradedate method will return Grade date as a String
* 
* @return Grade date as String
*/ 
         
   public String getgradedate(){
   
      return gradeItemDate;
      }
      
/**
* getmaxscore method will return maximum score as an integer
* 
* @return Maximum score as int
*/     
      
   public int getmaxscore(){
   
      return maximumScore;
      }
      
/**
* getactscore method will return actual score as an integer
* 
* @return Actual score as int
*/       
   public int getactscore(){
   
      return actualScore;
      }
      
// **********************************************************************  

@Override
/** 
* equals method will compare all the fields of two GradeItem instances for equality
* I copied and modified this equals method from the Java All-in-One for Dummies book by Doug Lowe
*   
* @param obj Temporary GradeItem object
* @return True if the two objects are equal in all fields, false if they are not
*/     
      
   public boolean equals(Object obj){
      
      GradeItem student01 = (GradeItem) obj;
      
      return gradeItemStudentid.equals(student01.getstudentid()) 
             && gradeItemid == student01.getgradeid()
             && gradeItemcourseid.equals(student01.getcourseid()) 
             && gradeItemType.equals(student01.getgradetype())
             && gradeItemDate.equals(student01.getgradedate())
             && maximumScore == student01.getmaxscore()
             && actualScore == student01.getactscore();
      }

// ********************************************************************** 

@Override
/* 
* 
* toString method will return String statements displaying Student information
* 
* @return String of seven lines displaying Student id, unique Grade id, Course id,
* Grade type, Grade date, Maximum score, and Actual score
*/
     
      public String toString(){
      
      return "Student ID: "+this.getstudentid() 
             +"\nGrade ID: "+this.getgradeid() 
             +"\nCourse ID: "+this.getcourseid() 
             +"\nGrade type: "+this.getgradetype() 
             +"\nGrade date: "+this.getgradedate() 
             +"\nMaximum score: "+this.getmaxscore() 
             +"\nActual score: "+this.getactscore();
      }
public static void main(String[] args) {
         GradeItem veronicas = new GradeItem("900501", 55, "Math", "HW", "185665", 61, 32);
         GradeItem victors = new GradeItem("900501", 55, "Math", "Quiz", "185665", 61, 32);
         System.out.println(veronicas.toString());
         System.out.println(veronicas.equals(victors));
      }
      }