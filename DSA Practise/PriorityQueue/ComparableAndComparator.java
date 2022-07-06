import java.util.*;
public class ComparableAndComparator{
    public static class Student implements Comparable<Student>{
        String name;
        int ht;
        int wt;
        int marks;
        Student(String name, int ht, int wt, int marks){
            this.name = name;
            this.ht = ht;
            this.wt = wt;
            this.marks = marks;
        }
        public int compareTo(Student other){
            return this.ht - other.ht;
        }
        public String toString(){
            return this.name + " -> " + this.ht + "," + this.wt + "," + this.marks;
        }
    }
    public static class studentWeightComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.wt - s2.wt;
        }
    }

    public static class studentMarksComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.marks - s2.marks;
        }
    }
    public static class studentHeightComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.ht - s2.ht;
        }
    }
    public static void main(String[] args){
        Student[] studentArr = new Student[5];
        studentArr[0] = new Student("A",180,95,100);
        studentArr[1] = new Student("B",175,100,90);
        studentArr[2] = new Student("C",160,75,65);
        studentArr[3] = new Student("D",190,110,50);
        studentArr[4] = new Student("E",150,65,80);

        PriorityQueue<Student> pqHt = new PriorityQueue<>(new studentHeightComparator());
        PriorityQueue<Student> pqWt = new PriorityQueue<>(new studentWeightComparator());
        PriorityQueue<Student> pqMk = new PriorityQueue<>(new studentMarksComparator());

        System.out.println("basis of height");
        for(int i = 0; i < 5; i++){
            pqHt.add(studentArr[i]);
        }
        while(pqHt.size() > 0){
            System.out.println(pqHt.remove());
        }
        System.out.println("basis of weight");
        for(int i = 0; i < 5; i++){
            pqWt.add(studentArr[i]);
        }
        while(pqWt.size() > 0){
            System.out.println(pqWt.remove());
        }

        System.out.println("basis of marks");
        for(int i = 0; i < 5; i++){
            pqMk.add(studentArr[i]);
        }
        while(pqMk.size() > 0){
            System.out.println(pqMk.remove());
        }
    }
}
