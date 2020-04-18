import implementations.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {


        SinglyLinkedList<Integer> numbers = new SinglyLinkedList<>();
        numbers.addLast(1);
        numbers.addLast(2);
        numbers.removeFirst();

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
