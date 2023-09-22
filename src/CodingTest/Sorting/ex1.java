package CodingTest.Sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 이진수 정렬
class Point implements Comparable<Point>{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o){
        if(this.y == o.y) return this.x - o.x;
        else return this.y - o.y;
    }

    // 아니면 2차원 배열로 만들어서
    // Arrays.sort(arr,(a,b) -> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1] );
}
public class ex1 {

    static int n;
    static Integer[] arr;
    static ArrayList<Point> answer = new ArrayList<>();
    public static void solution(){
        // 그냥 for문으로 정렬을 구현하면 되겠다.
        for(int i=0; i<arr.length; i++){
            String str = Integer.toBinaryString(arr[i]); //현재 인덱스 2진수
            int cnt=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='1') cnt++;
            }
            answer.add(new Point(arr[i],cnt));
        }

        Collections.sort(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution();
        for(Point x : answer){
            System.out.print(x.x + " ");
        }
    }
}
