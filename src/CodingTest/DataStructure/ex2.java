package CodingTest.DataStructure;


import java.util.Scanner;
import java.util.Stack;

// 겹쳐진 압축 해제
public class ex2 {
    public static String s;
    public static String answer="";

    public static void solution(){
        Stack<Character> stack = new Stack<>();
        char[] ctr = s.toCharArray();

        for(int i=0; i<ctr.length; i++){
            if(ctr[i]==')'){
                String line = "";
                while(!stack.isEmpty()){
                    char tmp = stack.pop();
                    int num=0;
                    if(tmp=='('){
                        char tmp2 = stack.pop();
                        if(!Character.isDigit(tmp2)){
                            stack.push(tmp2); // 다시 제자리
                            // 그냥 역순
                            for(int j=line.length()-1; j>=0; j--){
                                stack.push(line.charAt(j));
                            }
                            break;
                        }
                        else if(Character.isDigit(tmp2)){
                            // num 배수 역순
                            num = Integer.valueOf(tmp2-'0');
                            for(int j=0; j<num; j++){
                                for(int z=line.length()-1; z>=0; z--){
                                    stack.push(line.charAt(z));
                                }
                            }
                            break;
                        }
                    }
                    line+=tmp;
                }
            }
            else stack.push(ctr[i]);
        }

        for(char c : stack) answer+=c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        solution();
        System.out.println(answer);
    }
}
