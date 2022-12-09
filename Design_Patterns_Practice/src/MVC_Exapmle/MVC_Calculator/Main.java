package MVC_Exapmle.MVC_Calculator;

import MVC_Exapmle.MVC_Calculator.Views.CmdView;
import MVC_Exapmle.MVC_Calculator.Views.DesktopView;
import MVC_Exapmle.MVC_Calculator.Views.View;

public class Main {
    public static void main(String[] args) {
        View view1 = new CmdView();
        View view2 = new DesktopView();
        Model model = new Model();
        Controller controller = new Controller(view1, model);
        view1.run();
        controller = new Controller(view2, model);
        view2.run();
    }
}
