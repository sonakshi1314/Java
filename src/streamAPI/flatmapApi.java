package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class Student{
    String name ;
    int className;
    int age;

    public Student(String name, int className, int age) {
        this.name = name;
        this.className = className;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className=" + className +
                ", age=" + age +
                '}';
    }
}
public class flatmapApi {
    public static void main(String[] args) {

        //Eg:1
        List<List<Integer>> al =new ArrayList<>();
        al.add(Arrays.asList(10 , 20 , 30));
        al.add( Arrays.asList(50 , 60 ));
        al.add( Arrays.asList(100 ));
        al.add(Arrays.asList(90 , 120 , 130));
        System.out.println(al);

        List<Integer> ans = al.stream().flatMap(list->list.stream()).filter(num->num>30).collect(Collectors.toList());
        System.out.println(ans);

        //Eg:2

        ArrayList<Student> al1=new ArrayList<>();
        al1.add(new Student("anjali" , 4 , 7 ));
        al1.add(new Student("shreya" , 7 , 14 ));

        ArrayList<Student> al2=new ArrayList<>();
        al1.add(new Student("mukund" , 12 , 18 ));
        al1.add(new Student("mukul" , 12 , 19 ));

        ArrayList<ArrayList<Student>> arrayList=new ArrayList<>();
        arrayList.add(al1);
        arrayList.add(al2);

        for(ArrayList<Student> list: arrayList){
                for (Student student : list) {
                    System.out.println(student.toString());
                }
        }

        List<Student> ans1 = arrayList.stream().flatMap(studentList->studentList.stream()).collect(Collectors.toList());
        System.out.println(ans1);

        arrayList.stream().flatMap(studentList->studentList.stream()).filter(name->name.className>5).map(name->name.name).forEach(System.out::println);
    }
}
