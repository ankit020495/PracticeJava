package Stream;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamPractice {
    public int id;
    String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void findEvenNumbers() {
        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions
        List<Integer> Al = Arrays.asList(10, 15, 20, 25, 30);
        Al.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);
    }

    //Given a list of integers, find out all the numbers starting with 1 using Stream functions
    public void findStartingWithOne() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(15);
        arrayList.stream().filter((i) -> String.valueOf(i).startsWith("1")).forEach(System.out::println);
    }

    // How to find duplicate elements in a given integers list in java using Stream functions?
    public void findDuplicates() {
        List<Integer> duplicateList = Arrays.asList(1, 22, 33, 45, 45, 23, 23, 56, 78);
        HashSet<Integer> set = new HashSet<Integer>();
        duplicateList.stream().filter(i -> !set.add(i)).forEach(System.out::println);
    }

    //Given the list of integers, find the first element of the list using Stream functions?
    public void findFirstElement() {
        List<Integer> fList = Arrays.asList(1, 22, 33, 45, 45, 23, 23, 56, 78);
        fList.stream().findFirst().ifPresent(System.out::println);
    }

    //find total elements
    public void findCount() {
        List<Integer> fList = Arrays.asList(1, 22, 33, 45, 45, 23, 23, 56, 78);
        System.out.println(fList.stream().count());
    }

    //find the maximum element
    public void findMax() {
        List<Integer> fList = Arrays.asList(1, 22, 33, 45, 45, 23, 23, 56, 78);
        Integer maximum = fList.stream().max(Integer::compare).get();
        System.out.println(maximum);
    }

    //7. Given a String, find the first non-repeated character in it using Stream functions?
    public void nonRepeatedCharacter() {
        String input = "Non Repeated Character";
        char[] result = input.toCharArray();
        HashSet<Character> set = new HashSet<>();
    }

    public void someCollection() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ankit", Subjects.ENGLISH, 98));
        studentList.add(new Student("Urvish", Subjects.MATHS, 85));
        studentList.add(new Student("Guddi", Subjects.SCIENCE, 95));
        studentList.add(new Student("Guddi", Subjects.MATHS, 95));
        studentList.add(new Student("Ankit", Subjects.SCIENCE, 95));
        studentList.add(new Student("Urvish", Subjects.SCIENCE, 95));

        Map<String,List<Subjects>> studentMap = new HashMap<>();

        studentList.stream().forEach(student -> {
            studentMap.computeIfAbsent(student.getName(), x -> new ArrayList<Subjects>()).add(student.getSubjects());
        });
        System.out.println(studentMap);

        // System.out.println(studentList.stream().collect(Collectors.toMap(Student::getName,Student::getSubjects)));

    }
    public void newCollection(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ankit", Subjects.ENGLISH, 98));
        studentList.add(new Student("Urvish", Subjects.MATHS, 85));
        studentList.add(new Student("Guddi", Subjects.SCIENCE, 95));
        studentList.add(new Student("Guddi", Subjects.MATHS, 95));
        studentList.add(new Student("Ankit", Subjects.SCIENCE, 95));
        studentList.add(new Student("Urvish", Subjects.SCIENCE, 95));

        //Map<List<Subjects>,Integer> internalMap = new HashMap<>();

        Map<String,Map<List<Subjects>,Integer>> studentMap = new HashMap<>();
    }
}
