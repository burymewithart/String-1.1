import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    {
            // Задание номер 1
            System.out.println("Задача 1");
            String firstName = "Andrey";
            String middleName = "Andreevich";
            String lastName = "Andreev";

            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("Ф.И.О. сотрудника - " + fullName);
    }
    {
            // Задание номер 2
            System.out.println("Задача 2");
            String fullName = "Andreev Andrey Andreevich";
            String fullNameUpperCase = fullName.toUpperCase();
            System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameUpperCase);
    }
            // Задание номер 3
            System.out.println("Задача 3");
            String fullName = "Иванов Артём Артёмович";

            String correctedFullName = fullName.replace('ё', 'е');

            System.out.println("Данные Ф.И.О. сотрудника - " + correctedFullName);
    }
}
