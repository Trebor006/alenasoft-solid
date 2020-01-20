package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SulfurasCategoryTest {

  @Test
  public void testItemSufurasLegendary() {
    int inputQuality = 80;
    Item item = new Item("Sulfuras, Hand of Ragnaros", 15, inputQuality);
    SulfurasCategory sulfurasCategory = new SulfurasCategory();
    sulfurasCategory.updateQuality(item);
    int expectedQuality = 80;
    assertEquals(expectedQuality, item.getQuality());
  }
}
