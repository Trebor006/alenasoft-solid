package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.UtilConst;

public class ItemCategory implements UtilConst {

  public void updateQuality(Item item) {
    defaultItemCategoryCalculateQuality(item);
  }

  protected void defaultItemCategoryCalculateQuality(Item item) {
    decreaseQualityGreaterThanZero(item);
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      decreaseQualityGreaterThanZero(item);
    }
  }

  private void decreaseQualityGreaterThanZero(Item item) {
    if (item.getQuality() > ZERO) {
      decreaseQuality(item);
    }
  }

  protected void increaseQuality(Item item) {
    item.setQuality(item.getQuality() + 1);
  }

  private void decreaseQuality(Item item) {
    item.setQuality(item.getQuality() - 1);
  }

  protected void decreaseSellIn(Item item) {
    item.setSellIn(item.getSellIn() - 1);
  }

}
