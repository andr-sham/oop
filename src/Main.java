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
            carArray[i] = carFactory.buildCar(Integer.toString((i + 1) * 256 - ((i + 1) * 32)),
                    (i + 1) * 10 + 30, (i + 1) * 20, i + 1,
                    i % 2 == 0 ? "Sedan" : "Hatchback", i % 2 == 0, i + 1);
            carArray[i].fillUpFuel(40);
            System.out.println();
        }
        System.out.println("Создано " + carArray.length + " автомобилей");
        for (int i = 0; i < 4; i++) {
            carArray[i].getCurrentFuelVolume();
        }
        carArray[0] = null;
        carArray[carArray.length - 1] = null;

    }
}