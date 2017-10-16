import javax.swing.*;

public class ViewButton extends JButton implements CommandInterface {

    public void processEvent() {
        System.out.println("View Pressed.");
    }

    public ViewButton(String name) {
        super(name);
    }
}
