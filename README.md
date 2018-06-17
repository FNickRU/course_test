[![Build Status](https://travis-ci.org/FNickRU/course_test.svg?branch=master)](https://travis-ci.org/FNickRU/course_test)

# Курс тест по Java

Цель курса
----------

Проверить собственные логические и алгоритмические способности к профессиональному программированию. 
В случае если я полностью выполню все задания, то могу смело продолжать изучать программирование, 
т.к. у меня есть хороший потенциал стать высококвалифицированными разработчиками ПО.

Описание
--------

В курсе собраны 20 задач возрастающей сложности. Каждая задача состоит из подготовленного каркаса классов и 
полностью написанных автоматических тестов. То есть все задания будут автоматически проверены.
В данном курсе используется подход TDD. Минимальные инструменты необходимые для прохождения курса, рекоммендуемые автором: Maven, Git, Java 8.
Также от себя добавлен плагин Checkstyle для проверки правильности написания как своего кода, так и тестов ;)

Необходимо ознакомиться c заданием и перейти к реализации недостающего кода и классов. 
После завершения реализации необходимо зайти в папку 

*/src/test/java/ru/parsentev/task_XXX/*

и в каждом классе убрать аннотацию 

*@Ignore* - это аннотация используется для игнорирования тестов.

после этого необходимо провести сборку.

Система сборки должна успешно пройти все тесты. Если тесты упали, необходимо поправить код.
Код тестов править не дозволяется, но в силу найденный ошибок в их исходном коде такая мера была предпринята.

Темы, знание которых необходимо для прохождения курса:
- Типы данных
- Арифметические операции
- Операторы условия
- Циклы
- Массивы
- Наследование
- Полиморфизм
- Инкапсуляция
- Исключения

Задания
-------

1. Реализовать программу калькулятор. Калькулятор должен выполнять операции:
   сложение, вычитание, умножение, деление, возведение в степень.
   При выполнении деления ввести проверку на 0.
   Если второй аргумент 0 нужно выкинуть исключение java.lang.IllegalStateException
   
2. Реализовать класс точку, описывающую точку в системе координат x, y - Point(x, y).
   объект точка должен иметь методы double Point#distanceTo(Point point) - метод должен вычислять расстояние
   между двумя точками.

3. Реализовать класс треугольник. Треугольник должен описываться через точки в системе координат.
   Объект треугольник должен иметь методы:
   boolean exists() - проверяет существует ли треугольник или нет.
   double area() - вычисляет площадь треугольника. 
   Если треугольник не существует выбросить исключение java.lang.IllegalStateException
   
4. Реализовать класс равнобедренный треугольник наследуя класс треугольник из задания 3.
   Дополнить поведение метода boolean exists() - true, если треугольник равнобедренный.
   Остальное поведение оставить прежним.

5. Реализовать класс прямоугольный треугольник наследуя класс треугольник из задания 3.
   Дополнить поведение метода boolean exists() - true, если треугольник прямоугольный. 
   Остальное поведение оставить прежним.

6. Реализовать класс квадрат основанный на четырех точках Point(x, y).
   boolean exists() - проверяет существует ли квадрат или нет.

7. Реализовать класс Expression. Класс должен принимать строку из просто математического выражения
   и методы double calc(). Должен поддерживать операции "+", "-", "/", и "*".
   Например, "2+2" ==> 4, "2-2" ==> 0
   Если выражение не корректное выбросить исключение java.lang.IllegalStateException

8. Реализовать класс вычисляющий простые числа до N.

9. Реализовать метод подсчета уникальных символов в строке.

10. Реализовать методы проверки корректности открытых и закрытых скобок.
    Например, ()(()((()))) - true, ()) - false
 
11. Задан массив чисел со значениями 0 и 1. Нужно проверить, что все значения в массиве равны 1.
    Например, [0, 1] - false, [1, 1] - true, 

12. Задан массив чисел со значениями 0 и 1. 
    Нужно проверить, что в массиве есть последовательности из трех и больше единиц.
    Например, [0, 1, 1] - false, [1, 1, 1] - true,

13. Задан числовой массив. Нужно проверить, что все значения в массиве одинаковые.
    Например, [0, 0, 0] - true, [1, 1, 1] - true, [0, 1, 1] - false,

14. Задано предложение. Нужно переставить слова в обратно порядке.
    Например, "программируй и зарабатывай" -> "зарабатывай и программируй"

15. Задан числовой массив. Нужно реализовать метод кольцевого сдвига вправо на N. int[] shift(). 
    Не использовать дополнительный массив.
    Например, [1, 2, 3, 4, 5] - shift(2) - [4, 5, 1, 2, 3]

16. Задан квадратный массив. Нужно проверить, что в нем есть выигрышные варианты для игры крестики-нолики.

17. Реализован банкомат размена денег. Автомат принимает бумажную купюру и обменивает на монеты. 
    Метод должен возвращать список всех возможных вариантов размены купюры.

18. Задан двойной массив, заполненный нулями и единицами. Нужно определить самое большое множество единиц. 
    Множеством считается объединение единиц, которые соприкасаются друг с другом. 
    Диагональное соприкосновение не учитывать.

19. Задан двойной массив из единиц и нулей. Нужно найти минимальный путь от точки А до точки В. 
    Двигаться можно только по единицам и только по вертикали или горизонтали. 

20. Задан одномерный массив. Нужно найти все возможные варианты перестановок этого массива.
