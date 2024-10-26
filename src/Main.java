public class Main {
    public static void main(String[] args) {
        int totalSeats = 56;
        int[] stops = {4, 15, 7}; // Пассажиры на каждой остановке
        Boolean[] seats = new Boolean[totalSeats]; // Массив для отслеживания занятых мест

        int currentIndex = 0;

        for (int passengers: stops) {
            for (int i = 0; i < passengers; i++) {
                if (currentIndex < totalSeats) {
                    seats[currentIndex] = true; // Занять место
                    currentIndex++;
                } else {
                    System.out.println("Автобус заполнен на остановке");
                    break;
                }
            }
        }
        System.out.println("Свободные места");
        for (int i = 0; i < totalSeats; i++) {
            if (seats[i] == null) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}