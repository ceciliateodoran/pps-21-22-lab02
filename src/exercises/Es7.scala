package exercises

object Es7 extends App:

  enum Shape:
    case Rectangle(width: Double, height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  def perimeter(shape: Shape): Double = shape match
    case Shape.Rectangle(b, h) => (b + h) * 2
    case Shape.Circle(r) => r * 2 * Math.PI
    case Shape.Square(s) => s * 4

  def area(shape: Shape): Double = shape match
    case Shape.Rectangle(b, h) => b * h
    case Shape.Circle(r) => r * r * Math.PI
    case Shape.Square(s) => s * s