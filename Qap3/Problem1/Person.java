package Problem1;

//public for Person
public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    //public to get name, age, gender
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    //string to getName
    public String getName(){
        return myName;
    }

    //int to getAge
    public int getAge(){
        return myAge;
    }

    //string to getGender
    public String getGender(){
        return myGender;
    }

    //void to setName
    public void setName(String name){
        myName = name;
    }

    //void to setAge
    public void setAge(int age){
        myAge = age;
    }

    //void to setGender
    public void setGender(String gender){
        myGender = gender;
    }

    //string to return name, age and gender
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
