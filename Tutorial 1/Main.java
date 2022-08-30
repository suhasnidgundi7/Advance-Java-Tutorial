import java.awt.*;

class Main extends Frame{
    Main(){        
        Label lb = new Label("Welcome To Java");
        add(lb);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String args[]){
        Main mn = new Main();
    }
}