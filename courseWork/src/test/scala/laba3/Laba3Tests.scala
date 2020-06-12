package laba3

import org.scalatest.FunSuite

class Laba3Tests extends FunSuite {
// String.scala
    test("String.scala testUppercase") {
        assert(Strings.testUppercase("Hello") == "HELLO")
    }
    test("String.scala testInterpolations") {
        val testInterpolations = Strings.testInterpolations("Maxim", 19)
        val result = "Hi my name is Maxim and I am 19 years old."
        assert(testInterpolations == result)
    }
    test("String.scala testComputation") {
        val testComputation = Strings.testComputation(100, 200)
        val result = "Hi, \n now follows a quite hard calculation. We try ta add: \n\ta := 100 \n\tb := 200\n\n\tresult is 300"
        assert(testComputation == result)
    }
    test("String.scala testTakeTwo") {
        val testTakeTwo = Strings.testTakeTwo("qwerty")
        val result = "qw"
        assert(testTakeTwo == result)
    }


// Sequence.scala
    test("Sequence.scala testLastElement") {
        val seq = Seq[Int](1, 2, 3)
        val testLastElement = Sequence.testLastElement(seq)
        val result = Option[Int](3)
        assert(testLastElement == result)
    }
    test("Sequence.scala testZip") {
        val testZip = Sequence.testZip(Seq[Int](1, 2), Seq[Int](3, 4))
        val result = Seq((1, 3), (2, 4))
        assert(testZip == result)
    }
    test("Sequence.scala testForAll") {
        val cond: Int => Boolean = _ % 2 == 0
        val testForAll = Sequence.testForAll(Seq(1, 2))(cond)
        val result = false
        assert(testForAll == result)
    }
    test("Sequence.scala testPalindrom") {
        val testPalindrom = Sequence.testPalindrom(Seq(2, 5, 5, 2))
        val result = true
        assert(testPalindrom == result)
    }
    test("Sequence.scala testFlatMap") {
        val seq = Seq((1,2),(3,4))
        val func = ((a: Int, b: Int)) => Seq(a, b) //((Int, Int)) => Seq[?]
        val result = Seq(1,2,3,4)
        val testFlatMap = Sequence.testFlatMap(seq)(func)
        assert(testFlatMap == result)
    }
}