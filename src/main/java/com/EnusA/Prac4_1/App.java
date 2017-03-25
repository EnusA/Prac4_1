package com.EnusA.Prac4_1;

/**
 * Hello world!
 *
 */
public class App 
{
    //GM
    public static void main (String []args)
    {
        String stud1;
        Student s = new Student("Jerry", "Fisherman", 20, "jfay@mail.com", "123abc", "IT");
        System.out.println(s.output());
        Lecturer l = new Lecturer("James", "Adams", 45, "jadams@mymail.com", "ja456", "IT");
        System.out.println(l.display());
    }


}
