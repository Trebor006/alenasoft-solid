package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class BackStagePassesCategory extends ItemCategory {

  @Override
  public void updateQuality(Item item) {
    if (item.getQuality() < FIFTY) {
      increaseQuality(item);
      if (item.getSellIn() < ELEVEN) {
        increaseQuality(item);
      }
      if (item.getSellIn() < SIX) {
        increaseQuality(item);
      }
    }
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      item.setQuality(ZERO);
    }
  }
}
