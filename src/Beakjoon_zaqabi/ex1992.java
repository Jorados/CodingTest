package Beakjoon_zaqabi;


import java.util.Scanner;

// 쿼드 트리 - S1

// 비슷한 문제 - 탐색문제
// 2630 - 색종이 만들기
// 10 - 별 찍기

public class ex1992 {
    static int n;
    static int[][] board;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];

        for(int i=0; i<n; i++){
            String s = sc.next();
            for(int j=0; j<n; j++) {
                board[i][j]=s.charAt(j) - '0';
            }
        }

        QuadTree(0,0,n); // 출력 호출
        System.out.println(sb); // 출력
    }

    // 출력 만들기
    // 각 영역에서 가장 왼쪽 위를 기준점(포인터)삼아
    // x + size, y + size가 현재 공간의 크기라고 보면 된다.
    public static void QuadTree(int x,int y, int size){

        // 압축이 가능하면 하나의 색으로 압축
        if(isPossible(x,y,size)){
            sb.append(board[x][y]);
            return;
        }

        int newSize = size/2; // 압축이 불가능 할 겨우 사이즈를 절반으로 나눈다.
        sb.append('('); // 각 레벨(depth)에서 여는 괄호로 시작해야한다.

        QuadTree(x,y,newSize); //왼쪽 위
        QuadTree(x,y+newSize,newSize); //오른쪽 위
        QuadTree(x+newSize,y,newSize); //왼쪽 아래
        QuadTree(x+newSize,y+newSize,newSize); //오른쪽 아래

        sb.append(')'); // 해당 레벨이 끝나면 닫는 괄호.

    }

    // 압축 가능여부 체크
    public static boolean isPossible(int x, int y,int size){
        int value = board[x][y];

        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(value != board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
