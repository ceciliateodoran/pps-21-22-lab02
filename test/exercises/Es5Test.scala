package exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import exercises.Es5.*

class Es5Test {

  @Test
  def testComposeDef() =
    assertEquals(9, composeDef(_ - 1, _ * 2)(5))

  @Test
  def testComposeVal() =
    assertEquals(9, composeVal(_ - 1, _ * 2)(5))

  @Test
  def testComposeGen() =
    val f: Int => Boolean = _ == 0
    val g: Int => Int = _ * 2
    assertFalse(composeGen(f,g)(5))
    assertEquals(9, composeGen[Int, Int, Int](_ - 1, _ * 2)(5))
}