package ilist;

public interface IList <E> {
	void add(E value);
	void add(int index , E value);
    void remove(int index);
    void remove(E value);
	boolean isEmpty();
	int size();
	void clear();
	boolean contains(E value);
	E get (int index);
	E get (E value);

	boolean isDone();
}
