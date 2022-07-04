import java.util.*;

public class customGenericPriorityQueue {

    public static class Student implements Comparable<Student> {
        String name;
        int ht;
        int wt;
        int marks;

        Student(String name, int ht, int wt, int marks) {
            this.name = name;
            this.ht = ht;
            this.wt = wt;
            this.marks = marks;
        }

        public int compareTo(Student other) {
            return this.name.compareTo(other.name);
        }

        public String toString() {
            return this.name + " -> " + this.ht + "," + this.wt + "," + this.marks;
        }

    }

    public static class MyPriorityQueue<T> {
        // heap
        ArrayList<T> data;
        Comparator cmprtr;

        MyPriorityQueue() {
            data = new ArrayList<>();
        }

        MyPriorityQueue(Comparator cmprtr) {
            data = new ArrayList<>();
            this.cmprtr = cmprtr;
        }

        void upheapify(int idx) {
            if (idx == 0)
                return;
            int pidx = (idx - 1) / 2;
            if (isSmaller(idx, pidx) == true) {
                swap(idx, pidx);
                upheapify(pidx);
            }
        }

        void add(T val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        void downheapify(int idx) {
            int minIdx = idx;
            int lidx = idx * 2 + 1;
            if (lidx < data.size() && isSmaller(lidx, minIdx) == true) {
                minIdx = lidx;
            }

            int ridx = idx * 2 + 2;
            if (ridx < data.size() && isSmaller(ridx, minIdx) == true) {
                minIdx = ridx;
            }

            if (minIdx != idx) {
                swap(idx, minIdx);
                downheapify(minIdx);
            }
        }

        T remove() {
            if (this.size() == 0) {
                System.out.println("Underflow");
                return null;
            }
            swap(0, data.size() - 1);
            T val = data.remove(data.size() - 1);
            downheapify(0);
            return val;

        }

        T peek() {
            if (this.size() == 0) {
                System.out.println("Underflow");
                return null;
            }
            return data.get(0);
        }

        int size() {
            return data.size();
        }

        void swap(int i, int j) {
            T ith = data.get(i);
            T jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
        }

        boolean isSmaller(int i, int j) {
            T ith = data.get(i);
            T jth = data.get(j);
            if (cmprtr != null) {
                if(cmprtr.compare(ith,jth) < 0){
                    return true;
                }else{
                    return false;
                }
            } else {
                Comparable cith = (Comparable) ith;
                Comparable cjth = (Comparable) jth;

                if (cith.compareTo(cjth) < 0)
                    return true;
                else
                    return false;
            }

        }

    }

    public static class sortStudentByHeight implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.ht - s2.ht;
        }
    }

    public static class sortStudentByWeight implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.wt - s2.wt;
        }
    }

    public static class sortStudentByMarks implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.marks - s2.marks;
        }
    }

    public static void main(String[] args) {

        MyPriorityQueue pqName = new MyPriorityQueue(); // name --> comparable me logic set kar rakha h
        MyPriorityQueue pqHt = new MyPriorityQueue(new sortStudentByHeight()); // height --> comparator interface ko
                                                                               // implement karti hui class se likhoonga
        MyPriorityQueue pqWt = new MyPriorityQueue(new sortStudentByWeight()); // weight
        MyPriorityQueue pqMk = new MyPriorityQueue(new sortStudentByMarks()); // marks

        Student[] studentArr = new Student[5];
        studentArr[0] = new Student("A", 180, 95, 100);
        studentArr[1] = new Student("B", 175, 100, 90);
        studentArr[2] = new Student("C", 160, 75, 65);
        studentArr[3] = new Student("D", 190, 110, 50);
        studentArr[4] = new Student("E", 150, 65, 80);

        System.out.println("Sort By Name");

        for (Student val : studentArr) {
            pqName.add(val);
        }
        while (pqName.size() > 0) {
            System.out.println(pqName.remove());
        }

        System.out.println("Sort By Height");

        for (Student val : studentArr) {
            pqHt.add(val);
        }
        while (pqHt.size() > 0) {
            System.out.println(pqHt.remove());
        }

        System.out.println("Sort By Weight");

        for (Student val : studentArr) {
            pqWt.add(val);
        }
        while (pqWt.size() > 0) {
            System.out.println(pqWt.remove());
        }

        System.out.println("Sort By Marks");

        for (Student val : studentArr) {
            pqMk.add(val);
        }
        while (pqMk.size() > 0) {
            System.out.println(pqMk.remove());
        }
    }
}
