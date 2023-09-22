package CodingTest.Greedy;


import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
// 전투 게임

class Alpha{
    String c;
    int n;
    public Alpha(String c,int n){
        this.c = c;
        this.n = n;
    }
}
public class ex5 {
    static int n;
    static String[][] students;
    static ArrayList<Integer> answer = new ArrayList<>();
    public static void solution(){
        ArrayList<Alpha> list = new ArrayList<>();
        for(String[] s : students){
            list.add(new Alpha(s[0],Integer.parseInt(s[1])));
        }

        for(Alpha alpha : list){
            int sum =0;
            for(int i=0; i<list.size(); i++){
                if(!alpha.c.equals(list.get(i).c) && alpha.n > list.get(i).n ){
                    sum+=list.get(i).n;
                }
            }
            answer.add(sum);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        students = new String[n][2];
        for(int i=0; i<n; i++){
            students[i][0] = sc.next();
            students[i][1] = sc.next();
        }
        solution();
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
