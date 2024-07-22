package homework_1;

public class Homework_5 {
    public static void main(String argsp[]){
        int count = 0;
        for(int i = 1; i <= 6;i++){
            for(int j = 1; j <= 6; j++){
                if(i + j == 6){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
