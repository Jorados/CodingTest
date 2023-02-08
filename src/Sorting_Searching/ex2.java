package Sorting_Searching;


import java.util.Scanner;

//삽입 정렬 -> 2번째 인덱스부터 리스트의 알맞은 자리에 끼워넣기.
//겉 for 문 -> 앞 정련된 리스트에 넣을 i를 찾는 for문, 해당 arr[i]를 tmp로 정의.
//안 for 문 -> for(j=i-1; j>=0; j--) 로 정렬된 리스트를 탐색해서
//tmp보다 크면 전부 한칸씩 오른쪽으로 민다. 그리고 for문이 break로 멈추는데,
//한칸 더 들어가서 break되기 때문에 for()문을 빠져나가서 arr[j+1]위치에 tmp를 넣는다. 근데 이때!
//j는 값이 for문안에서 선언되면 for()을 탈출하면 초기화되는데 그걸 방지하기 위해서 for()밖에 선언.
public class ex2 {
    public static int[] solution(int n,int[] arr) {
        for(int i=1; i<n; i++){
            int tmp=arr[i]; int j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x: solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}
