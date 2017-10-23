import javax.swing.*;

public class PrevButton extends JButton implements CommandInterface {

    public void processEvent() {
        System.out.println("Previous Pressed.");
    }

    public PrevButton(String name) {
        super(name);
    }
}