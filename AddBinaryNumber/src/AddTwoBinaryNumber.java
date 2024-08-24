import java.util.Scanner;

public class AddTwoBinaryNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st binary number: ");
        String binary1=sc.nextLine();
        System.out.println("Enter 2nd binary number: ");
        String binary2=sc.nextLine();
        //convet binary to ineger
        int num1=Integer.parseInt(binary1,2);
        int num2=Integer.parseInt(binary2,2);
        //add numbers
        int sum=num1+num2;
        System.out.println("The sum of two binary number is: "+sum);
        //convet num to binary number
        String binarysum=Integer.toBinaryString(sum);
        System.out.println("The sum of "+binary1+" and "+binary2+" is: "+binarysum);
        sc.close();

    }
}
