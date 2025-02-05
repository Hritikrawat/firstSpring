package org.Ritik;

public class Student
{
    private int studentId;
    private String studentName;
    private String studentAddress;

    Student(){}
    public Student(int studentId, String studentName, String studentAddress)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
//        print this sout to confirm whether the setter injection is really wokring
//        System.out.println("Setting ID:");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
//          print this sout to confirm whether the setter injection is really wokring
//        System.out.println("Setting Name:");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
//      print this sout to confirm whether the setter injection is really wokring
//        System.out.println("Setting Address:");
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student { " +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
