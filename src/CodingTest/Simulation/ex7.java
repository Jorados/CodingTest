package CodingTest.Simulation;


import java.util.ArrayList;
import java.util.Scanner;

// 비밀번호 - 구현문제

class Dot{
    int num;
    int x;
    int y;
    public Dot(int num,int x,int y){
        this.num = num;
        this.x = x;
        this.y = y;
    }
}
public class ex7 {
    static int[][] map = new int[3][3];
    static String password = "";
    static int answer=0;
    public static void solution(){
        // 2 (0,0) 5 (0,1) 3 (0,2)
        // 7 (1,0) 1 (1,1) 6 (1,2)
        // 4 (2,0) 9 (2,1) 8 (2,2)
//        ArrayList<Dot> list = new ArrayList<>();
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3; j++){
//                list.add(new Dot(map[i][j],i,j));
//            }
//        }

        char num=0;
        for(int k=0; k<password.length(); k++){
            if(k==0){
                num=password.charAt(k);
                continue;
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){

                    if(Integer.toString(map[i][j]).equals(String.valueOf(password.charAt(k)))){
                        // i,j값을 찾고
                        // 기존에 num과의 거리 차를 구해준다.
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                map[i][j] = sc.nextInt();
            }
        }

        password = sc.next();
        solution();
    }
}
