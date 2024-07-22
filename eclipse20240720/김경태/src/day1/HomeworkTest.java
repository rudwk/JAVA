package day1;

import java.util.Scanner;

public class HomeworkTest {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int answer = x > 10 && x < 20 ? 1 : 0;
        System.out.println(answer);

        char ch = sc.next().charAt(0);
        /*answer = ch != ' ' ? 2 : 0;*/
        if(ch != ' ' && ch != '\t') answer = 2;
        System.out.println(answer);

        ch = sc.next().charAt(0);
        /*answer = ch != 'x' || ch != 'X' ? 3 : 0;*/
        if(ch == 'x' || ch == 'X')answer = 3;
        System.out.println(answer);

        ch = sc.next().charAt(0);
        answer = ch >= '0' && ch <= '9' ? 4 : 0;
        System.out.println(answer);

        ch = sc.next().charAt(0);
        /*answer = ch > 64 && ch < 123 ? 5 : 0;*/
        if(('a' <= ch && ch >= 'z') && ('A' <= ch && 'Z' >= ch)) answer = 5;
        System.out.println(answer);

        int year = sc.nextInt();
        answer = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? 6 : 0;
        System.out.println(answer);

        boolean powerOn = sc.nextBoolean();
        /*answer = powerOn ? 0 : 7;*/
        answer = !powerOn ? 7 : 0;
        System.out.println(answer);

        String str = sc.next();
        answer = str.equals("yes") ? 8 : 0;
        System.out.println(answer);

        sc.close(); 
        
        int sum = 0;
        for(int i = 0; i <= 20; i++){
            sum += i % 2 != 0 && i % 3 != 0 ? i : 0;
        }
        System.out.println(sum);
        
        
        sum = 0;
        for(int i = 1; i <= 10 ; i++){
            sum += sum + i;
        }
        System.out.println(sum);
        
        sum = 0;
        int num=1;
        int delta = 1;
        while(true){
            sum += num *delta;
            if(sum >= 100) break;
        	num++;
        	delta = -delta;
        }
        System.out.println(num);
        
        
        int count = 0;
        for(int i = 1; i <= 6;i++){
            for(int j = 1; j <= 6; j++){
                if(i + j == 6){
                    count++;
                }
            }
        }
        System.out.println(count);
        
        int x, y = 0;
        while(y < 10){
            x = 0;
            while(x <= y){
                System.out.print('*');
                x++;
            }
            System.out.println();
            y++;
        }
        
        String str = "41389";
        int sum = 0;
        for(int i = 0; i < str.length();i++){
                sum += str.charAt(i) -'0';
        }
        System.out.println(sum);
    }
	
}
