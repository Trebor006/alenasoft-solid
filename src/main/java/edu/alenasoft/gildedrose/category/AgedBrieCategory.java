package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class AgedBrieCategory extends ItemCategory implements Qualitable {

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
