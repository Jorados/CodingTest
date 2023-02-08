package Sorting_Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

public class ex7 {
    static ArrayList<Point> point = new ArrayList<>();
    public static ArrayList<Point> solution(int n){
        Collections.sort(point);
        return point;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int j=0; j<n; j++){
            point.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        for(Point x : solution(n)){
            System.out.println(x.x + " " + x.y);
        }
    }
}
