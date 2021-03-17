package list;

public class Tester {

    public static void main(String [] args) {
        OneWayLinkedList<Integer> list = new OneWayLinkedList<Integer> ();

        list.add(4);
        list.add(5);
        list.add(6);

        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.clear();

        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
