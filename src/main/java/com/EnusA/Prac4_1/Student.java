package com.EnusA.Prac4_1;

/**
 * Created by enusa on 2017/03/25.
 */
public class Student{
    //AE
    private String studentNo;
    private String course;

    public Person per;

    public Student (String nm, String snm, int ag, String mail, String studNo, String crs)
    {
        per = new Person(nm, snm, ag, mail);
                studentNo = studNo;
                course = crs;
                per.myString();
    }

    public void setStudentNo(String studNo){studentNo = studNo;}
    public void setCourse(String crs){course = crs;}
    public String getStudentNo(){return studentNo;}
    public String getCourse(){return course;}

    public String output(){return per.info + "\nStudent Number: " + studentNo + "\nCourse: " + course;}
}
