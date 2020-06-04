package home.task1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class StatisticCollectorTest {

  private final StatisticCollector statisticCollector = new StatisticCollector();

  @Test
  public void testSolution1() {
    List<Pair<Integer, Long>> expected = Arrays.asList(new Pair<>(1,1L),
                                                       new Pair<>(2,1L),
                                                       new Pair<>(3,1L));
    Assert.assertEquals(statisticCollector.getStatistic(Arrays.asList(1, 2, 3)), expected);
  }

  @Test
  public void testSolution2() {
    List<Pair<Integer, Long>> expected = Arrays.asList(new Pair<>(1,3L));
    Assert.assertEquals(statisticCollector.getStatistic(Arrays.asList(1, 1, 1)), expected);
  }

  @Test
  public void testSolution3() {
    List<Pair<Integer, Long>> expected = Arrays.asList(new Pair<>(3,1L),
                                                       new Pair<>(1,2L),
                                                       new Pair<>(2,2L));
    Assert.assertEquals(statisticCollector.getStatistic(Arrays.asList(2, 2, 1, 1, 3)), expected);
  }

  @Test
  public void testSolution4() {
    List<Pair<Integer, Long>> expected = Arrays.asList(new Pair<>(1,1L),
                                                       new Pair<>(3,3L));
    Assert.assertEquals(statisticCollector.getStatistic(Arrays.asList(3, 3, 3, 1)), expected);
  }

}