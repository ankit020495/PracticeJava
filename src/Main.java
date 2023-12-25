import Stream.StreamPractice;

import javax.lang.model.type.NullType;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

    List<String> listOfWords= new ArrayList<>(Arrays.asList("hello","hello","How","ankit","SHAH"));

        long startsWithH = listOfWords.stream().filter(s -> s.startsWith("h")).count();
        //System.out.println(startsWithH);
        //System.out.println(listOfWords.stream().map(S->S.toUpperCase()).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        List<Integer> newList = new ArrayList<>(List.of(1,2,3,2,3,4,5));
        Integer maxed = newList.stream().max(Integer::compare).get();
        //System.out.println(maxed);
        System.out.println(newList.stream().distinct().sorted(Integer::compare).skip(2).findFirst().orElse(null));
        newList.sort(Integer::compareTo);
        Double average = newList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
//    System.out.println(average);
      //  System.out.println(listOfWords);
   // listOfWords.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> strings = Arrays.asList("hello", "world", "java", "stream");

        //start = System.currentTimeMillis();
       // int sumOfSalaryParallel = DAOLayer.getEmployees().stream().parallel().map(Employee::getSalary).mapToInt(i->i).reduce(0, Integer::sum);
        //end = System.currentTimeMillis();

    Integer sumOfEven = newList.stream().filter(number->number%2==0).mapToInt(Integer::intValue).sum();
        //System.out.println(sumOfEven);
    Integer sumOfOdd = newList.stream().filter(number->number%2!=0).mapToInt(Integer::intValue).sum();
        //System.out.println(sumOfOdd);
       // System.out.println(listOfWords.stream().collect(Collectors.toSet()));
    List<Integer> uniqueList = newList.stream().distinct().toList();
        //System.out.println(uniqueList);

        StreamPractice sp = new StreamPractice();
        //Function
//        sp.findEvenNumbers();
//        sp.findStartingWithOne();
//       sp.findDuplicates();
        //sp.findFirstElement();
  //      sp.findCount();
  //sp.findMax();
  //sp.someCollection();
        List<String> fruits = Arrays.asList("apple","mango","mango", "papaya","mango","mango", "papaya");
        Map<String, Long> finalMap = fruits.stream().collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()
        ));
        //System.out.println(finalMap);
        //IntStream.rangeClosed(1,10).forEach(t-> System.out.println(Thread.currentThread().getName()+" : "+t));
        System.out.println("=======================================");
        //IntStream.rangeClosed(1,10).parallel().forEach(t-> System.out.println(Thread.currentThread().getName()+" : "+t));

    }
    }