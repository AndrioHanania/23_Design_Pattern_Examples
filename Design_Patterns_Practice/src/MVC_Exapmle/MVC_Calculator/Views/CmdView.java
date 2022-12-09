package MVC_Exapmle.MVC_Calculator.Views;

import java.awt.event.ActionListener;
import java.util.Scanner;

public class CmdView implements View
{
    private Scanner scanner = new Scanner(System.in);
    private ActionListener actionListener;

    @Override
    public int getFirstNumber() {
        System.out.println("Please enter the first number: ");
        return scanner.nextInt();
    }

    @Override
    public int getSecondNumber() {
        System.out.println("Please enter the second number: ");
        return scanner.nextInt();
    }

    @Override
    public void setCalculateSolution(int solution) {
        System.out.println("result: " + solution);
    }

    @Override
    public void displayErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    @Override
    public void run() {
        System.out.println("welcome");
        System.out.println("press enter to start");
        String readString  = scanner.nextLine();
        while(readString == null || readString.length() > 0)
        {
            System.out.println("press enter to start");
            readString  = scanner.nextLine();
        }
        while(true) {
            this.actionListener.actionPerformed(null);
            boolean toExit = false;
            do{
                System.out.println("Do you want to continue? (Yes/No)");
                readString  = scanner.next();
                if(readString.equalsIgnoreCase("No"))
                {
                    toExit = true;
                    break;
                }
                else if(readString.equalsIgnoreCase("Yes")){
                    break;
                }
            }while(true);
                if(toExit)
                    break;
        }
        System.out.println("See you soon");
    }

    @Override
    public void addCalculationListener(ActionListener listenerForCalcButton) {
        this.actionListener = listenerForCalcButton;
    }
}
