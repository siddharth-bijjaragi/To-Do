public class TaskBuilder {
    private Task task;

    public TaskBuilder(String description) {
        this.task = new Task(description);
    }

    public TaskBuilder setDueDate(String dueDate) {
        task.dueDate = dueDate;
        return this;
    }

    public Task build() {
        return task;
    }
}

