package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefaultCategoryTest {
  @Test
  public void testDefaultItemDecrementQuality() {
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 10, inputQuality);
    DefaultCategory defaultCategory = new DefaultCategory();
    defaultCategory.updateQuality(item);
    int expectedQuality = inputQuality - 1;
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testDefaultItemDoubleDecrementQuality() {
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 0, inputQuality);
    DefaultCategory defaultCategory = new DefaultCategory();
    defaultCategory.updateQuality(item);
    int expectedQuality = inputQuality - 2;
    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testDefaultItemZeroQuality() {
    int inputQuality = 0;
    Item item = new Item("+5 Dexterity Vest", 0, inputQuality);
    DefaultCategory defaultCategory = new DefaultCategory();
    defaultCategory.updateQuality(item);
    int expectedQuality = 0;
    assertEquals(expectedQuality, item.getQuality());
  }
}
