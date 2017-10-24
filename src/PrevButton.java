import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class PrevButton extends JButton implements CommandInterface {

    public void processEvent() throws IOException {

        System.out.println("Pressed the Previous Button and now in the ProcessEvent");

        int currentImage = MementoControl.getCurrentPathNumber();
        System.out.println(currentImage);
        if (currentImage >= 1) {

            currentImage--;
            MementoControl.setCurrentPathIndex(currentImage);
            System.out.println(currentImage);
            ShowImage frame = MementoControl.originator.restoreFromMemento( MementoControl.caretaker.getMemento(currentImage) );
            String selectedImage = MementoControl.originator.restorePathFromMemento( MementoControl.caretaker.getMemento(currentImage) );
            frame.changeImage(selectedImage);
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.dispose();
                }
            });

            //frame.pack();
            frame.setSize(750, 600);
            frame.setVisible(true);

            System.out.println("Previous Pressed.");
        }
    }

    public PrevButton(String name) {
        super(name);
    }
}