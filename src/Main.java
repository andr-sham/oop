import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("Сборка на конвейере");

        //Сборка автомобиля на конвейере

        CarFactory carFactory = new CarFactory();

        // создаём массив для хранения 4-х автомобилей

        System.out.println();
        System.out.println("Раздел 9 Практика");

        Car[] carArray = new Car[4];
        for (int i = 0; i < 4; i++) {
            carArray[i] = carFactory.buildCar(Integer.toString((i + 1) * 256 - ((i + 1) * 32)), (i + 1) * 10 + 30, (i + 1) * 20, i + 1, i % 2 == 0 ? "Sedan" : "Hatchback", i % 2 == 0, i + 1);
            carArray[i].fillUpFuel(40);
            System.out.println();
        }
        System.out.println("Создано " + carArray.length + " автомобилей");
        for (int i = 0; i < 4; i++) {
            carArray[i].getCurrentFuelVolume();
        }
        carArray[0] = null;
        carArray[carArray.length - 1] = null;
        System.out.println(Arrays.toString(carArray));

        // Усложненный вариант практики работы с массивами

        System.out.println();
        System.out.println("Функциональный тестовый сценарий для проверки корректности работы программы");


        // п. 1

        int size = 3;
        CarsharingParking carsharingParking = new CarsharingParking(size);

        // п. 2

        carsharingParking.getAvailableCarsNumber();

        // п. 4

        carsharingParking.getAvailableFreeSpacesNumber();

        // п. 6

        carsharingParking.rentCar();

        // п. 8

        for (int i = 0; i < size; i++) {
            carsharingParking.returnCar(carFactory.buildCar(Integer.toString(i), 50, 100,
                    2, "Sedan", false, 0));
        }

        // п. 9

        carsharingParking.getAvailableCarsNumber();

        // п. 11

        carsharingParking.getAvailableFreeSpacesNumber();

        // п. 13

        for (int i = 0; i < size; i++) {
            carsharingParking.getCarVinByPlaceNumber(i + 1);
        }

        // п. 15

        carsharingParking.returnCar(carFactory.buildCar("123", 50, 100, 2,
                "Sedan", false, 0));

        // п. 17,18

        carsharingParking.rentCar();
        carsharingParking.rentCar();

        // п. 19

        carsharingParking.getAvailableCarsNumber();

        // п. 21

        carsharingParking.getAvailableFreeSpacesNumber();

        // п. 23

        carsharingParking.returnCar(carFactory.buildCar("123", 50, 100, 2,
                "Sedan", false, 0));

        // п. 24

        carsharingParking.getAvailableCarsNumber();

        // п. 24

        carsharingParking.getAvailableFreeSpacesNumber();

        // п. 28

        for (int i = 0; i < size; i++) {
            carsharingParking.getCarVinByPlaceNumber(i + 1);
        }


    }
}