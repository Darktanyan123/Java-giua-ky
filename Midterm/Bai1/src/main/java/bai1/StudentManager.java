package bai1;

import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {
    private List<T> data = new ArrayList<>();

    public void add(T item) {
        this.data.add(item);
    }

    public List<T> getAll() {
        return this.data;
    }
}
