import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShowImage extends JFrame {

    public static final String newline = "\n";
    public static final String FILE = "File";
    public static final String HOME = "Home";
    public static final String VIEW = "View";
    public static final String EXIT = "Exit";


    private FileButton btnFile;
    private HomeButton btnHome;
    private ViewButton btnView;

    public ShowImage(String selectedItem) throws IOException {

        super("Show Image - Command Pattern - UI");

        //Create buttons
        btnFile = new FileButton(ShowImage.FILE);
        btnFile.setMnemonic(KeyEvent.VK_F);
        btnHome = new HomeButton(ShowImage.HOME);
        btnHome.setMnemonic(KeyEvent.VK_H);
        btnView = new ViewButton(ShowImage.VIEW);
        btnView.setMnemonic(KeyEvent.VK_V);
        ExitButton btnExit = new ExitButton(FTPGUI.EXIT);
        btnExit.setMnemonic(KeyEvent.VK_X);

        buttonHandler vf = new buttonHandler();

        btnFile.addActionListener(vf);
        btnHome.addActionListener(vf);
        btnView.addActionListener(vf);
        btnExit.addActionListener(vf);

        //-----------------------------------
        //For layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel();

        //----------------------------------------------
        GridBagLayout gridbag = new GridBagLayout();
        buttonPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        buttonPanel.add(btnFile);
        buttonPanel.add(btnHome);
        buttonPanel.add(btnView);
        buttonPanel.add(btnExit);

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(btnFile, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gridbag.setConstraints(btnHome, gbc);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gridbag.setConstraints(btnView, gbc);
        gbc.gridx = 4;
        gbc.gridy = 0;
        gridbag.setConstraints(btnExit, gbc);


        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets.left = 2;
        gbc.insets.right = 2;
        gbc.insets.top = 40;

        //------------------------------------------------------
        //For layout purposes, put the image in a separate panel
        JPanel imagePanel = new JPanel();

        //------------------------------------------------------

        //System.out.println("Worked");
        File file = new File("./images/" + selectedItem);
        BufferedImage image = ImageIO.read(file);
        JLabel actualImage = new JLabel(new ImageIcon(image));
        /*JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(200,200);
        //f.setBounds( 40, 40, 980, 480);
        f.setSize(1200, 700);
        f.setVisible(true);*/

        //****************************************************
        //Add the buttons to the frame
        Container contentPane = getContentPane();
        contentPane.add(buttonPanel, BorderLayout.NORTH);
        //****************************************************
        //Add the image to the frame
        contentPane.add(actualImage, BorderLayout.CENTER);
    }
}