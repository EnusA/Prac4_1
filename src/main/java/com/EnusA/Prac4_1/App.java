package com.EnusA.Prac4_1;

/**
 * Hello world!
 *
 */
public class App 
{
    //AE
    public static void main (String []args)
    {
        String stud1;
        Student s = new Student("John", "Egbert", 16, "jegbert@mail.com", "2369874512", "Film");
        System.out.println(s.output());
        Lecturer l = new Lecturer("Jade", "Harley", 26, "jharley@mymail.com", "369214", "Agriculture");
        System.out.println(l.display());
    }


}
