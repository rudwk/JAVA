package homework_1;

public class Homework_4 {
    public static void main(String args[]){
        int sum = 0, i = 0;
        while(true){
            i++;
            sum += i % 2 == 0 ? -i : i;
            if(sum >= 100) break;
        }
        System.out.println(i);
    }
}
