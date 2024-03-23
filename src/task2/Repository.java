package task2;

import java.util.List;

public interface Repository<T> {

    void add(T e);
    void update(T e);
    void delete(int id);
    List<T> getAll();
    T getById(int id);

}
