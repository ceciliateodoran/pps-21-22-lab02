package exercises

import exercises.Es7.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Es7Test {
  
  @Test
  def testPerimeter() =
    assertEquals((2 + 5) * 2, perimeter(Shape.Rectangle(2,5)))
    assertEquals(9 * 2 * Math.PI, perimeter(Shape.Circle(9)))
    assertEquals(7 * 4, perimeter(Shape.Square(7)))

  @Test
  def testArea() =
    assertEquals(4 * 5, area(Shape.Rectangle(4,5)))
    assertEquals(9 * 9 * Math.PI, area(Shape.Circle(9)))
    assertEquals(3 * 3, area(Shape.Square(3)))
}