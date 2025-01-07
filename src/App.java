import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Instantiate your objects
        User user = new User("JohnDeer");
        // Print your objects
        System.out.println(user); // Print the user object

        LocalDateTime now = LocalDateTime.now();

        // Create a new to-do list for the user
        ToDoList list1 = new ToDoList();
        System.out.println(list1); // Print the to-do list object

        // Create some tasks with due dates
        LocalDateTime dueDate1 = now.plusDays(7); // Due in 7 days
        Task task1 = new Task("Buy groceries", dueDate1);
        LocalDateTime dueDate2 = now.plusWeeks(2); // Due in 2 weeks
        Task task2 = new Task("Finish homework", dueDate2);
        LocalDateTime dueDate3 = now.plusMonths(1); // Due in 1 month
        Task task3 = new Task("Call the bank", dueDate3);

        // Print the task objects
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
    }
}