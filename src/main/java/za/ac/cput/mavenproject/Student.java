
package za.ac.cput.mavenproject;

//@author 220296006

  
public class Student {

    private String _name;
    private int _grade;
    
    public Student(String name, int grade) {
        this._grade = grade;
        this._name = name;
    }
    
    public String Name() {
        return this._name;
    }
    
    public int Grade() {
        return this._grade;
    }
}
