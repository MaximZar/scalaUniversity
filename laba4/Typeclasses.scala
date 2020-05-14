package Lab_ex4

object Typeclasses {

  // a) Определите тайп-класс Reversable, который представляет в обратном порядке значения.

  trait Reversable[T]

  object Reversable {
    def reverse[T: Reversable](a: T): T = ???
  }

  // b) Реализуйте функцию Reverse для String.



  // примените тайп-класс-решение из пункта (a) здесь
  def testReversableString(str: String): String = str

  // c) Определите тайп-класс Smash таким образом чтобы в нем была функция smash, которая выполняет операцию со значениями одного типа.

  trait Smash[T]

  object Smash {
    def smash[T : Smash](a: T, b: T): T = ???
  }

  // d) Реализуйте  функции Smash для типа Int и Double.
  //    Используйте сложение для типа Int у умножение для типа Double.



  // примените тайп-класс-решение из пункта (d) здесь
  def testSmashInt(a: Int, b: Int): Int = a

  // примените тайп-класс-решение из пункта (d) здесь
  def testSmashDouble(a: Double, b: Double): Double = a


  // e) Реализуйте функцию Smash для типа String. Необходимо выполнить конкатенацию строк, которые будут получены в качестве параметра. 



  // примените тайп-класс-решение из пункта (d) здесь
  def testSmashString(a: String, b: String): String = a
}

// Реализуйте тестовые функции с выводом на экран проверки разработанных функций.