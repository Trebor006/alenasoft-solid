package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.validator.ItemValidator;

public class DefaultCategory extends ItemCategory implements Qualitable {

  public void updateQuality(Item item) {
    defaultItemCategoryCalculateQuality(item);
  }

  protected void defaultItemCategoryCalculateQuality(Item item) {
    decreaseQualityGreaterThanZero(item);
    decreaseSellIn(item);
    if (ItemValidator.isSellInLowerThanValue(item, ZERO)) {
      decreaseQualityGreaterThanZero(item);
    }
  }

  private void decreaseQualityGreaterThanZero(Item item) {
    if (!ItemValidator.isQualityGreaterThanZero(item)) {
      return;
    }
    decreaseQuality(item);
  }
}
