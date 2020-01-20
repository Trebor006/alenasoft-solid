package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.ItemCategory;

public class AgedBrieCategory extends ItemCategory {

  @Override
  public void updateQuality(Item item) {
    if (item.getQuality() < FIFTY) {
      increaseQuality(item);
    }
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      if (item.getQuality() < FIFTY) {
        increaseQuality(item);
      }
    }
  }
}
