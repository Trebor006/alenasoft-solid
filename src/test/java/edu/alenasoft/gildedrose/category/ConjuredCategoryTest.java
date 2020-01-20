package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConjuredCategoryTest {

  @Test
  public void testConjuredDecrementQuality() {

    int inputQuality = 20;
    Item item = new Item("Conjured Mana Cake", 15, inputQuality);

    ConjuredCategory conjuredCategory = new ConjuredCategory();
    conjuredCategory.updateQuality(item);

    int expectedQuality = inputQuality - 2;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredNonZeroQuality() {

    int inputQuality = 0;
    Item item = new Item("Conjured Mana Cake", 15, inputQuality);

    ConjuredCategory conjuredCategory = new ConjuredCategory();
    conjuredCategory.updateQuality(item);

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredAlternativeNonZeroQuality() {

    int inputQuality = 1;
    Item item = new Item("Conjured Mana Cake", 15, inputQuality);

    ConjuredCategory conjuredCategory = new ConjuredCategory();
    conjuredCategory.updateQuality(item);

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredQualityWhenSellInZero() {

    int inputQuality = 10;
    Item item = new Item("Conjured Mana Cake", 0, inputQuality);

    ConjuredCategory conjuredCategory = new ConjuredCategory();
    conjuredCategory.updateQuality(item);

    int expectedQuality = inputQuality - 4;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testConjuredAlternativeQualityWhenSellInZero() {

    int inputQuality = 3;
    Item item = new Item("Conjured Mana Cake", 0, inputQuality);

    ConjuredCategory conjuredCategory = new ConjuredCategory();
    conjuredCategory.updateQuality(item);

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }
}
