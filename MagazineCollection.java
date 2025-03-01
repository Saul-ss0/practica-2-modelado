package Iterator;

import java.util.Iterator;

public class MagazineCollection {
    private String[] magazines;
    private int size;

    public MagazineCollection(int capacity) {
        magazines = new String[capacity];
        size = 0;
    }

    public void addMagazine(String magazine) {
        if (size < magazines.length) {
            magazines[size++] = magazine;
        }
    }

    public Iterator<String> iterator() {
        return new MagazineIterator();
    }

    private class MagazineIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public String next() {
            return hasNext() ? magazines[index++] : null;
        }
    }
}
