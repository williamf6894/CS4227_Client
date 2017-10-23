public class Originator {

    private String imagePath;

    public void set(String newImagePath){
        System.out.println("From Originator: Current Version of Image\n" + newImagePath + "\n");
        imagePath = newImagePath;
    }

    public Memento storeInMemento(){
        System.out.println("From Originator: Saving to Memento");
        return new Memento(imagePath);
    }

    public String restoreFromMemento(Memento memento){
        imagePath = memento.getImagePath();
        System.out.println("From Originator: Restoring from Memento");
        return imagePath;
    }
}
