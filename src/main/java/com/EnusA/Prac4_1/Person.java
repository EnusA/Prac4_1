package com.EnusA.Prac4_1;

/**
 * Created by enusa on 2017/03/25.
 */
public class Person {
    //AE
    private String name;
    private String surname;
    private int age;
    private String email;
    public String info;

    public Person(String nm, String snm, int ag, String mail){
        name = nm;
        surname = snm;
        age = ag;
        email = mail;
    }

    public void setName(String nm){name = nm;}
    public void setSurname(String snm){surname = snm;}
    public void setAge(int ag){age = ag;}
    public void setEmail(String mail){email = mail;}
    public String getName(){return name;}
    public String getSurname(){return surname;}
    public int getAge(){return age;}
    public String getEmail(){return email;}
    public void myString(){info = "Name & Surname: " + name + " " + surname + "\nAge: " + age
            + "\nEmail Address: " + email;}
}
