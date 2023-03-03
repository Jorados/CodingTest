import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    class Solution {

        public String solution(int[] numbers, String hand) {
            String answer = "";
            int lt=0,rt=0;
            int x1=0,y1=0,x2=0,y2=0,x3=0,y3=0;
            // 1 2 3   왼 1 4 7   1.거리 계산하고
            // 4 5 6   오 3 6 9   2.거리 같으면 주손 먼저.
            // 7 8 9
            // * 0 #
            int[][] arr={{1,2,3},{4,5,6},{7,8,9},{11,10,12}};

            for(int x : numbers){
                if(x==1 || x==4 || x==7){
                    answer+="L";
                    lt=x;
                }
                else if(x==3 || x==6 || x==9){
                    answer+="R";
                    rt=x;
                }
                else if(x==2 || x==5 || x==8 || x==0){
                    for(int i=0; i<4; i++){
                        for(int j=0; j<3; j++){
                            //거리 측정법 : i값 끼리 빼기 + j값 끼리 빼기
                            if(arr[i][j]==x){
                                x1=i;
                                y1=j;
                            }
                            if(arr[i][j]==lt){
                                x2=i;
                                y2=j;
                            }
                            if(arr[i][j]==rt){
                                x3=i;
                                y3=j;
                            }
                        }
                    }
                    int Ldis = (x1-x2) + (y2-y1);
                    int Rdis = (x1-x3) + (y3-y2);

                    if(Ldis == Rdis && hand == "left"){
                        answer+="L";
                        lt=x;
                    }
                    else if(Ldis == Rdis && hand == "right"){
                        answer+="R";
                        rt=x;
                    }
                    else if(Ldis < Rdis){
                        answer+="L";
                        lt=x;
                    }
                    else if(Ldis > Rdis){
                        answer+="R";
                        rt=x;
                    }
                }

            }
            return answer;
        }


    }
}
