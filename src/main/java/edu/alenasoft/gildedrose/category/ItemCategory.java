package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.conts.CategoryConst;
import edu.alenasoft.gildedrose.category.validator.ItemValidator;

public abstract class ItemCategory implements CategoryConst {

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
    if (!ItemValidator.isSellInLowerThanValue(item, value)) {
      return;
    }
    increaseQuality(item);
  }

}
