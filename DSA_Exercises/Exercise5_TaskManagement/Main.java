package Exercise5_TaskManagement;
public class Main {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        // Add Tasks
        taskList.addTask(101, "Complete Assignment", "Pending");
        taskList.addTask(102, "Prepare Presentation", "Completed");
        taskList.addTask(103, "Study Java", "Pending");

        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching Task ID 102");
        taskList.searchTask(102);

        System.out.println("\nDeleting Task ID 101");
        taskList.deleteTask(101);

        System.out.println("\nTasks After Deletion:");
        taskList.displayTasks();
    }
}
