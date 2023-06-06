package Baekjoon;


import java.util.*;

// 파일 정리 - 정렬 - S3
public class ex20291 {
    static int n;
    static String[] arr;
    static String ex="";
    static boolean flag=false;

    public static void solution(){
        HashMap<String,Integer> map = new HashMap<>();

        for(String str : arr){
            char[] ctr = str.toCharArray();
            for(int i=0; i<ctr.length; i++){
                if(ctr[i]=='.') {
                    flag=true;
                    continue;
                }
                if(flag) ex+=ctr[i];
            }
            flag=false;
            map.put(ex,map.getOrDefault(ex,0)+1);
            ex="";
        }

        ArrayList<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        for(String str : keySet){
            System.out.println(str + " " + map.get(str));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();
        arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        solution();

    }
}
