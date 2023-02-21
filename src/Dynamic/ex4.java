package Dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Doll implements Comparable<Doll>{
    int s;
    int h;
    int w;

    public Doll(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Doll o) {
        return o.s - this.s;
    }
}
public class ex4 {
    static int n;
    static ArrayList<Doll> arr;
    static int[] dy;

    public static int solution(){
        int answer=0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        for(int i=0; i<n; i++){
            int max_h=0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) max_h=dy[j];
            }
            dy[i]=max_h + arr.get(i).h;
            answer = Math.max(answer,dy[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dy = new int[n];
        arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Doll(a,b,c));
        }

        System.out.println(solution());
    }
}
