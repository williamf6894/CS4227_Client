import javax.swing.*;

public class NextButton extends JButton implements CommandInterface {

    public void processEvent() {
        System.out.println("Next Pressed.");
    }

    public NextButton(String name) {
        super(name);
    }
}
