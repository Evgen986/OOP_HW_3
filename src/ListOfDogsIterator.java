import java.util.Iterator;
import java.util.List;

public class ListOfDogsIterator implements Iterator<Dog> {
    private List<Dog> listOfDogIterable;
    public ListOfDogsIterator(List<Dog> listOfDogIterable) {
        this.listOfDogIterable = listOfDogIterable;

    }

    public static void setCount(int count) {
        ListOfDogsIterator.count = count;
    }

    private static int count;

    @Override
    public boolean hasNext() {
        return count < listOfDogIterable.size();
    }

    @Override
    public Dog next() {
        count++;
        return listOfDogIterable.get(count-1);
    }
}
