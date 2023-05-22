package org.example;
import java.util.ArrayList;

enum GPA {
    APlus,
    A,
    AMinus,
    BPlus,
    B,
    BMinus,
    CPlus,
    C,
    CMinus,
    DPlus,
    D,
    F,
    UnavailableSmallerThanZ,
    UnavailableBiggerThanH
}

public class StudentData {
    private String name;
    private Boolean flag = false;
    private String id;

    private ArrayList<Double> marks;

    private GPA gpa;
    private double grade;

    StudentData() {
        this.grade = -1;
    }
    public StudentData(String name , String id, ArrayList<Double> marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.grade = -1;
        setDegree();
    }

    public GPA getGpa() {
        return gpa;
    }

    public double getGrade() {
        return grade;
    }

    private void setGpa() {
        this.gpa = GPACalculator.calcGPA(this.grade);
    }
    public void setGrade_flag(Boolean flag){
        this.flag = flag;
    }
    private void setGrade() {
        Double sum =0.0;
        for(int i =0 ;i < marks.size();i++)
        {
            sum+= marks.get(i);
        }
        this.grade = sum;
    }
    private void setDegree ()
    {
        setGrade();
        setGpa();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
        setDegree();
    }

    public String[] ToString() {
        if(this.flag == false){
            String [] s = new String[4];
            s[0]="";
            s[1]="";
            s[2]="";
            s[3]="";
            return s;
        }
        String [] s = new String[4];
        s[0]=name;
        s[1]=id;
        s[2]=getGpa().toString();
        s[3]=Double.toString(getGrade());
        return s;
    }
}
