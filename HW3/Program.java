package HW3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию имя и отчество, используя пробел (лучше латиницей): ");
        String fullName = scanner.nextLine();

        System.out.println("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();

        scanner.close();

        // Проверяем количество введенных данных, если не совпадает с требуемым, выбрасываем исключение IllegalArgumentException.
        String[] fullNameParts = fullName.split(" ");
        if (fullNameParts.length != 3) {
            throw new IllegalArgumentException("Ошибка: неверный формат ФИО");
        }

        if (phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Ошибка: введите номер телефона");
        }

        // Проверяем формат данных, если формат неверный, выбрасываем исключение.
        String lastName = fullNameParts[0];
        String firstName = fullNameParts[1];
        String middleName = fullNameParts[2];

        String formattedPhoneNumber = phoneNumber.replaceAll("[^0-9]+", "");
        if (formattedPhoneNumber.length() != 11) {
            throw new IllegalArgumentException("Ошибка: неверный формат номера телефона. Номер должен содержать 11 цифр.");
        }

        // Создаем строку в необходимом формате и записываем ее в файл
        String dataString = "<" + lastName + ">" + "<" +  firstName + ">" + "<" +  middleName + ">" + 
            "<" + formattedPhoneNumber + ">" + "\n";
        try (FileWriter writer = new FileWriter(lastName + ".txt", true)) {
            writer.write(dataString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Данные записаны в файл " + lastName + ".txt");
    }
}
