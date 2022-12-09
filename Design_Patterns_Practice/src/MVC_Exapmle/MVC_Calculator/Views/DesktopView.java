package MVC_Exapmle.MVC_Calculator.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DesktopView extends JFrame implements View {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("calculate");
    private JTextField calculateSolution = new JTextField(10);

    public DesktopView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setSize(600, 200);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calculateSolution);
        this.add(calcPanel, BorderLayout.CENTER);
    }

    @Override
    public int getFirstNumber(){
        return  Integer.parseInt(firstNumber.getText());
    }

    @Override
    public int getSecondNumber(){
        return  Integer.parseInt(secondNumber.getText());
    }

    @Override
    public void setCalculateSolution(int solution){
        calculateSolution.setText(Integer.toString(solution));
    }

    @Override
    public void addCalculationListener(ActionListener listenerForCalcButton){
        calculateButton.addActionListener(listenerForCalcButton);
    }

    @Override
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    @Override
    public void run() {
        setVisible(true);
    }
}
