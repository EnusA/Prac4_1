package com.EnusA.Prac4_1;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Unit test for simple App.
 */

public class AppTest  {
    @Test
    public void createStudent(){
        Student mark = new Student("Mark", "Nickel", 23, "mnickel@gmail.com",
                "2153659874", "ND IT");
        assertNotNull("Should be not null", mark.getStudentNo());
    }
    public void createLecturer(){
        Student mark = new Student("Taylor", "Jones", 35, "tjones@gmail.com",
                "23564", "ND IT");
        assertNotNull("Should be not null", mark.getStudentNo());
    }

}

