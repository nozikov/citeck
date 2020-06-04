package home.task3;

import org.junit.Assert;
import org.junit.Test;

public class NumberChangerTest {

  private final NumberChanger numberChanger = new NumberChanger();

  //7 -> 0111 => should be returned 1111 = 15
  @Test
  public void shouldReturnFifteenIfSeven(){
    Assert.assertEquals(numberChanger.changeTheMostRightDigitFromZeroToOne(7), 15);
  }

  //11 -> 1011 => should be returned 1111 = 15
  @Test
  public void shouldReturnFifteenIfEleven(){
    Assert.assertEquals(numberChanger.changeTheMostRightDigitFromZeroToOne(11), 15);
  }

  //6 -> 110 => should be returned 111 = 7
  @Test
  public void shouldReturnSevenIfSix(){
    Assert.assertEquals(numberChanger.changeTheMostRightDigitFromZeroToOne(6), 7);
  }

}