package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.validator.ItemValidator;

public class AgedBrieCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    increaseQualityIfLowerThanFifty(item);
    decreaseSellIn(item);
    if (ItemValidator.isSellInLowerThanValue(item, ZERO)) {
      increaseQualityIfLowerThanFifty(item);
    }
  }

  private void increaseQualityIfLowerThanFifty(Item item) {
    if (ItemValidator.isQualityGreaterOrEqualThanFifty(item)) {
      return;
    }
    increaseQuality(item);
  }
}
