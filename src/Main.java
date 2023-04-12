import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stationery = Arrays.asList("карандаш", "ручка", "скрепка", "бумага", "маркер", "блокнот");
        List<String> filteredStationery = stationery.stream()
                .filter(s -> s.startsWith("к"))
                .toList();
        System.out.println("\nРешение Задачи №1: \n" + filteredStationery); //решение первого задания

        List<String> books = Arrays.asList("Война и мир", "Преступление и наказание", "Унесенные ветром", "Бесы");
        List<String> sortedBooks = books.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println("\nРешение Задачи №2: \n" + sortedBooks); //второго

        List<SimpleClass> simpleClasses = Arrays.asList(
                new SimpleClass("email1", Status.NEW),
                new SimpleClass("email2", Status.SEND),
                new SimpleClass("email3", Status.NEW));
        List<SimpleClass> newStatusClasses = simpleClasses.stream()
                .filter(simpleClass -> simpleClass.getSendStatus().equals(Status.NEW))
                .toList();
        System.out.println("\nРешение Задачи №3: \n" + newStatusClasses);

        List<String> simpleBooks = Arrays.asList("Философия Java",
                "Грокаем Алгоритмы",
                "Java: Полное руководство",
                "Философия Java",
                "Грокаем Алгоритмы",
                "Грокаем Алгоритмы",
                "Java: Полное руководство");
        List<String> uniqueBooks = simpleBooks.stream()
                .distinct()
                .toList();
        System.out.println("\nРешение Задачи №4: \n" + uniqueBooks);

        List<String> employees = Arrays.asList("Бакыт", "не Бакыт", "фальшивый Бакыт");
        boolean containsBakyt = employees.stream()
                .anyMatch(s -> s.equals("Бакыт"));

        System.out.println("\nРешение Задачи №5: \n" + "Есть ли в списке Бакыт? - " + containsBakyt);

        List<String> strings = Arrays.asList("str1", "str2", "str3", "str4");
        String joinedString = String.join(";", strings);
        System.out.println("\nРешение Задачи №6: \n" + joinedString);

        List<Integer> ints = Arrays.asList(12, 45, 100, 101, 4, 34, 74, 99);
        List<Integer> intsMoreThan100 = ints.stream()
                .filter(integer -> integer > 100)
                .toList();
        System.out.println("\nРешение Задачи №7: \n" + intsMoreThan100);

        List<Double> nums = Arrays.asList(1.2, 3.14, 5.3, 7.8);
        double average = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(Double.NaN);
        System.out.println("\nРешение Задачи №8: \n" + average);
    }
}
