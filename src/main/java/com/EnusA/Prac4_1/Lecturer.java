package com.EnusA.Prac4_1;

/**
 * Created by enusa on 2017/03/25.
 */
public class Lecturer {
    //GM
    protected String lecturerId;
    protected String subject;

    public Person p;

    public Lecturer(String nm, String snm, int a, String mail, String lecId, String sub)
    {
        p = new Person(nm, snm, a, mail);
        lecturerId = lecId;
        subject = sub;
        p.myString();
    }

    public void setLecturerId(String lecID){lecturerId = lecID;}
    public void setSubject(String sub){subject = sub;}
    public String getLecturerId(){return lecturerId;}
    public String getSubject(){return subject;}

    public String display()
    {
        return (p.info + "\nLecturer ID: " + lecturerId + "\nSubject: " + subject);
    }

}
