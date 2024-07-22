package homework_1;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int answer = x > 10 && x < 20 ? 1 : 0;
        System.out.println(answer);

        char ch = sc.next().charAt(0);
        answer = ch != ' ' ? 2 : 0;
        System.out.println(answer);

        ch = sc.next().charAt(0);
        answer = ch != 'x' || ch != 'X' ? 3 : 0;
        System.out.println(answer);

        ch = sc.next().charAt(0);
        answer = ch > 47 && ch < 58 ? 4 : 0;
        System.out.println(answer);

        ch = sc.next().charAt(0);
        answer = ch > 64 && ch < 123 ? 5 : 0;
        System.out.println(answer);

        int year = sc.nextInt();
        answer = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? 6 : 0;
        System.out.println(answer);

        boolean powerOn = sc.nextBoolean();
        //answer = powerOn ? 0 : 7;
        answer = !powerOn ? 7 : 0;
        System.out.println(answer);

        String str = sc.next();
        answer = str.equals("yes") ? 8 : 0;
        System.out.println(answer);

        sc.close();
    }
}
