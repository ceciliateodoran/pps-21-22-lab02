package exercises

object Es6 extends App:

  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 1) + fib(n - 2)

  def fibTail(n: Int): Int =
    @annotation.tailrec
    def _fib(n: Int, current: Int, next: Int): Int = n match
      case 0 => current
      case _ => _fib(n - 1, next, current + next)
    _fib(n, 0, 1)