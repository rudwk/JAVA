package homework_1;

public class Homework_7 {
    public static void main(String args[]){
        String str = "41389";
        int sum = 0;
        for(int i = 0; i < str.length();i++){
            for(int j = 1; j <= 9; j++){
                sum += str.charAt(i) == Integer.toString(j).charAt(0) ? j : 0;
            }
        }
        System.out.println(sum);
    }
}
