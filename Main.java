public class Main {
    public static void main(String[] args) {
        ToDoListManager todoManager = new ToDoListManager();

        Task task1 = new TaskBuilder("Buy groceries").setDueDate("2023-09-20").build();
        Task task2 = new TaskBuilder("Read a book").build();

        todoManager.addTask(task1);
        todoManager.addTask(task2);

        todoManager.markCompleted("Buy groceries");

        System.out.println("All Tasks:");
        for (Task task : todoManager.viewTasks("")) {
            System.out.println(task);
        }

        System.out.println("\nCompleted Tasks:");
        for (Task task : todoManager.viewTasks("completed")) {
            System.out.println(task);
        }

        System.out.println("\nPending Tasks:");
        for (Task task : todoManager.viewTasks("pending")) {
            System.out.println(task);
        }
    }
}
