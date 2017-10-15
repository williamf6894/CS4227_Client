import javax.swing.*;

class DownloadButton extends JButton implements CommandInterface {
    public void processEvent() {
        int index = FTPGUI.remoteList.getSelectedIndex();
        String selectedItem = FTPGUI.remoteList.getSelectedValue().toString();
        ((DefaultListModel) FTPGUI.remoteList.getModel()).remove(index);

        ((DefaultListModel) FTPGUI.localList.getModel()).addElement(selectedItem);
    }

    public DownloadButton(String name) {
        super(name);
    }
}