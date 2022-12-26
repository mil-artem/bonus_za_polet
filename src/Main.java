public class Main {
    public static void main(String[] args) {

        int priceTiket = 12_550; // Стоимость билета в рублях
        int priceMile = 20; // Стоимость бонусной мили в рублях
        int mile = priceTiket / priceMile; // Расчет количества бонусных миль
        System.out.println("Всего бонусных миль: " + mile); // Вывод количества бонусных миль
    }
}