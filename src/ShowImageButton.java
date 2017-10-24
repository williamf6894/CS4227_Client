import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

class ShowImageButton extends JButton implements CommandInterface {

    public void processEvent() throws IOException {
        int index = FTPGUI.remoteList.getSelectedIndex();
        String selectedItem = FTPGUI.remoteList.getSelectedValue().toString();

        JFrame frame = new ShowImage(selectedItem);

        MementoControl.originator.set((ShowImage) frame, selectedItem );
        MementoControl.caretaker.addMemento( MementoControl.originator.storeInMemento() );

        int count = MementoControl.getImagePathCount() + 1;
        MementoControl.setImagePathCount( count );
        int currentImage = MementoControl.getCurrentPathNumber() + 1;
        MementoControl.setCurrentPathIndex( currentImage );

        //ShowImage img = new ShowImage(selectedItem);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //System.exit(0);
                frame.dispose();
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