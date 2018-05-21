public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("klasa to SZABLON RODZAJU CECH I FUNKCJONALNOSCI");
        System.out.println("obiekt to KONKRETNY EGZEMPLARZ KLASY i jest tworzony na podstawie  PÓL KLASY");
        System.out.println("zmienna to ELEMENT DO PRZECHOWYWANIA DANYCH KTÓREMU MOŻEMY PRZYPISYWAć ROZNE WARTOSCI");
        System.out.println("Każda zmienna musi mieć określony TYP DANYCH, np. int, albo String.");
        System.out.println("W klasie mogą się znajdować NAZWA, POLA i METODY ");
        System.out.println("TYPY OBIEKTOWE są wywoływane przez operator NEW i służą do tworzenia nowych obiektów.");
        System.out.println("Jeśli w klasie zdefiniowano chociaż jeden PARAMETR to kompilator nie wygeneruje dla nas KONSTRUKTORA domyślnego.");
        System.out.println("Zakładając, że istnieje klasa Car, to przy zapisie");
        System.out.println("Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);\n" +
                "\n" +
                "car1 nazywamy ZMIENNA,");
        System.out.println("a przy zapisie:\n" +
                "\n" +
                "Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);  Car car2 = car1;\n" +
                "\n" +
                "car1 I car2 to dwie REFERENCJE wskazujące na ten sam OBIEKT");
    }
}