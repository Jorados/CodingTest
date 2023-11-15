package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 지뢰
class Mine implements Comparable<Mine>{
    int stress;
    int index;
    public Mine(int stress,int index){
        this.stress = stress;
        this.index = index;
    }

    @Override
    public int compareTo(Mine o){
        return o.stress - this.stress;
    }
}
public class ex2232 {

    static int n;
    static ArrayList<Mine> mines = new ArrayList<>();

    public static void solution(){
        while(mines.size()>0){

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            mines.add(new Mine(sc.nextInt(),i));
        }

        solution();
    }
}
