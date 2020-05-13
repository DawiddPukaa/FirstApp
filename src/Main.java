import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> tasks = new ArrayList<>();
        String taskFromUser;
        String taskFromFile = "";
        int choice = 0;
        int indexListt = 0;
        int indexList = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String fileName = "todolist.txt";
        File file = new File(fileName);
        try {

            if (file.createNewFile()) {
                System.out.println("Plik został utworzony.");
            } else
                System.out.println("Plik już istnieje.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Scanner scanFile = new Scanner(file)) {
            while(scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
               // String d[] = line.split(" ");

                tasks.add(indexListt,line);
                indexListt++;
            }
        }


        //tutaj ma się kopiować coś z pliku do listy jeśli coś tam jest
        DisplayClass.iformationForUserWhatHeCanDo();

        while (choice != 5) {


            choice = scanner.nextInt();

            if (choice == 1) {
                // wyświetlania listy
                for (String task : tasks) {
                    System.out.println(task);
                }
            }
            if (choice == 2) {
                taskFromUser = scanner1.nextLine();
                tasks.add(taskFromUser);
            }

            if (choice == 3) {
                System.out.println("Który element listy chciałbys usunąć");
                indexList = scanner.nextInt();
                tasks.remove(indexList - 1);
            }
            if (choice == 4) {
                try (Scanner scanList = new Scanner(String.valueOf(tasks))) {
                    PrintWriter write = new PrintWriter(fileName);

                    while (scanList.hasNextLine()) {
                        String taskFromTheList = scanList.nextLine();
                        write.println(taskFromTheList);

                    }
                    write.close();


                }
            }


        }
    }
}

