import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class ShowImageButton extends JButton implements CommandInterface {

    public void processEvent() throws IOException {
        int index = FTPGUI.localList.getSelectedIndex();
        String selectedItem = FTPGUI.localList.getSelectedValue().toString();

        File file = new File("./images/" + selectedItem);
        BufferedImage image = ImageIO.read(file);
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(200,200);
        f.setVisible(true);
    }

    public ShowImageButton(String name) {
        super(name);
    }
}