package Homecoding;

public class Array4_methods {
    public static void main(String[] args) {
        int my_arr [] = {0,5,10,15,20};
        change(my_arr);
        for(int x:my_arr){
            System.out.print(x + " ");
        }
    }

    public static void change(int y[]){
        for(int i = 0; i<y.length; i++){
            y[i]=y[i]+5;
        }
    }
}
