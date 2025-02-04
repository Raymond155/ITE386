import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task successfully added: " + task);
    }

    public static void runScheduler() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to execute.");
            return;
        }

        System.out.println("Executing scheduled tasks:");
        for (String task : tasks) {
            System.out.println("Processing: " + task);
        }
        tasks.clear();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add a Task");
            System.out.println("2. Execute Scheduler");
            System.out.println("3. Exit Program");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case 2:
                    runScheduler();
                    break;
                case 3:
                    System.out.println("Shutting down Task Scheduler.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid selection. Please choose a valid option.");
            }
        }
    }
}