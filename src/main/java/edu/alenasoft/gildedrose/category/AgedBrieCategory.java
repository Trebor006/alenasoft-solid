package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class AgedBrieCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    increaseQualityIfLowerThanFifty(item);
    decreaseSellIn(item);
    if (isSellInLowerThanValue(item, ZERO)) {
      increaseQualityIfLowerThanFifty(item);
    }
  }

  private void increaseQualityIfLowerThanFifty(Item item) {
    if (!isQualityLowerThanFifty(item)) {
      return;
    }
    increaseQuality(item);
  }
}
