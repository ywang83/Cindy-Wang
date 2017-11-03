package Textbook;

import java.util.*;

public class MaintainQueue {

    public static void main(String[] args) {

        MaintainQueue object = new MaintainQueue();

        object.processCustomers();
    }
    // Data Field
    private final Queue<String> customers;
    private final Scanner in;

    // Constructor

    /**
     * Create an empty queue.
     */
    public MaintainQueue() {
        customers = new LinkedList<>();
        in = new Scanner(System.in);
        System.out.println("Enter new customer name");
        String name = in.nextLine();
        customers.offer(name);

        int countAhead = 0;
        for (String nextName : customers) {
            if (!nextName.equals(name)) {
                countAhead++;
            } else {
                System.out.println("The number of customers ahead of " + name + " is " + countAhead);
//                break; // Customer found, exit loop.
            }
        }
    }

    public void processCustomers() {
        String choice = "";
        String[] choices =
                {"add", "peek", "remove", "size", "position", "quit"};
// Perform all operations selected by user.
        while (!choice.equals("quit")) {
// Process the current choice.
            try {
                String name;
                System.out.println("Choose from the list: "
                        + Arrays.toString(choices));
                choice = in.nextLine();
                switch (choice) {
                    case "add":
                        System.out.println("Enter new customer name");
                        name = in.nextLine();
                        customers.offer(name);
                        System.out.println("Customer " + name +
                                " added to the queue");
                        break;
                    case "peek":
                        System.out.println("Customer " + customers.element() +
                                " is next in the queue");
                        break;
                    case "remove":
                        System.out.println("Customer " + customers.remove() +
                                " removed from the queue");
                        break;
                    case "size":
                        System.out.println("Size of queue is " + customers.size());
                        break;
                    case "position":
                        System.out.println("Enter customer name");
                        name = in.nextLine();
                        int countAhead = 0;
                        for (String nextName : customers) {
                            if (!nextName.equals(name)) {
                                countAhead++;
                            } else {
                                System.out.println("The number of customers ahead of "
                                        + name + " is " + countAhead);
                                break;
// Customer found, exit loop.
                            }
                        }
// Check whether customer was found.
                        if (countAhead == customers.size()) {
                            System.out.println(name + " is not in queue");
                        }
                        break;
                    case "quit":
                        System.out.println("Leaving customer queue. "
                                + "\nNumber of customers in queue is "
                                + customers.size());
                        break;
                    default:
                        System.out.println("Invalid choice - try again");
                } // end switch
            } catch (NoSuchElementException e) {
                System.out.println("The Queue is empty");
            } // end try-catch
        } // end while
    }
}
