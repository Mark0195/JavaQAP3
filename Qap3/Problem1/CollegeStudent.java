package Problem1;

//public extends from student
public class CollegeStudent extends Student{
    protected String myMajor;
    protected int myYear;
    
    //public to get super, major and year
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year){
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }

    //string to getMajor
    public String getMajor(){
        return myMajor;
    }
    
    //int to getYear
    public int getYear(){
        return myYear;
    }

    //void to setMajor
    public void setMajor(String major){
        myMajor = major;
    }
    
    //void to setYear
    public void setYear(int year){
        myYear = year;
    }

    //override to get super, major and year
    @Override
    public String toString(){
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
}
