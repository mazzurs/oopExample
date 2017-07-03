package sample;
/*Маємо дві версії квадрокоптера (Mavic_1 та Mavic_2). Mavic_2  це удосконалена версія квадрокоптера Mavic_1, тому
* вона має усі функції свого батька (збільшити, зменшити висоту, та вивести її на екран) та ще додаткові, свої, функції
* (збільшити, або зменшити швидкість польоту, зависнути у повітрі, та вивести швидкість польоту на екран). Поліморфізм полягає
* у тому, що ми можемо використовувати пульт управління від старшої моделі квадрокоптера до новішого квадрокоптера, але не навпаки,
*  так як ми не знаємо
 * які функції можуть бути у новішого пульта.
 *      Інкапсуляцію я виразив у способі реалізації внутрішнього механізму зміни висоти та швидкості польоту. Тільки
 *      сам обєкт може змінити свій стан, попередньо перевіряючи умови обмеження, щоб не допустити перебування у
 *      некоректному стані.
*
*
* */


public class Main  {


    public static void main(String[] args)
    { // Використовуємо пульт від квадрокоптера Mavic_2 до квадрокоптера Mavic_2
        Mavic_2 mav = new Mavic_2();
        mav.on();
        mav.off();
        mav.increaseSpeed();
        mav.increaseSpeed();
        mav.increaseSpeed();
        System.out.println("Швидкість:" + mav.getSpeed());
        mav.increaseHeight();
        mav.increaseHeight();
        System.out.println("Висота:" + mav.getHeight());

        // Використовуємо пульт управління від квадрокоптера Mavic_1 до квадрокоптера Mavic_2. Як бачимо, функції зависання
        // у повітрі (метод hangs()), збільшення, та зменшення швидкості (increaseSpeed() та reduceSpeed()) уже немає , так як
        // пульт управління від Mavic_1 не підтримує ці функції.
        Mavic_1 mav2 = new Mavic_2();
        mav2.on();
        mav2.increaseHeight();
        mav2.increaseHeight();
        System.out.println("Висота:" + mav2.getHeight());
        mav2.off();

    }
}