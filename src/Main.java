public class Main {
    public static void main(String[] args) {

        /*
         * Создание автомобиля вручную:

         * 1. создание топливной системы
         */

        FuelSystem fuelSystem = new FuelSystem(10);

        // 2. создание двигателя

        FuelEngine fuelEngine = new FuelEngine(120, 2);

        // 3. создание тормозной системы

        SteelBrakeSystem steelBrakeSystem = new SteelBrakeSystem();

        // 4. создание ходовой части

        FuelRunningGear fuelRunningGear = new FuelRunningGear(fuelEngine, fuelSystem, steelBrakeSystem);

        // 5. создание кузова Седан

        SedanCarBody sedanCarBody = new SedanCarBody();

        // 6. финальная сборка автомобиля

        Car car = new Car("VIN-123-456-789", fuelRunningGear, sedanCarBody);

        // проверка работоспособности дверей

        car.openDoor();
        car.closeDoor();

        // нажимаем на педаль газа и ничего не происходит

        car.pressGasPedal();

        // потому что бензина нет

        car.getCurrentFuelVolume();

        // заправляем полный бак

        car.fillUpFuel(16);

        // проверяем топливо в бензобаке

        car.getCurrentFuelVolume();

        // жмём 2 раза на газ

        car.pressGasPedal();
        car.pressGasPedal();

        // смотрим на скорость

        car.getCurrentSpeed();

        // проверка оставшегося топлива

        car.getCurrentFuelVolume();

        // жмём 1 раз на тормоз

        car.pressStopPedal();

        // смотрим скорость

        car.getCurrentSpeed();

        System.out.println();
        System.out.println("Сборка на конвейере");

        //Сборка автомобиля на конвейере

        CarFactory carFactory = new CarFactory();
        Car carFromFactory = carFactory.buildCar("123-456-789", 60, 45, 1, "-", true, 4);

        // проверка работоспособности дверей

        carFromFactory.openDoor();
        carFromFactory.closeDoor();


        // нажимаем на педаль газа и ничего не происходит

        carFromFactory.pressGasPedal();

        // потому что бензина нет

        carFromFactory.getCurrentFuelVolume();

        // заправляем полный бак

        carFromFactory.fillUpFuel(60);

        // проверяем топливо в бензобаке

        carFromFactory.getCurrentFuelVolume();

        // жмём 2 раза на газ

        carFromFactory.pressGasPedal();
        carFromFactory.pressGasPedal();

        // смотрим на скорость

        carFromFactory.getCurrentSpeed();

        // проверка оставшегося топлива

        carFromFactory.getCurrentFuelVolume();

        // жмём 4 раза на тормоз

        carFromFactory.pressStopPedal();
        carFromFactory.pressStopPedal();
        carFromFactory.pressStopPedal();
        carFromFactory.pressStopPedal();

        // смотрим скорость

        carFromFactory.getCurrentSpeed();

    }
}