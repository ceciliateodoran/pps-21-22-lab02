package exercises

import exercises.Es3.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Es3Test {

  private val even = "even"
  private val odd = "odd"

  @Test
  def testParityVal =
    assertEquals(even, parityVal(4))
    assertEquals(even, parityVal(28))
    assertEquals(odd, parityVal(1))
    assertEquals(odd, parityVal(79))

  @Test
  def testParityDef =
    assertEquals(even, parityDef(2))
    assertEquals(even, parityDef(240))
    assertEquals(odd, parityDef(17))
    assertEquals(odd, parityDef(21))

  @Test
  def testNegVal =
    val empty: String => Boolean = _ == ""
    val notEmpty = negVal(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))

  @Test
  def testNegDef =
    val empty: String => Boolean = _ == ""
    val notEmpty = negDef(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))

  @Test
  def testNegGeneric =
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))
}