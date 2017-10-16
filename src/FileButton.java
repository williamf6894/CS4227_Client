import javax.swing.*;

class FileButton extends JButton implements CommandInterface {

    public void processEvent() {
        System.out.println("File Pressed.");
    }

    public FileButton(String name) {
        super(name);
    }
}
