import java.util.*;
class parameters{
  public static void calculateSum(int a,int b){
        // Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        // int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum:"+sum);

       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        calculateSum(a,b);
    }

}
