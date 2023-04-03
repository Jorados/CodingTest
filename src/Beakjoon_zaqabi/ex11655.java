package Beakjoon_zaqabi;


import java.util.Scanner;

// ROT13 - B1
public class ex11655 {
    static String s;

    public static void solution(){
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length; i++){
            if(chars[i]>='A' && chars[i]<='Z'){
                if(chars[i]>='N'){
                    chars[i]-=13;
                }
                else chars[i]+=13;
            }
            else if(chars[i]>='a' && chars[i]<='z'){
                if(chars[i]>='n'){
                    chars[i]-=13;
                }
                else chars[i]+=13;
            }
        }
        for(char c : chars) System.out.print(c);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        s = sc.nextLine();
        solution();
    }
}
