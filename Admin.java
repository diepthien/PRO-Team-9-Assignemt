//Khoa (menu ~ rút xiền ~ nạp xiền ~ kiểm tra tài khoản)
package assignmentpro101;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Admin {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Change Password");
            System.out.println("5. Exit");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.print("\nEnter money to be withdrawn:");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("\nPlease collect your money \n");
                    } else {
                        System.out.println("\nInsufficient balance\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("\nYour money has been successfully depsited\n");
                    break;

                case 3:
                    System.out.println("\nBalance : " + balance + "\n");
                    break;

                case 4:
                    
                    ChangePass changePass = new ChangePass();
                    changePass.doimaPIN();
                    
                    
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("\nLook more careful and choose wisely\n");
            }
        }
    }
}
