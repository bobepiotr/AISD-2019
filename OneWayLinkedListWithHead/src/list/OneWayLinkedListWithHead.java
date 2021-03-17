package list;

import ilist.IList;

public class OneWayLinkedListWithHead <E> implements IList <E>{
	Element head = null;
	
	public OneWayLinkedListWithHead() {
	}

	public E getElement(int index) {
		Element tail = head;
		int pos = 0;

		while (pos != index) {
			tail = tail.getNext();
		}

		return tail.getValue();
	}

	@Override
	public void add(E value) {
		Element newElement =new Element(value);
		
		if (head == null) 
			head = newElement;
		
		else {
			Element tail = head;
			
			while (tail.getNext() != null) 
				tail = tail.getNext();
			
			tail.setNext(newElement);
		}
	}

	@Override
	public void add(int index, E value) {
		Element newElement =new Element(value);
		int pos = 0;
		
		Element element = head;
		Element prev = null;
		
		while (pos != index) {
			prev = element;
			element = element.getNext();
			pos++;
		}
		
		prev.setNext(newElement);
		newElement.setNext(element);
	}

	@Override
	public void remove(int index) {
		int pos = 0;
		
		Element element = head;
		Element prev = null;
		
		while (!(pos == index)) {
			prev = element;
		    element = element.getNext();
			pos++;
		}
		prev.setNext(element.getNext());
	}

	@Override
	public void remove(E value) {
		int pos = 0;
		Element element = head;
		
		while (pos < size() && !value.equals(element.getValue())) {
			pos++;
			element = element.getNext();
		}
		
		if (element.getValue().equals(value))
			remove(pos);
		
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public int size() {
		int size = 0;
		Element tail = head;
		
		while (tail != null) {
			size++;
			tail = tail.getNext();
		}
		
		return size;
	}

	@Override
	public void clear() {
		head = null;
	}

	@Override
	public boolean contains(E value) {
		return false;
	}
	
	@Override
	public E get(int index) {
		int pos = 0;
		Element tail = head;
		
		while (!(pos == index)) {
			tail = tail.getNext();
			pos++;
		}
		
		return tail.getValue();
	}

	@Override
	public E get(E value) {
		return null;
	}

	@Override
	public boolean isDone() {
		Element chain = head;

		while (chain != null) {
			chain.getNext();
		}
		return chain == null;
	}

	private class Element {
		private E value;
		private Element next;
		
		public E getValue() {
			return value;
		}
		
		public void setValue(E value) {
			this.value = value;
		}
		
		public Element getNext() {
			return next;
		}
		
		public void setNext(Element next) {
			this.next = next;
		}
		
		public Element (E data) {
			this.value = data;
		}
	}

}
