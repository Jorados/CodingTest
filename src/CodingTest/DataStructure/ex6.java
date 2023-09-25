package CodingTest.DataStructure;



import java.util.*;

// 가장 많이 사용된 회의실

class Room{
    int st;
    int et;
    int cnt;
    boolean flag = false;

    public Room (int st, int et, int cnt){
        this.st = st;
        this.et = et;
        this.cnt = cnt;
    }

}
public class ex6 {

    // 회의실 수는 n (번호는 -1 해주자)
    // 앞 시작 시간 순으로 오름차순 정렬하고
    // 사용가능한 회의실 생기면 낮은 번호에 배정
    // 회의실 없으면 대기

    static int rooms;
    static int n,answer=0;
    static int[][] meetings;
    static int max = Integer.MIN_VALUE;

    public static void solution(){
        Arrays.sort(meetings , (a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);

        // 0 5
        // 2 7
        // 4 5
        // 7 10
        // 9 12



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rooms = sc.nextInt();

        n = sc.nextInt();
        meetings = new int[n][2];


        for(int i=0; i<n; i++){
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();

            if(meetings[i][1] > max){
                max = meetings[i][1];
            }

        }
        solution();
    }
}
