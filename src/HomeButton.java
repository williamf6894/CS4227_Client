import javax.swing.*;

public class HomeButton extends JButton implements CommandInterface {

    public void processEvent() {
        System.out.println("Home Pressed.");
    }

    public HomeButton(String name) {
        super(name);
    }
}
