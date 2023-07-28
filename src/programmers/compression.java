package programmers;

import java.util.*;

public class compression {

    static Map<String,Integer> map = new HashMap<>();
    static ArrayList<Integer> answer = new ArrayList<>();
    static String s;

    public static void LZW(int num,String str){
        String line = "";
        for (int i = num; i < str.length(); i++) {
            line += str.charAt(i);

            if (!map.containsKey(line)) {
                //사전에 추가
                map.put(line, map.size()+1);
                //짤라서 answer에 추가
                line = line.substring(0,line.length()-1);
                answer.add(map.get(line));
                LZW(i,str);
                break;
            }
            else if (i == str.length()-1) {
                answer.add(map.get(line));
            }
            else continue;
        }
    }

    public static void solution(){
        String[] list = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z" };

        for (int i=0; i<list.length; i++) map.put(list[i],i+1);
        LZW(0,s);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        s = sc.nextLine();
        solution();
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
