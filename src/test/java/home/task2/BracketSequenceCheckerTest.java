package home.task2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BracketSequenceCheckerTest {

  private final BracketSequenceChecker bracketSequenceChecker = new BracketSequenceChecker();

  @Test
  public void ShouldReturnTrueOnValidSequence() {
    Assert.assertTrue(bracketSequenceChecker.check("((()))"));

    Assert.assertTrue(bracketSequenceChecker.check("()()()"));
  }

  @Test
  public void shouldReturnTrueOnEmptyString() {
    Assert.assertTrue(bracketSequenceChecker.check(""));
  }

  @Test
  public void shouldReturnFalseOnIncorrectBracketSequence() {
    Assert.assertFalse(bracketSequenceChecker.check("(()}"));
  }

  @Test
  public void shouldReturnFalseWhenStackNonEmptyInTheEnd() {
    Assert.assertFalse(bracketSequenceChecker.check("((()"));
  }

}