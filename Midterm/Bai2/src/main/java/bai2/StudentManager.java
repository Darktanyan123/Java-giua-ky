package bai2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {

    private List<T> data;

    public StudentManager() {
        data = new ArrayList<>();
    }

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }
}























//Lớp StudentManager<T> dùng Generic
//Thuộc tính:
//List<T> data:lưu trữ đối tượng (arraylist)
//phương thức:
//void add(T item) - thêm  đối tượng vào danh sách
//list <T> getAll() trả về toàn bộ danh sách