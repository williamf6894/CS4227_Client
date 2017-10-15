import javax.swing.*;

class UploadButton extends JButton implements CommandInterface {

    public void processEvent() {
        int index = FTPGUI.localList.getSelectedIndex();
        String selectedItem = FTPGUI.localList.getSelectedValue().toString();
        ((DefaultListModel) FTPGUI.localList.getModel()).remove(index);

        ((DefaultListModel) FTPGUI.remoteList.getModel()).addElement(selectedItem);
    }

    public UploadButton(String name) {
        super(name);
    }
}