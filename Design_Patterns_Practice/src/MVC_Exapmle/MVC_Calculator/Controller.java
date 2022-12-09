package MVC_Exapmle.MVC_Calculator;

import MVC_Exapmle.MVC_Calculator.Views.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller
{
    private View view;
    private Model model;

    public Controller(View view, Model model){
        this.model = model;
        this.view = view;
        this.view.addCalculationListener(new CalcListener());
    }

    class CalcListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNum = 0, secondNum = 0;
            try {
                firstNum = view.getFirstNumber();
                secondNum = view.getSecondNumber();
                model.addTwoNumbers(firstNum, secondNum);
                view.setCalculateSolution(model.getCalculationValue());
            }catch (NumberFormatException ex){
                view.displayErrorMessage("Need to enter 2 integers");
            }
        }
    }
}
