package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//좌표 정렬하기

class XY implements Comparable<XY>{
    int x;
    int y;

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(XY o) {
        if(this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}

public class ex11650 {
    static ArrayList<XY> arr = new ArrayList<>();
    public static void solution(){
        Collections.sort(arr);

        for(XY x : arr){
            System.out.println(x.x +" " + x.y);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new XY(x,y));
        }
        solution();
    }
}
