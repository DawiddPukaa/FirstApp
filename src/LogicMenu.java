import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogicMenu {
    DataTasks dataTasks;

    public String[] userSavedTasks;
    String fileName = "todolist.txt";
    File file = new File(fileName);

    ArrayList<String> tasks = new ArrayList<>();

    public void seeTasks(){
        for (String task: tasks) {
            System.out.println(task);
        }
    }
    
    public void menuForUser(int choice) throws IOException { // wyswietllanie zadan wpisanych przez usera
        Scanner scanner = new Scanner(System.in);
        String taskFromUser;

        switch (choice) {
            case 1:
                seeTasks();
                break;
            case 2:
                taskFromUser = scanner.nextLine();
                   try (
                    var fileWriter = new FileWriter(fileName);
                    var writer = new BufferedWriter(fileWriter);
                    ){
                       writer.write(taskFromUser);
                   }

                break;
            case 3:
                //usunięcię danego zadania
                break;
            default:
                //tutaj komunikat że nie wybrał żadnej z opcji :D
        }

    }
}