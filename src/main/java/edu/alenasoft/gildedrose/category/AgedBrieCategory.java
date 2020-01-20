package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class AgedBrieCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    increaseQualityIfQualityLowerThanFifty(item);
    decreaseSellIn(item);
    if (isSellInLowerThanValue(item, ZERO)) {
      increaseQualityIfQualityLowerThanFifty(item);
    }
  }

  private void increaseQualityIfQualityLowerThanFifty(Item item) {
    if (!isQualityLowerThanFifty(item)) {
      return;
    }
    increaseQuality(item);
  }
}
