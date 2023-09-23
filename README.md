The Java To-Do List Manager is a simple command-line application that allows users to manage their tasks. Users can add tasks, mark them as completed, delete them, and view tasks based on their completion status. This project also demonstrates the use of design patterns such as the Builder Pattern and the implementation of undo and redo functionality using a custom Pair class.

Features
Add new tasks with descriptions.
Mark tasks as 'completed.'
Delete tasks.
View tasks either all at once or filtered by 'completed' or 'pending.'
Undo and redo actions.
Getting Started
Follow these instructions to set up and run the To-Do List Manager on your local machine.

Prerequisites
Java Development Kit (JDK) installed.
An Integrated Development Environment (IDE) like Eclipse, IntelliJ IDEA, or any text editor of your choice.
Installation
Clone the repository to your local machine.

bash
Copy code
git clone https://github.com/siddharth-bijjaragi/To-Do.git
Open the project in your preferred IDE.

Usage
Open the Main.java file.

Run the main method to start the application.

The application will prompt you to add tasks, mark tasks as completed, delete tasks, and more. Follow the on-screen instructions to interact with the To-Do List Manager.

You can use the following commands to perform actions:

add: Add a new task.
complete: Mark a task as completed.
delete: Delete a task.
undo: Undo the last action.
redo: Redo the last undone action.
view all: View all tasks.
view completed: View completed tasks.
view pending: View pending tasks.
exit: Exit the application.
Design Patterns Used
Builder Pattern: The TaskBuilder class is used to construct tasks with optional attributes like due dates.

Custom Pair Class: A custom Pair class is used to store action-task pairs for undo and redo functionality.

Contributing
Contributions are welcome! If you would like to contribute to this project, please follow these steps:

Fork the repository.
Create a new branch for your feature or bug fix.
Make your changes and commit them with clear messages.
Push your changes to your fork.
Create a pull request to the main repository.


Acknowledgments
This project was created as an educational exercise to demonstrate Java programming and design patterns.
