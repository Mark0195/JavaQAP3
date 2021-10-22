package Problem1;

//public student that extends from person
public class Student extends Person{
    protected String myIdNum;
    protected double myGPA;

    //public to get super of person, age, gender, idNum and gpa
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    //string to getIdNum
    public String getIdNum(){
        return myIdNum;
    }

    //double to getGPA
    public double getGPA(){
        return myGPA;
    }

    //void to setIdNum
    public void setIdNum(String idNum){
        myIdNum = idNum;
    }

    //void to setGpa
    public void setGPA(double gpa){
        myGPA = gpa;
    }

    //override to get super, idNum and gpa
    @Override
    public String toString(){
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
