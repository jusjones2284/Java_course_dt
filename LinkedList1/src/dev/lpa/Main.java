package dev.lpa;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
        addBack(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary(placesToVisit);

        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);


    }

    private static void addMoreElements(LinkedList<String> list){

        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Alice Springs");

//        System.out.println(list);


    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        //Queue/Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();
        System.out.println(p1 + " was removed");
        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");





    }

    private static void addBack(LinkedList<String> list){

        list.push("Sydney");
        list.push("Portugal");
        list.push("Spain");

        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list){

        System.out.println("Retrieved Element = " + list.get(1));
        list.push("Montreal");
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());


        gettingPostionOfElement(list);

    }

    private static void gettingPostionOfElement(LinkedList<String> list){

        System.out.println("-".repeat(25));
        System.out.println("Montreal is at position: " + list.indexOf("Montreal"));

        //Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        //Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());

        //add more places to visit
        list.push("Vancouver");
        list.push("New Orleans");
        list.offerLast("New Mexico");
    }

    public static void printItinerary(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        System.out.println(list.size());
        System.out.println(list);
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i -1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast() );
    }
}