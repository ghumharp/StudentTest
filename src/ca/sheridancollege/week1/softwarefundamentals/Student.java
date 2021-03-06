/*
 *  Harpreet Ghuman.
 *  SID 991543936
 *  
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * January, 25 2019
 * @author Administrator
 */
public class Student {

    /**
     * Model class student
     * having name, ID
     */
    private String name;
    private int ID;
    private String Program;
    
    public Student(String givenName, int givenID)
    {
        name=givenName;
        ID=givenID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int givenID) {
        ID = givenID;
    }

    /**
     * @return the Program
     */
    public String getProgram() {
        return Program;
    }

    /**
     * @param Program the Program to set
     */
    public void setProgram(String Program) {
        this.Program = Program;
    }
    
}
