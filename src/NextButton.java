import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NextButton extends JButton implements CommandInterface {

    public void processEvent() {
        System.out.println("Next Pressed.");

        int numberOfSaves = MementoControl.getImageCount();
        int currentIndex = MementoControl.getCurrentPathIndex();
        if ((numberOfSaves - 1) > currentIndex) {

            currentIndex++;
            MementoControl.setCurrentPathIndex(currentIndex);
            ShowImage frame = MementoControl.originator.restoreFromMemento( MementoControl.caretaker.getMemento(currentIndex) );


            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.dispose();
                }
            });
            frame.setSize(750, 600);
            frame.setVisible(true);

        }
    }

    public NextButton(String name) {
        super(name);
    }
}
