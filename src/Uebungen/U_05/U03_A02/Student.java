package Uebungen.U_05.U03_A02;

public class Student {
    private String name;
    private String lastname;


    public Student(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
