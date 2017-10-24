import com.sun.management.VMOption;

public class MementoControl {

    private static int imagePathCount;
    private static int currentPathNumber;

    // Not sure if I need this at all yet.
    private String imagePath;

    public static final Caretaker caretaker = new Caretaker();
    public static final Originator originator = new Originator();

    //Holding the Total and the Count of the Mementos

    public static void setCurrentPathIndex(int NextCountValue) {
        currentPathNumber = NextCountValue;
    }

    public static void setImagePathCount(int NextCountValue) {
        imagePathCount = NextCountValue;
    }

    public static int getCurrentPathNumber() {
        return currentPathNumber;
    }

    public static int getImagePathCount() {
        return imagePathCount;
    }

}
