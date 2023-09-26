package CodingTest.DataStructure;


import java.util.Scanner;

// 피부과
public class ex4 {

    static int n;
    static int[] laser;

    static int m;
    static String[] enter;

    static int answer=0;

    public static void soluiton() {
        for(int i=0; i<enter.length; i++){
            String[] str = enter[i].split(" ");
            String time = str[0]; //
            String[] split = time.split(":");
            int realTime = (Integer.valueOf(split[0]) * 60) + Integer.valueOf(split[1]); // 시작시간
            int laserTime = laser[Integer.valueOf(str[1])];// 시술

            int totalTime = realTime + laserTime;
            int cnt=0;
            // totalTime 보다 빠른 시술 시작 시간의 최댓값을 구해야한다.
            for(int j=i+1; j<enter.length; j++){
                String[] str2 = enter[j].split(" ");
                String time2 = str2[0]; // 시간
                String[] split2 = time2.split(":");
                int realTime2 = (Integer.valueOf(split2[0]) * 60) + Integer.valueOf(split2[1]); // 시작시간

                if(realTime2 < totalTime) {
                    cnt++;
                }
            }
            answer = Math.max(answer,cnt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        laser = new int[n];
        for(int i=0; i<n; i++){
            laser[i] = sc.nextInt();
        }

        sc.nextLine();

        m = sc.nextInt();
        sc.nextLine();
        enter = new String[m];
        for(int i=0; i<m; i++){
            enter[i] = sc.nextLine();
        }

        soluiton();
        System.out.println(answer);
    }
}
