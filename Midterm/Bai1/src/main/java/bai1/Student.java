package bai1;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getid() {return this.id;}

    public String getname() {return this.name;}

    public double getGpa() {return this.gpa;}

    public String toString() {
        return "ID: " + this.id + ", Ten: " + this.name + ", GPA: " + this.gpa;
    }
}
