package list;

import dog.Dog;

public class Tester {

	public static void main(String[] args) {
		Dog dog1 = new Dog (2 , "DOG 0" , "wilczur");
	    Dog dog2 = new Dog (3 , "DOG 1" , "kundel");
	    Dog dog3 = new Dog (1 , "DOG 2" , "owczarek");
	    Dog dog4 = new Dog (2 , "DOG 3" , "owczarek");
	    Dog dog5 = new Dog (2 , "DOG 4" , "mastif");
	    Dog dog6 = new Dog (4 , "DOG 5" , "pudel");
	    
	    OneWayLinkedListWithHead <Dog> list = new OneWayLinkedListWithHead <Dog> ();
	    
	    list.add(dog1);
	    list.add(dog2);
	    list.add(dog3);
	    list.add(dog4);
	    list.add(dog5);
	    list.add(3 ,dog6);
	    
	    
	    for (int i = 0 ; i < 6 ; i++) {
	    	System.out.println(list.get(i).toString());
	    }
	    
	    System.out.println(list.size());
	    
	    list.clear();
	    
	    System.out.println(list.size());
	    System.out.println (list.isDone());
	    
    }

}
