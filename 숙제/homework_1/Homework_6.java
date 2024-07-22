package homework_1;

public class Homework_6 {
    public static void main(String args[]){
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
    }
}
