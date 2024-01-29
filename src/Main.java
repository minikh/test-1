public class Main {
    public static void main(String[] args) {

        int monthNumber = 11;
        final String season = switch (monthNumber) {
            case 12, 1, 2 -> "Сезон: Зима";
            case 3, 4, 5 -> "Сезон: Весна";
            case 6, 7, 8 -> "Сезон: Лето";
            case 9, 10, 11 -> "Сезон: Осень";
            default -> "Такого месяца не существует!";
        };

        System.out.println(season);
        System.out.println(season);
        System.out.println(season);
        System.out.println(season);
        System.out.println(season);
        System.out.println(season);
        System.out.println(season);
        System.out.println(season);
        System.out.println(season);
        System.out.println("Hello Misha");
    }


}