/*
 *  Harpreet Ghuman.
 *  SID 991543936
 *  
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Administrator
 */
public class StudentTester {
    public static void main(String[]args)
    {
        //array of objects
        Student[] studentList=new Student[3];
        
        //object of studen class
        Student s1 = new Student("Harpreet", 347);
        
        //populting array of object
        studentList[0] = s1;
        studentList[1] = new Student ("Leo", 123);
        studentList[2] = new Student ("Sheetal", 111);
        
        for (int i=0; i<studentList.length; i++)
        {
            System.out.println(studentList[i].getName()+ " "+ studentList[i].getID());
        }
        
        
    }
}
