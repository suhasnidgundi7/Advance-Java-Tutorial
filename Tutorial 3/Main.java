import java.awt.*;

public class Main extends Frame {

    Main(){

        Button btn_1 = new Button("OK");
        btn_1.setBounds(40, 60, 50, 50);
        btn_1.setSize(100, 50);
        add(btn_1);
        
        Button btn_2 = new Button("RESET");
        btn_2.setBounds(160, 60, 50, 50);
        btn_2.setSize(100, 50);
        add(btn_2);
        
        Button btn_3 = new Button("CANCEL");
        btn_3.setBounds(270, 60, 50, 50);
        btn_3.setSize(100, 50);
        add(btn_3);        
        
        setSize(400, 150);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main mn = new Main();
    }
}
