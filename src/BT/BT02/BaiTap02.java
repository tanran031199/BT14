package BT.BT02;

import java.util.ArrayList;
import java.util.List;

public class BaiTap02 {
    public static void main(String[] args) {
        bubbleSort();
        selectionSort();
        insertionSort();
    }

    public static List<Student> getArr() {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            students.add(i, new Student(i + 1, "Student" + (i + 1), (Math.random() * 10) + 1));
        }

        return  students;
    }

    public static void bubbleSort() {
        List<Student> students = getArr();

        for (int i = students.size() - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if(students.get(j).getScore() > students.get(j + 1).getScore()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sắp xếp nổi bọt:");
        System.out.println(students);
    }

    public static void selectionSort() {
        List<Student> students = getArr();

        for (int i = 0; i < students.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < students.size(); j++) {
                if(students.get(minIndex).getScore() > students.get(j).getScore()) {
                    minIndex = j;
                }
            }

            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }

        System.out.println();
        System.out.println("Sắp xếp chọn:");
        System.out.println(students);
    }

    public static void insertionSort() {
        List<Student> students = getArr();

        for (int i = 1; i < students.size(); i++) {
            Student temp = students.get(i);
            int j = i - 1;

            while(j >= 0 && students.get(j).getScore() > temp.getScore()) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }

            students.set(j + 1, temp);
        }

        System.out.println();
        System.out.println("Sắp xếp chèn:");
        System.out.println(students);
    }
}
