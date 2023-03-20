package Baekjoon;


import java.util.*;

// 1764 - 듣보잡 - S4
public class ex1764 {
    static int answer=0;
    static ArrayList<String> str = new ArrayList<>();
    public static void solution(String[] arr){
        Map<String,Integer> map = new HashMap<>();

        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s : map.keySet()){
            if(map.get(s)>1) {
                answer++;
                str.add(s);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] arr = new String[n+m];
        for(int i=0; i<=n; i++){
            arr[i] = sc.next();
        }

        for(int i=n+1; i<n+m; i++){
            arr[i] = sc.next();
        }

        solution(arr);

        System.out.println(answer);
        Collections.sort(str);
        for(String x : str){
            System.out.println(x);
        }
    }
}
