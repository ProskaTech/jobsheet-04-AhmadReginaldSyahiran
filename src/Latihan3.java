/*
Created by 21343039_Ahmad Reginald Syahiran
 */

public class Latihan3 {
    public static void main(String[]args){
        int i=0;
        int j=10;
        boolean test = true;
        
        //demonstrasi &&
        test = (i>j) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi &
        test = (i>j) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
