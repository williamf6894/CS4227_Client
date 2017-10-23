import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memento> savedImages = new ArrayList<>();

    public void addMemento(Memento m){
        savedImages.add(m);
    }

    public Memento getMemento(int index) {
        return savedImages.get(index);
    }

}