import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n= input.nextInt();

        if(n%2==0){
            System.out.println("The number entered is even");
        }
        else {
            System.out.println("The number entered is odd");
        }
    }
}
