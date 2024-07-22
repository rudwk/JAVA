import java.util.Scanner;

public class test {
    public static void main(String args[]){
        char ch;
        int answer;
        Scanner sc = new Scanner(System.in);

        boolean powerOn = sc.nextBoolean();
        //answer = powerOn ? 0 : 7;
        answer = !powerOn ? 7 : 0;
        System.out.println(answer);
    }
}