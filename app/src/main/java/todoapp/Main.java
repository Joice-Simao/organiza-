package todoapp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author joice
 */
public class Main {
    
     public static void main(String[] args) throws SQLException {
/*
        ProjectController projectController = new ProjectController();//         
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description");         
          projectController.save(project);  

        ProjectController projectController = new ProjectController();        
        Project project = new Project();
        project.setId(1);
        project.setName("Teste project");
        project.setDescription("description");
          projectController.update(project);
          
          List<Project> projects = projectController.getAll();
          System.out.println("Total de projetos = "+projects.size());
  
        projectController.removeById(2);
   

        TaskController taskController = new TaskController();        
        Task task = new Task();
        task.setIdProject(1);
        task.setName("Teste task");
        task.setDescription("description");
        task.setNotes("No notes here");
        task.setCompleted(false);
        task.setDeadline(new Date());
        taskController.save(task);
        
        
        TaskController taskController = new TaskController();        
        Task task = new Task();
        task.setId(1);
        task.setIdProject(1);
        task.setName("update task");
        task.setDescription("description");
        task.setNotes("No notes here");
        task.setCompleted(true);
        task.setDeadline(new Date());
        taskController.update(task);

          taskController.removeById(3);

        List<Task> tasks = taskController.getAll();
        System.out.println("Total de tasks = "+tasks.size());
*/        

         
     }
    
}
