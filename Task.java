public class Task {
    private String description;
    private boolean completed;
    String dueDate;

    public Task(String description) {
        this.description = description;
        this.completed = false;
        this.dueDate = null;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public void markPending() {
        this.completed = false;
    }

    @Override
    public String toString() {
        String status = completed ? "Completed" : "Pending";
        String dueDateStr = (dueDate != null) ? ", Due: " + dueDate : "";
        return description + " - " + status + dueDateStr;
    }
}
