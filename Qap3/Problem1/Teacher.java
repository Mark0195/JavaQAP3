package Problem1;

//public teacher that extends from Person
public class Teacher extends Person{
    protected String mySubject;
    protected double mySalary;

    //public super to get name, age, gender, subject and salary
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    //string to getSubject
    public String getSubject(){
        return mySubject;
    }
    
    //double to getsalary
    public double getSalary(){
        return mySalary;
    }
    
    //void to setSubject
    public void setSubject(String subject){
        mySubject = subject;
    }
    
    //void to setSalary
    public void setSalary(double salary){
        mySalary = salary;
    }

    //override to get super, subject and salary
    @Override
    public String toString(){
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}
