package bai1;
public class Main {
    public static void main(String[] args) {
        StudentManager<Student> studentManager = new StudentManager<>();
        studentManager.add(new Student("SV10", "Nguyen Van C",  5.8));
        studentManager.add(new Student("SV20", "Tran Thi A", 8.7));
        studentManager.add(new Student("SV30", "Le Van B", 6.0));
        studentManager.add(new Student("SV69", "Nguyen Van D", 2.8));

        for (Student s : studentManager.getAll()) {
            System.out.println(s);
        }
    }
}