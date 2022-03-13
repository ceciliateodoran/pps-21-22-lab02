package exercises

object Es5 extends App:

  def composeDef(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  val composeVal: (Int => Int, Int => Int) => Int => Int = (f, g) => x => f(g(x))

  def composeGen[A, B, C](f: C => B, g: A => C): A => B = x => f(g(x))
