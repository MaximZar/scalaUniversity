package laba3

import org.scalatest.FunSuite

class Laba3Tests extends FunSuite {
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


    test("Sequence.scala testLastElement") {
        val testLastElement = Sequence.testLastElement(Seq[Int](1, 2, 3))
        val result = Option(3)
        assert(testLastElement == result)
    }
}