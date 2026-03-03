package bai2;

class Student {
    private String id;
    private String name;
    private double gpa;
    public Student(String id, String name,double gpa) {
        {
            this.id = id;
            this.name = name;
            this.gpa = gpa;
        }
    }
        public String getid() {return id;}

        public String getname() {return name;}

        public double getGpa() {return gpa;}
        @Override
    public String toString() {
        return "ID: " + id + ", Ten: " + name + ", GPA: " + gpa;
    }
}































//

