package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class XXX implements Comparable<XXX>{
    int x;
    int y;

    public XXX(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(XXX o) {
        if(this.y == o.y) return this.x - o.x;
        return this.y - o.y;
    }
}


public class ex11651 {

    static ArrayList<XXX> arr = new ArrayList<>();
    public static void solution(){
        Collections.sort(arr);

        for(XXX x : arr){
            System.out.println(x.x +" "+ x.y);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new XXX(x,y));
        }
        solution();
    }
}
