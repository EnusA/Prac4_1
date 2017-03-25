package com.EnusA.Prac4_1;

/**
 * Created by enusa on 2017/03/25.
 */
public class Student extends Person{
    //AE
    private String studentNo;
    private String course;

    public Student (String nm, String snm, int ag, String mail, String studNo, String crs)
    {
        super(nm, snm, ag, mail);
                studentNo = studNo;
                course = crs;
    }

    public void setStudentNo(String studNo){studentNo = studNo;}
    public void setCourse(String crs){course = crs;}
    public String getStudentNo(){return studentNo;}
    public String getCourse(){return course;}

    public String output(){return info + "\nStudent Number: " + studentNo + "\nCourse: " + course;}
}
