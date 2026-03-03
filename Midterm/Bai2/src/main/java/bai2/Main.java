package bai2;
import java.util.List;
import java.util.concurrent.CompletableFuture;
public class Main {

    public static CompletableFuture<Double> calculateAverageGpa(List<Student> students) {

        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return students.stream()
                        .mapToDouble(Student::getGpa)
                        .average()
                        .orElse(0.0);
            } catch (InterruptedException e) {
                throw new RuntimeException("Loi khi sleep", e);
            }
        });
    }
    static void main(String[] args) {

        StudentManager<Student> studentManager = new StudentManager<>();

        studentManager.add(new Student("SV01", "Nguyen Van C", 8.5));
        studentManager.add(new Student("SV02", "Tran Thi A", 7.8));
        studentManager.add(new Student("SV03", "Le Van B", 9.0));
        studentManager.add(new Student("SV67", "Nguyen Van D", 8.2));

        for (Student s : studentManager.getAll()) {
            System.out.println(s);
        }
        CompletableFuture<Double> future =
                calculateAverageGpa(studentManager.getAll());

        future.thenAccept(avg ->
                System.out.println("GPA trung binh cua he thong la: " + avg)
        ).exceptionally(ex -> {
            System.out.println("Co loi xay ra: " + ex.getMessage());
            return null;
        });

        future.join();

    }

}