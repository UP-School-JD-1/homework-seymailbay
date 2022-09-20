package Arayüzler.ArayüzlerOdev1;

import java.util.Date;

public class UnderGraduateStudent implements Student {
    protected  String minor;


    public UnderGraduateStudent(int no, String name, int year, Date dob, String major) {
        super();
    }

    public void study() {
        System.out.println("Student is studying...");
    }

    @Override
    public void register() {
        System.out.println("Student registered. ");
    }

}
