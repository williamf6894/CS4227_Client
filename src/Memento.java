import javax.swing.*;

public class Memento {

    private ShowImage imageFrame;
    private String imagePath;

    public Memento(ShowImage imageFrameSaved, String savedImagePath) {
        imageFrame = imageFrameSaved;
        imagePath = savedImagePath;
    }

    public ShowImage getImageFrame() {
        return imageFrame;
    }

    public String getImagePath() {
        return imagePath;
    }
}
