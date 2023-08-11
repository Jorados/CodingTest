package programmers;
import java.util.*;
// 프로그래머스 - 스킬트리
public class SkillTree {
    static Stack<Character> stack = new Stack<>();
    static boolean flag=false;
    static int answer=0;
    static String skill="";
    static String[] skill_trees = new String[4];

    public static void solution(){
        for(int i=0; i<skill_trees.length; i++){
            flag = false;

            //스택 초기화
            stack.clear();
            for(int k=skill.length()-1; k>=0; k--){
                stack.push(skill.charAt(k));
            }

            //체크
            char[] line = skill_trees[i].toCharArray();
            for(int j=0; j<line.length; j++){
                if(stack.contains(line[j]) && stack.peek() == line[j]){
                    stack.pop();
                }
                else if(stack.contains(line[j]) && stack.peek() != line[j]){
                    flag = true;
                    break;
                }
                else continue;
            }
            if(!flag) answer++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        skill = sc.nextLine();
        for(int i=0; i<4; i++){
            skill_trees[i] = sc.nextLine();
        }
        solution();
        System.out.println(answer);
        //
    }
}
