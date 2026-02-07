package If_else;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price : ");
        double cp = sc.nextInt();
        System.out.print("Enter the Selling Price : ");
        double sp = sc.nextInt();

        if(sp>cp) System.out.println("PROFIT of " + (sp-cp)  + "\n Profit% : " + (sp-cp)/cp * 100);
        else if (sp<cp) System.out.println("LOSS of " + (cp-sp) + "\n Loss% : " + (cp-sp)/cp * 100);
        else System.out.println("NO PROFIT NO LOSS");
    }
}