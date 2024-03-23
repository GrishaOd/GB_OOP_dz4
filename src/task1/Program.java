package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[1000]);

//        myArrayList.add("Hello");
        myArrayList.add(new Employee("Name #1"));
//        myArrayList.add(false);
        myArrayList.add(new Employee("Name #2"));
//        myArrayList.add('s');

        System.out.println("Кол-во элементов: " + myArrayList.size());

        Employee  o = myArrayList.get(2);

//        Employee e = (Employee) o;
        System.out.println(o.getName());

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);


    }

}
