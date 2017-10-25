import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class PrevButton extends JButton implements CommandInterface {

    public void processEvent() throws IOException {

        System.out.println("Pressed the Previous Button and now in the ProcessEvent");

        int currentImage = MementoControl.getCurrentPathIndex();
        System.out.println(currentImage);
        if (currentImage >= 1) {
            currentImage--;

            MementoControl.setCurrentPathIndex(currentImage);
            ShowImage frame = MementoControl.originator.restoreFromMemento( MementoControl.caretaker.getMemento(currentImage) );

            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.dispose();
                }
            });
            frame.setSize(750, 600);
            frame.setVisible(true);

            System.out.println("Previous Pressed.");
        }
    }

    public PrevButton(String name) {
        super(name);
    }
}