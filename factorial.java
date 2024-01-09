import java.util.Scanner;
class factorial{
    public static void main(String args[]){
        int a = 5,fact = 1;
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input: ");
        //int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }
}