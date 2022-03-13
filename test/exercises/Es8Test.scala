package exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import exercises.Es8.Option.*
import exercises.Es8.*

class Es8Test {

  private val none = None()
  private val opt1 = Some(5)

  @Test
  def testFilter() =
    assertEquals(opt1, filter(opt1)(_ > 2))
    assertEquals(none, filter(opt1)(_ > 8))
    assertEquals(none, filter(None[Int]())(_ > 2))

  @Test
  def testMap() =
    assertEquals(Some(true), map(opt1)(_ > 2))
    assertEquals(Some(false), map(opt1)(_ > 8))
    assertEquals(none, map(None[Int]())(_ > 2))

  @Test 
  def testMap2() =
    assertEquals(Some(5, 5), map2(opt1, opt1))
    assertEquals(Some(false, 5), map2(Some(false), opt1))
    assertEquals(none, map2(opt1, none))
}