import javax.swing.*;

class DeleteButton extends JButton implements CommandInterface {

    public void processEvent() {
        int index = FTPGUI.localList.getSelectedIndex();
        if (index >= 0) {
            ((DefaultListModel) FTPGUI.localList.getModel()).remove(index);
        }

        index = FTPGUI.remoteList.getSelectedIndex();
        if (index >= 0) {
            ((DefaultListModel) FTPGUI.remoteList.getModel()).remove(index);
        }
    }

    public DeleteButton(String name) {
        super(name);
    }
}