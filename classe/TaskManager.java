package classe;

import java.util.ArrayList;
import java.util.List;


		
public class TaskManager {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        
        taskManager.addTask("Lavar a louça");
        taskManager.addTask("Fazer compras");
        taskManager.addTask("Estudar programação");
        
        taskManager.displayTasks();
        
        taskManager.removeTask("Fazer compras");
        
        taskManager.displayTasks();
    }

	
	
	
	private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        System.out.println("Lista de tarefas:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}