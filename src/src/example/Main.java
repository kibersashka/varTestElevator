package example;//Задачи:
//1. Структура для определения состояния лифта (интерфейс с методом ElevatorState state(),
//  ElevatorState перечисление состояний: не работает, едет наверх, едет вниз, стоит)


//2. Абстрактный класс, описывающие  лифт, реализующий интерфейс п.1, с атрибутами:
//состояние
// , текущий этаж (1 вначале и для неисправного),
// этаж назначения (может быть null);
//наследники: лифт для четных этажей, лифт для нечетных этажей, лифт для сотрудников



//3. Интерфейс Вызов, описывающий вызов лифта, в зависимости от ситуации (Перечисление: нужен четный этаж, нечетный, сотрудник), этаж назначения
//Все вызовы осуществляются с 1-го этажа

//4. Реализация интерфейса Вызов
//Генерация и обработка исключения, если все лифты заняты (т. е. находятся в движении или неисправны)


//      5. Интерфейс Шаг , описывающий смену статуса лифта (едет наверх — увеличиваем текущий этаж на 1, едет вниз — уменьшаем текущий этаж на 1
// , стоит или неисправен — ничего не меняем)




//6. Класс описывающий динамику процесса работы лифтов, запустить 10000 итераций,
// на каждой 20-й осуществлять вызов на случайный этаж, в обработке исключения выводить в консоль ошибку с описанием типа лифта и заказанного этажа.
//



//7. Тест:
//Создание 3 лифтов для четных этажей
//Создание 3 лифтов для нечетных этажей
//Создание 1 лифта для сотрудников
//Запуск процесса работы лифтов

import java.lang.Process;

public class Main {
    public static void main(String[] args) {
        Processs processs = new Processs();
        processs.doElevator();


       /* Elevator elevatorCH = new EvenElevator(ElevatorState.STAND);
        CallElevator callElevator = new CallElevator(4, CallTools.EVEN);
        System.out.println(elevatorCH.possibilityCall(callElevator));

        */
    }

}