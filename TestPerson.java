/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4inher;

import week4testna.Student;


/**
 *
 * @author INT105
 */
public class TestPerson {
    public static void main(String args[]){
       // Person p1 = new Person("ggt", 41515, "ggyguy");
        //System.out.println(p1);
        Student s1 = new Student(3.06,"kantarat",12,"eiei");
        s1.Grade();
        System.out.println("Student 1 "+s1);
        Student s2 = new Student(3.60,"kantarat",12,"eiei");
        s2.Grade();
        System.out.println("Student 2 "+s2);
    }
}
