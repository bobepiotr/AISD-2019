package list;

public class OneWayLinkedList <E> {
    Element sentinel;

    public OneWayLinkedList() {
        sentinel = new Element (null);

        sentinel.setNext(sentinel);
        sentinel.setPrevious(sentinel);
    }

    public Element getElement(int index) {
        Element tail = sentinel.getNext();

        while (index > 0 && tail.getNext() != sentinel) {
            tail = tail.getNext();
            index--;
        }

        return tail;
    }

    public void add(E value) {
        Element newElement = new Element(value);

        sentinel.insertBefore(newElement);
    }

    public void add(int index, E value) {
        Element newElement = new Element(value);

        getElement(index+1).insertBefore(newElement);
    }

    public void remove(int index) {
        getElement(index).remove();
    }

    public void remove(E value) {
        Element tail = sentinel.getNext();

        while ((tail.getNext() != sentinel) && !(tail.getValue() == value)) {
            tail = tail.getNext();
        }

        if (tail.getValue() == value) {
            tail.remove();
        }
    }

    public E get(int index) {
        return getElement(index).getValue();
    }

    public boolean isEmpty() {
        return sentinel.getNext() == sentinel;
    }

    public void clear() {
        sentinel.setNext(sentinel);
        sentinel.setPrevious(sentinel);
    }

    public int size() {
        Element tail = sentinel.getNext();
        int size = 0;

        while (tail != sentinel) {
            tail = tail.getNext();
            size++;
        }

        return size;
    }

    private class Element {
        Element next;
        Element previous;
        E value;

        public Element (E value) {
            this.value = value;
        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }

        public Element getPrevious() {
            return previous;
        }

        public void setPrevious(Element previous) {
            this.previous = previous;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public void insertAfter(Element element) {
            element.setNext(this.getNext());
            element.setPrevious(this);
            this.getNext().setPrevious(element);
            this.setNext(element);
        }

        public void insertBefore(Element element) {
            element.setNext(this);
            element.setPrevious(this.getPrevious());
            this.getPrevious().setNext(element);
            this.setPrevious(element);
        }

        public void remove() {
            this.getNext().setPrevious(this.getPrevious());
            this.getPrevious().setNext(this.getNext());
        }
    }
}
