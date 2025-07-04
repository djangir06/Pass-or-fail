import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        System.out.print("Enter the marks in English: ");
        Scanner sc = new Scanner(System.in);
        int Eng = sc.nextInt();
        System.out.print("\nEnter the marks in Physics: ");
        int Phy = sc.nextInt();
        System.out.println("Enter the marks in Maths: ");
        int Mat = sc.nextInt();

        float Total = (Phy + Eng + Mat)/3.0f;

        if(Total>40 && Phy>33 && Mat>33 && Eng>33){

            System.out.print("Congrats! You passed");
        }
        else{

            System.out.println("You failed!");
        }
    }
}
