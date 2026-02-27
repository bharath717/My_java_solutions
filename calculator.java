import java.util.Scanner;
 class demo{
    
    public void sum(int n1,int n2){
        System.out.print("Sum="+(n1+n2));
    }
    public void dif(int n1,int n2)
    {
       System.out.print("Difference="+(n1-n2));
    }
    public void prdt(int n1,int n2)
    {
     System.out.print("Product="+(n1*n2));   
    }
    public void divide(int n1,int n2)
    {
     System.out.print("Division="+(n1/n2));   
    }
}





public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        System.out.print("1.ADD\n2.Difference\n3.Product\n4.Division.\nEnter the choice:");
        int n=sc.nextInt();
        demo d1=new demo();
        switch(n)
        {
            case 1:d1.sum(num1,num2);break;
            case 2:d1.dif(num1,num2);break;
            case 3:d1.prdt(num1,num2);break;
            case 4:d1.divide(num1,num2);break;
            default:System.out.print("Invalid choice!!!");break;
        }

    }
    
    
}

