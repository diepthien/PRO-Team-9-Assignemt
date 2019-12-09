/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentpro101;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CheckDeal{
    /**
     * @param args the command line arguments
     */
    
    
    
    public CheckDeal() {
    }

    public void Check() throws IOException {
        String day, month, year, s;
        int c;
        Scanner ip = new Scanner(System.in);
        LinkedList<String> check = new LinkedList<String>();
        LinkedList<String> prf = new LinkedList<String>();
        Scanner ip2 = new Scanner(new File("src/assignmentpro101/date.txt"));
        Scanner ip3 = new Scanner(new File("src/assignmentpro101/tranfer.txt"));
        do {
            System.out.println("1 Check deal.\n");
            System.out.println("2 Check tranfer money.\n");
            System.out.println("3 Exit.\n");
            System.out.println("Enter your choice: ");
            c = ip.nextInt();
            switch (c) {
                case 1:
                    ip.nextLine();
                    System.out.println("Enter the day");
                    day = ip.nextLine();
                    System.out.println("Enter the month");
                    month = ip.nextLine();
                    System.out.println("Enter the year");
                    year = ip.nextLine();
                    s = day + "/" + month + "/" + year;
                    boolean checkdate = check.contains(s);

                    while (ip2.hasNextLine()) {
                        check.add(ip2.nextLine());
                        System.out.println(checkdate);
                    }
                    break;
                case 2:
                    while(ip3.hasNextLine()){
                        prf.add(ip3.nextLine());
                    }
                    int i=0;
                    while (i<prf.size()){
                        System.out.println(prf.get(i));
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("Thansk for use.");
                    break;
            }

        } while (c != 3);
    }
    
    public static void main(String[] args) throws IOException {
        
        CheckDeal cd = new CheckDeal();
        cd.Check();
        
    }
}
