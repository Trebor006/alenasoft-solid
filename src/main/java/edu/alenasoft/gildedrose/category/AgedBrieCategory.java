package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class AgedBrieCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    if (isQualityLowerThanFifty(item)) {
      increaseQuality(item);
    }
    decreaseSellIn(item);
    if (isSellInLowerThanValue(item, ZERO)) {
      if (isQualityLowerThanFifty(item)) {
        increaseQuality(item);
      }
    }
  }
}
