package MVC_Exapmle.MVC_Calculator.Views;

import java.awt.event.ActionListener;

public interface View {
    int getFirstNumber();
    int getSecondNumber();
    void setCalculateSolution(int solution);
    void displayErrorMessage(String errorMessage);
    void run();
    void addCalculationListener(ActionListener listenerForCalcButton);
}
