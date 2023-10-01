package CodingTest.Hashing;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 문서 도난
class Person implements Comparable<Person>{
    String name;
    int time;
    public Person(String name,int time){
        this.name = name;
        this.time = time;
    }

    @Override
    public int compareTo(Person o){
        return this.time - o.time;
    }

}
public class ex6 {
    static int n;
    static String[] reports;
    static String times="";
    static ArrayList<String> answer = new ArrayList<>();
    static ArrayList<Person> list = new ArrayList<>();
    public static void solution(){
        int[] time = getTime();

        for(String report : reports){
            String[] div = report.split(" ");
            String[] useTime = div[1].split(":");
            int num = (Integer.valueOf(useTime[0]) * 60) + Integer.valueOf(useTime[1]);

            list.add(new Person(div[0],num));
        }

        Collections.sort(list);

        for(Person x : list){
            if(x.time >= time[0] && x.time <= time[1]){
                answer.add(x.name);
            }
        }
    }

    public static int[] getTime(){
        String[] time = times.split(" ");

        String[] st = time[0].split(":");
        int startTime = ( Integer.valueOf(st[0]) * 60 ) + Integer.valueOf(st[1]);

        String[] et = time[1].split(":");
        int endTime = ( Integer.valueOf(et[0]) * 60 ) + Integer.valueOf(et[1]);

        int[] totalTime = {startTime,endTime};
        return totalTime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        reports = new String[n];

        sc.nextLine();
        for(int i=0; i<n; i++){
            reports[i] = sc.nextLine();
        }
        sc.nextLine();
        times = sc.nextLine();

        solution();
        for(String x : answer){
            System.out.print(x + " ");
        }
    }
}
