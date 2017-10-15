import javax.swing.*;

class ExitButton extends JButton implements CommandInterface {

    public void processEvent() {
        System.exit(1);
    }

    public ExitButton(String name) {
        super(name);
    }
}