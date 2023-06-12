package Baekjoon;

import java.util.*;
// 나이순 정렬 - S5 - 정렬


class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o){
        if(this.age == o.age) return this.name.compareTo(o.name);
        return this.age - o.age;
    }
}
public class ex10814 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();
        ArrayList<Person> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int age = sc.nextInt();
            String name = sc.next();
            arr.add(new Person(name,age));
        }
        Collections.sort(arr);

        for(Person x : arr){
            System.out.println(x.age + " " + x.name);
        }

    }
}
