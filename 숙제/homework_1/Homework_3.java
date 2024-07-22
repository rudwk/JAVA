package homework_1;

public class Homework_3 {
    public static void main(String args[]){
        int sum = 0;
        for(int i = 1; i <= 10 ; i++){
            sum += sum + i;
        }
        System.out.println(sum);
    }
}
