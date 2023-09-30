package CodingTest.Hashing;


import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

// 회장 선거
public class ex5 {

    static int n,k;
    static ArrayList<String> answer= new ArrayList<>();
    static String[] votes;

    public static void solution(){
        Map<String,Integer> map = new HashMap<>();
        for(String x : votes){
            String[] s = x.split(" ");
            map.put(s[1],map.getOrDefault(s[1],0)+1);
        }

        ArrayList<String> list = new ArrayList<>();
        for(String x : map.keySet()){
            if(map.get(x) >= k){
                list.add(x);
            }
        }

        for(String x : votes){
            String[] s = x.split(" ");
            if(list.contains(s[1])){
                answer.add(s[0]);
            }
        }

        Collections.sort(answer);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();

        sc.nextLine();
        votes = new String[n];
        for(int i=0; i<n; i++){
            votes[i] = sc.nextLine();
        }

        k = sc.nextInt();
        solution();
        System.out.println(answer.get(0));
    }
}
