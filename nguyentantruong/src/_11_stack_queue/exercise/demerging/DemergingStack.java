package _11_stack_queue.exercise.demerging;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemergingStack {
    public static void main(String[] args) {
        Queue<String> nu = new LinkedList<>();
        Queue<String> nam = new LinkedList<>();

         List<Person> personList = new ArrayList<>();

            personList.add(new Person("nguyên văn hàng", true, "12/1/2000"));
            personList.add(new Person("nguyên văn tuấn", true, "13/1/2000"));
            personList.add(new Person("nguyên thi hàng", false, "14/1/2000"));
            personList.add(new Person("nguyên thị tiếm", false, "15/1/2000"));
            personList.add(new Person("nguyên văn hàng", true, "16/1/2000"));
            personList.add(new Person("nguyên văn hàng", true, "17/1/2000"));

        for (int i = 0; i <personList.size() ; i++) {

        }
    }


}
