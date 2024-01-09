import java.io.*;
import java.util.*;
import java.util.Scanner;
class reversestring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String str = "TEMPLE";
        String str = sc.next();
        System.out.println(str);
        for(int i=str.length()-1; i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}