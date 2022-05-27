public class Student {
    private String name;
    private int rollno; //binding od data with methods is called encapsulation
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getRollno()
    {
        return rollno;
    }
}
