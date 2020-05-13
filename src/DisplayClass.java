public class DisplayClass {

    public static void iformationForUserWhatHeCanDo() {
        System.out.println("Witaj. Skoro tutaj jesteś pewnie nie wiesz jak zaplanować swoje zadania lub często o " +
                "czymś zapomniasz. Nic nie szkodzie dlatego właśnie stworzyłem tą aplikacje dla ciebie.");

        System.out.println("Masz oto takie opcje do wobru: ");
        System.out.println("Wciśnij 1. aby wyświetlić swoją listę zadań.");
        System.out.println("Wciśnij 2. aby dodać nowe zadanie.");
        System.out.println("Wciśnij 3. aby usunąć zadanie które już wykonałes.");
        System.out.println("Wciśnij 4. aby zapisać zamiany w liście.");
        System.out.println("Wciśnij 5. aby zakończyć prace prgramu.");
    }

    public static void displayTasks(String[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
}
