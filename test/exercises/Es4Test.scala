package exercises

import exercises.Es4.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Es4Test {

  @Test
  def testP1() =
    assertTrue(p1(1)(2)(3))
    assertFalse(p1(5)(2)(3))

  @Test
  def testP2() =
    assertTrue(p2(1, 2, 3))
    assertFalse(p2(5, 2, 3))

  @Test
  def testP3() =
    assertTrue(p3(1)(2)(3))
    assertFalse(p3(5)(2)(3))

  @Test
  def testP4() =
    assertTrue(p4(1, 2, 3))
    assertFalse(p4(5, 2, 3))
}