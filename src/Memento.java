public class Memento {

    private String imagePath;

    public Memento(String imagePathSaved) {
        imagePath= imagePathSaved;
    }

    public String getImagePath() {
        return imagePath;
    }
}
