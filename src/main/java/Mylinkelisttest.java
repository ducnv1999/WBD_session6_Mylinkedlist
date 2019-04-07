public class Mylinkelisttest {
    public static void main(String[] args) {

        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        Mylinkedlist ll = new Mylinkedlist(9);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,8);
        ll.printList();
    }
}
