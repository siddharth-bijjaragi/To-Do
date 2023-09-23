import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class ToDoListManager {
    private List<Task> tasks;
    private Stack<Pair<String, Task>> undoStack;
    private Stack<Pair<String, Task>> redoStack;

    public ToDoListManager() {
        tasks = new ArrayList<>();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        undoStack.push(new Pair<>("add", task));
        redoStack.clear();
    }

    public void markCompleted(String description) {
        for (Task task : tasks) {
            if (task.toString().startsWith(description)) {
                task.markCompleted();
                undoStack.push(new Pair<>("mark_completed", task));
                redoStack.clear();
                break;
            }
        }
    }

    public void deleteTask(String description) {
        for (Task task : tasks) {
            if (task.toString().startsWith(description)) {
                tasks.remove(task);
                undoStack.push(new Pair<>("delete", task));
                redoStack.clear();
                break;
            }
        }
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Pair<String, Task> action = undoStack.pop();
            String operation = action.getKey();
            Task task = action.getValue();

            if ("add".equals(operation)) {
                tasks.remove(task);
            } else if ("mark_completed".equals(operation)) {
                task.markPending();
            } else if ("delete".equals(operation)) {
                tasks.add(task);
            }

            redoStack.push(action);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Pair<String, Task> action = redoStack.pop();
            String operation = action.getKey();
            Task task = action.getValue();

            if ("add".equals(operation)) {
                tasks.add(task);
            } else if ("mark_completed".equals(operation)) {
                task.markCompleted();
            } else if ("delete".equals(operation)) {
                tasks.remove(task);
            }

            undoStack.push(action);
        }
    }

    public List<Task> viewTasks(String filterOption) {
        List<Task> filteredTasks = new ArrayList<>();

        if ("completed".equals(filterOption)) {
            for (Task task : tasks) {
                if (task.toString().contains("Completed")) {
                    filteredTasks.add(task);
                }
            }
        } else if ("pending".equals(filterOption)) {
            for (Task task : tasks) {
                if (task.toString().contains("Pending")) {
                    filteredTasks.add(task);
                }
            }
        } else {
            filteredTasks = tasks;
        }

        return filteredTasks;
    }
}
