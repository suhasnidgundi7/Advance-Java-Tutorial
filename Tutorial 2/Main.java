import java.awt.*;

public class Main extends Frame{

    Main(){

        Checkbox cb_1 = new Checkbox("Marathi");
        cb_1.setBounds(50, 50, 100, 100);
        add(cb_1);
        cb_1.setSize(100, 50);
        
        Checkbox cb_2 = new Checkbox("Hindi");
        cb_2.setBounds(50, 100, 100, 100);
        add(cb_2);
        cb_2.setSize(100, 50);
        
        Checkbox cb_3 = new Checkbox("English");
        cb_3.setBounds(50, 150, 100, 100);
        add(cb_3);  
        cb_3.setSize(100, 50);
        
        Checkbox cb_4 = new Checkbox("Sanskrit");
        cb_4.setBounds(50, 200, 100, 100);
        add(cb_4);
        cb_4.setSize(100, 50);
        
        setSize(200, 300);
        setLayout(null);
        setVisible(true);        
    
    }

    public static void main(String[] args) {
        Main mn = new Main();
    }
}