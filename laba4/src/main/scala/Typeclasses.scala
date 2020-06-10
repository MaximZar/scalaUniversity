package Lab_ex4

import Lab_ex4.Typeclasses.Reversable.ReversableLikeString
import Lab_ex4.Typeclasses.Smash.{SmashDouble, SmashInt, SmashString}

object Typeclasses {
  def main(args: Array[String]): Unit = {
    var test = ReversableLikeString
    var testStr = SmashString
    var testInt = SmashInt
    var testDouble = SmashDouble
    println(test.reverse("absf"))//Реверс
    println(testDouble.smash(1.2,2.3))//Умножение
    println(testStr.smash("ABC","SD"))//Сложение строк
    println(testInt.smash(1,2))//Сложение интов
  }
object Reversable {
  trait Reversable[T] {
    def reverse(a: T): T
  }

  def reverse[T: Reversable](item: T): T = {
    implicitly[Reversable[T]].reverse(item)
  }

  implicit object ReversableLikeString extends Reversable[String] {
    override def reverse(str: String): String = str.reverse

  }

}
  def textReversableString(str: String): String = Reversable.reverse(str)

object Smash{
  trait Smash[T]{
   def smash(a: T,b: T): T
  }

  def smash[T: Smash](item2: T,item3: T): T = {
    implicitly[Smash[T]].smash(item2,item3)
  }

  implicit object SmashInt extends Smash[Int]
  {
    override def smash(a: Int,b: Int): Int = a+b
  }
  implicit object SmashDouble extends Smash[Double]
  {
    override def smash(c: Double,d: Double): Double = c*d
  }
  implicit object SmashString extends Smash[String]
  {
    override def smash(e: String,f: String): String = e.concat(f)
  }
}

  def testSmashInt(a: Int, b: Int): Int = Smash.smash(a,b)
  def testSmashDouble(a: Double, b: Double): Double = Smash.smash(a,b)
  def testSmashString(a: String, b: String): String = Smash.smash(a,b)

}
