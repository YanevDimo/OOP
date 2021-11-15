package InterfacesAndAbstractionsExercises.CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          AddCollection addCollection = new AddCollection();
          AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
          MyList myList = new MyListImpl();

          String[] input = scanner.nextLine().split("\\s+");
          int countRemove = Integer.parseInt(scanner.nextLine());

        printAdd(input,addCollection);
        printAdd(input, addRemoveCollection);
        printAdd(input,myList);

        printRemove(countRemove, addRemoveCollection);
        printRemove(countRemove,myList);
    }

    private static void printRemove(int countRemove, AddRemovable addRemoveCollection) {
        for (int i = 0; i < countRemove; i++) {
            System.out.print(addRemoveCollection.remove() + " ");
        }
        System.out.println();
    }

    private static void printAdd(String[] input, Addable addCollection) {
        for (String text : input) {
            System.out.println(addCollection.add(text) + " ");
            
        }
        System.out.println();
    }
}
