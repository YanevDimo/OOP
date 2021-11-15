package ShoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Map<String, Person> peopleInfo = new LinkedHashMap<>();
            Map<String, Product> productInfo = new HashMap<>();


            //read people
            String[] people = scanner.nextLine().split(";");
            for (String element : people) {
                String[] personData = element.split("=");
                String name = personData[0];
                double money = Double.parseDouble(personData[1]);

                try {
                    Person person = new Person(name, money);
                    peopleInfo.put(name, person);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
            //read product
            String[] products = scanner.nextLine().split(";");
            for (String element : products) {
                String[] productData = element.split("=");
                String name = productData[0];
                double cost = Double.parseDouble(productData[1]);

                try {
                    Product product = new Product(name, cost);
                    productInfo.put(name, product);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
            //Shopping
            String command = scanner.nextLine();
            while (!command.equals("END")) {
                String[] commandPart = command.split(" ");
                String personName = commandPart[0];
                String productName = commandPart[1];

                try {
                    Person person = peopleInfo.get(personName);//take the InterfacesAndAbstractionsExercises.person
                    Product product = productInfo.get(productName);//take the product
                    person.buyProduct(product);//and buy product
                    peopleInfo.get(personName).buyProduct(productInfo.get(productName));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                command = scanner.nextLine();
            }
            //print shopping result
            for (Person person : peopleInfo.values()) {
                System.out.print(person.getName() + " - ");
                if (person.getProducts().isEmpty()) {
                    System.out.println("Nothing bought");
                } else {
                    System.out.println(person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", ")));
                }
            }
        }
    }


