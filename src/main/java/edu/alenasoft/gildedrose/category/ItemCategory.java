package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class ItemCategory implements CategoryConst {

  protected void increaseQuality(Item item) {
    item.setQuality(item.getQuality() + 1);
  }

  protected void decreaseQuality(Item item) {
    item.setQuality(item.getQuality() - 1);
  }

  protected void decreaseSellIn(Item item) {
    item.setSellIn(item.getSellIn() - 1);
  }

  protected void increaseQualityIfSellInLowerThan(Item item, Integer value) {
    if (!isSellInLowerThanValue(item, value)) {
      return;
    }
    increaseQuality(item);
  }

  protected boolean isSellInLowerThanValue(Item item, Integer value) {
    return item.getSellIn() < value;
  }

  protected boolean isQualityLowerThanFifty(Item item) {
    return item.getQuality() < FIFTY;
  }

  protected boolean isQualityGreaterThanZero(Item item) {
    return item.getQuality() > ZERO;
  }
}
