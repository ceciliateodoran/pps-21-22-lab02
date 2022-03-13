package exercises

object Es8 extends App:

  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:

    def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = opt match
      case Some(a) if f(a) => Some(a)
      case _ => None()

    def map[A, B](opt: Option[A])(f: A => B): Option[B] = opt match
      case Some(a) => Some(f(a))
      case _ => None()

    def map2[A, B](opt1: Option[A], opt2: Option[B]): Option[(A, B)] = (opt1, opt2) match
      case (Some(a), Some(b)) => Some((a, b))
      case _ => None()