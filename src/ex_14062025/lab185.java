package ex_14062025;

import java.util.*;

public class lab185 {
    public static void main(String[] args) {
        // student -> name and id
        Student s1 = new Student("ankita", 1);
        Student s2 = new Student("bhanu", 4);
        Student s3 = new Student("siya", 2);
        Student s4 = new Student("priya", 3);

        List arraylist = new ArrayList();
        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        arraylist.add(s4);
        System.out.println(arraylist);
        Collections.sort(arraylist, new SortById());
        System.out.println(arraylist);
        Collections.sort(arraylist, new SortByName());
        System.out.println(arraylist);
        Collections.sort(arraylist, new SortByIdDes());
        System.out.println(arraylist);

        }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortByIdDes implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
    class Student{
        private String name;
        private Integer id;

        public Student(String name, Integer id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

     //   @Override
       // public int compareTo(Student o) {
         //   return Integer.compare(this.id, o.id);
        }// sorted by numbers
        // to sort by names use 'charSequence' instead of integer
        // CAN NOT SORT BOTH AT THE SAME TIME


