package homework_1;

public class Homework_2 {
    public static void main(String args[]){
        int sum = 0;
        for(int i = 0; i <= 20; i++){
            sum += i % 2 != 0 && i % 3 != 0 ? i : 0;
        }
        System.out.println(sum);
    }
}
