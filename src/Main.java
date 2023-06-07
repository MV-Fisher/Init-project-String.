import java.lang.String ;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача № 1.");
        String firstName = "Mishail" ;
        String middleName = "Viktorovich" ;
        String lastName = "Fisher" ;
        String fullName = lastName + " " +  firstName + " " + middleName ;
        System.out.println(fullName);
    }
    public static void task2() {
        System.out.println("Задача № 2.") ;
        String firstName = "Mishail" ;
        String middleName = "Viktorovich" ;
        String lastName = "Fisher" ;
        String fullName = lastName + " " +  firstName + " " + middleName ;
        System.out.println("Данные ФИО сотрудника, для заполнения отчёта " +
                fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача № 3.") ;
        String firstName = "Семён" ;
        String middleName = "Семёнович" ;
        String lastName = "Иванов" ;
        String firstName2 = firstName.replace("ё" , "е") ;
        String middleName2 = middleName.replace("ё", "е");
        String fullName = lastName + " " +  firstName2 + " " + middleName2 ;
        System.out.println("Данные ФИО сотрудника " + fullName);
    }
}