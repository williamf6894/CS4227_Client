import javax.swing.*;

public class Originator {

    private ShowImage imageFrame;
    private String imagePath;

    public void set(ShowImage savedImageFrame, String savedImagePath){
        System.out.println("From Originator: Current Version of Image\n" + savedImageFrame + "\n");
        imageFrame = savedImageFrame;
        imagePath = savedImagePath;
    }

    public Memento storeInMemento(){
        System.out.println("From Originator: Saving to Memento");
        return new Memento(imageFrame, imagePath);
    }

    public String restorePathFromMemento(Memento memento){
        imagePath = memento.getImagePath();
        System.out.println("From Originator: Restoring Path from Memento");
        return imagePath;
    }

    public ShowImage restoreFromMemento(Memento memento){
        imageFrame = memento.getImageFrame();
        System.out.println("From Originator: Restoring Frame from Memento");
        return imageFrame;
    }
}
