package com.example;

public class Lecturer {
    // instance variables
    private String name;
    private int extensionNumber, officeNumber;

    // Constructor
    public Lecturer(String lectName, int lectOfficeNo, int lectExtensionNo)
    {
        name = lectName; officeNumber = lectOfficeNo; extensionNumber = lectExtensionNo;

    }
    // Methods
    public String getName() {return name;}
    public int getExtensionNumber()    {return extensionNumber;}
    public int getOfficeNumber()     {return officeNumber;}
    public void setName(String newName) {name = newName;}
    public void setExtensionNumber(int newExtensionNumber) {extensionNumber = newExtensionNumber;}
    public void setOfficeNumber (int newOfficeNumber)    {officeNumber = newOfficeNumber;}

    public String teachStudents(String subject, int noStudents, String sessionDay, String sessionTime)

    { String teachString; teachString = name + " teaches " + subject; teachString = teachString + " to " + noStudents;
        teachString += " on " + sessionDay + " at " + sessionTime;
        return teachString;}
}
