/**
 * Класс каршерингового сервиса
 */
public class CarsharingParking implements iCarsharingParking {

    /**
     * создаём автопарк с size количеством машин
     */
    private Car[] cars;

    /**
     * счётчик текущего свободного автомобиля
     */

    private int indexOfCurrentCar;

    /**
     * конструктор для создания каршерингового парка
     *
     * @param size максимальное количество автомобилей в парке
     */

    public CarsharingParking(int size) {
        cars = new Car[size];
    }

    /**
     * метод отображения количества доступных машин
     */
    @Override
    public void getAvailableCarsNumber() {
        System.out.println("Доступно " + indexOfCurrentCar + " автомобилей для аренды");
    }

    /**
     * метод отображения количества свободных мест
     */
    @Override
    public void getAvailableFreeSpacesNumber() {
        System.out.println("Доступно " + (cars.length - indexOfCurrentCar) + " мест для парковки");
    }

    /**
     * метод отображения VIN номера автомобиля находящемся на определенном парковочном месте
     *
     * @param placeNumber номер парковочного места
     */
    @Override
    public void getCarVinByPlaceNumber(int placeNumber) {
        if (placeNumber <= indexOfCurrentCar) {
            System.out.print("VIN номер автомобиля по месту " + placeNumber + ": ");
            cars[placeNumber - 1].getVin();
        } else {
            System.out.println("Невозможно получить VIN номер автомобиля по номеру места " + placeNumber + " так как автомобиль на данном месте отсутствует");
        }
    }

    /**
     * метод взятия в аренду автомобиля
     *
     * @return объект автомобиль в аренду
     */
    @Override
    public Car rentCar() {
        if (indexOfCurrentCar > 0) {
            Car rentCar = cars[indexOfCurrentCar - 1];
            cars[indexOfCurrentCar-- - 1] = null;
            return rentCar;
        } else {
            System.out.println("В автопарке отсутствуют свободные автомобили. Нельзя взять автомобиль в аренду в текущий момент");
            return null;
        }
    }

    /**
     * метод возврата автомобиля в паркинг
     *
     * @param car объект возвращаемый автомобиль
     */
    @Override
    public void returnCar(Car car) {
        if (indexOfCurrentCar < cars.length) {
            cars[indexOfCurrentCar++] = car;
        } else {
            System.out.println("В автопарке отсутствуют свободные места. Нельзя разметить в нем данный автомобиль");
        }

    }
}
