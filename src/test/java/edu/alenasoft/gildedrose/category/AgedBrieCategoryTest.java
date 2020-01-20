package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieCategoryTest {

  @Test
  public void updateQuality() {
    int inputQuality = 50;
    Item item = new Item("Aged Brie", 20, inputQuality);
    AgedBrieCategory agedBrieCategory = new AgedBrieCategory();
    agedBrieCategory.updateQuality(item);
    int expectedQuality = 50;
    assertEquals(expectedQuality, item.getQuality());
  }
}
