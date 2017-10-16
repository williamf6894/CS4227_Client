import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

class ShowImageButton extends JButton implements CommandInterface {

    public void processEvent() throws IOException {
        int index = FTPGUI.remoteList.getSelectedIndex();
        String selectedItem = FTPGUI.remoteList.getSelectedValue().toString();

        //ShowImage img = new ShowImage(selectedItem);
        JFrame frame = new ShowImage(selectedItem);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //frame.pack();
        frame.setSize(450, 300);
        frame.setVisible(true);
    }

    public ShowImageButton(String name) {
        super(name);
    }
}