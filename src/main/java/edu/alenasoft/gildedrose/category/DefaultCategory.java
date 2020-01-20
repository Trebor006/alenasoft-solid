package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class DefaultCategory extends ItemCategory implements Qualitable {

  public void updateQuality(Item item) {
    defaultItemCategoryCalculateQuality(item);
  }

  protected void defaultItemCategoryCalculateQuality(Item item) {
    decreaseQualityGreaterThanZero(item);
    decreaseSellIn(item);
    if (isSellInLowerThanValue(item, ZERO)) {
      decreaseQualityGreaterThanZero(item);
    }
  }

  private void decreaseQualityGreaterThanZero(Item item) {
    if (isQualityGreaterThanZero(item)) {
      decreaseQuality(item);
    }
  }
}
