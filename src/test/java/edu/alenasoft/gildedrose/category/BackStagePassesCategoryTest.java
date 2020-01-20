package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackStagePassesCategoryTest {

  @Test
  public void testbackstageIncrementsQuality() {
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, inputQuality);
    BackStagePassesCategory backStagePassesCategory = new BackStagePassesCategory();
    backStagePassesCategory.updateQuality(item);
    int expectedQuality = inputQuality + 1;
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testbackstageDoubleIncrementQuality() {
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, inputQuality);
    BackStagePassesCategory backStagePassesCategory = new BackStagePassesCategory();
    backStagePassesCategory.updateQuality(item);
    int expectedQuality = inputQuality + 2;
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageTripleIncrementQuality() {
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, inputQuality);
    BackStagePassesCategory backStagePassesCategory = new BackStagePassesCategory();
    backStagePassesCategory.updateQuality(item);
    int expectedQuality = inputQuality + 3;
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageZeroQuality() {
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, inputQuality);
    BackStagePassesCategory backStagePassesCategory = new BackStagePassesCategory();
    backStagePassesCategory.updateQuality(item);
    int expectedQuality = 0;
    assertEquals(expectedQuality, item.getQuality());
  }
}
