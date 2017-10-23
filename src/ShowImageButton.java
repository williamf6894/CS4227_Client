import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

class ShowImageButton extends JButton implements CommandInterface {

    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();
    int imageCount = 0, currentImage = 0;

    public void processEvent() throws IOException {
        int index = FTPGUI.remoteList.getSelectedIndex();
        String selectedItem = FTPGUI.remoteList.getSelectedValue().toString();

        originator.set(selectedItem);
        caretaker.addMemento(originator.storeInMemento());
        imageCount++;
        currentImage++;

        //ShowImage img = new ShowImage(selectedItem);
        JFrame frame = new ShowImage(selectedItem);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //frame.pack();
        frame.setSize(750, 600);
        frame.setVisible(true);
    }

    public ShowImageButton(String name) {
        super(name);
    }
}