package Exercise5_TaskManagement;
public class TaskLinkedList {

    private Task head;

    public void addTask(int taskId, String taskName, String status) {

        Task newTask = new Task(taskId, taskName, status);

        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task Added Successfully!");
    }

    public void searchTask(int taskId) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == taskId) {

                System.out.println("Task Found");
                System.out.println("Task ID : " + temp.taskId);
                System.out.println("Task Name : " + temp.taskName);
                System.out.println("Status : " + temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found!");
    }

    public void displayTasks() {

        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }

        Task temp = head;

        while (temp != null) {

            System.out.println("------------------------");
            System.out.println("Task ID : " + temp.taskId);
            System.out.println("Task Name : " + temp.taskName);
            System.out.println("Status : " + temp.status);

            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully!");
            return;
        }

        Task current = head;
        Task previous = null;

        while (current != null && current.taskId != taskId) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task Not Found!");
        } else {
            previous.next = current.next;
            System.out.println("Task Deleted Successfully!");
        }
    }
}