package Beakjoon_zaqabi;


import java.util.Scanner;

// 안녕 - S2
public class ex1535 {

    static int n;
    static int[] life;
    static int[] happy;

    public static void solution(){
        int health=100; //체력
        int pleasure=0; //기쁨

        while(health>0){
            for(int i=0; i<n; i++){
                health-=life[i];


            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();
        life = new int[n];
        happy = new int[n];

        for(int i=0; i<n; i++){
            life[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            happy[i]=sc.nextInt();
        }

        solution();
    }
}
