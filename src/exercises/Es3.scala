package exercises

object Es3 extends App :

  //a
  val parityVal: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  def parityDef(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  //b
  val negVal: (String => Boolean) => (String => Boolean) = p => (i => !p(i))

  def negDef(p: String => Boolean): (String => Boolean) = i => !p(i)

  //c
  def neg[X](x: X => Boolean): (X => Boolean) = i => !x(i)
