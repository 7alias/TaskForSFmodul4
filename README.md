
Задача: сделать класс Helicopter, в котором описать объект вертолет:
У него должны быть переменные в статусе private.
public class Helicopter {

   private int x = 0;
   private int h = 0;
   private String name = "";
}
Setter должен принимать название, высоту и дальность вертолета.
Getter должен внутри класса Вертолет изменять параметры.

Создадим 2 вертолета с разными названиями и пусть 
1 вертолет будет на позиции высота 10, дальность 20
2 вертолет высота 20, дальность 30.
Покажем их позиции, далее пусть 1 вертолет летит вверх на 10 и 
назад на 10, а 2-й вертолет летит вперед на 10 и вниз на 30.

В итоге вертолет 2 должен разбиться и показывать позицию как “разбит”.

Данный текст должна написать программа:

Helicopter Apache at the altitude position: 10 and range: 20
Helicopter Chinook at the altitude position: 20 and range: 30
Helicopter Chinook crashed
Helicopter Apache at the altitude position: 20 and range: 10
Helicopter Chinook is broken.
