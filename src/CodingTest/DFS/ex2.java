package CodingTest.DFS;


import java.util.ArrayList;
import java.util.Scanner;

// 줄다리기
class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex2 {
    static int[][] fight;
    static boolean[] ch;
    static int answer=0;
    static ArrayList<Point> arr = new ArrayList<>();
    public static void DFS(String tmp){
        if(tmp.length()>=2){
            Integer num1 = Integer.valueOf(tmp.charAt(tmp.length()-1) - 48);
            Integer num2 = Integer.valueOf(tmp.charAt(tmp.length()-2) - 48);
            for(int j=0; j<arr.size(); j++){
                if(num1 == arr.get(j).x && num2 == arr.get(j).y){
                    return;
                }
                if(num1 == arr.get(j).y && num2 == arr.get(j).x){
                    return;
                }
            }
            if(tmp.length()==7) answer++;
        }

        for(int i=1; i<=7; i++){
            if(!ch[i]){
                ch[i]=true;
                DFS(tmp + Integer.toString(i));
                ch[i]=false;
            }
        }
    }
    public static void solution(int[][] fight){
        for(int i=0; i<fight.length; i++){
            arr.add(new Point(fight[i][0],fight[i][1]));
        }
        DFS("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fight = new int[n][2];
        ch = new boolean[8];

        for(int i=0; i<n; i++){
            fight[i][0]=sc.nextInt();
            fight[i][1]=sc.nextInt();
        }
        solution(fight);
        System.out.println(answer);
    }
}
