import java.util.*;
class oddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int even=0,odd=0;
        for(int i=0;i<=n;i++){
            int x=sc.nextInt();
            if(x%2==0){
                even+=x;
                
            }else{
                odd+=x;
            }
            System.out.println("Sum of even:"+even);
            System.out.println("Sum of Odd:"+odd);
        }

    }
}
