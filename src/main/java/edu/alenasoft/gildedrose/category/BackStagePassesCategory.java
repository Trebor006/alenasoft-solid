package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.validator.ItemValidator;

public class BackStagePassesCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    increaseQualityIfLowerThanFifty(item);
    decreaseSellIn(item);
    if (ItemValidator.isSellInLowerThanValue(item, ZERO)) {
      item.setQuality(ZERO);
    }
  }

  private void increaseQualityIfLowerThanFifty(Item item) {
    if (!ItemValidator.isQualityLowerThanFifty(item)) {
      return;
    }
    increaseQuality(item);
    increaseQualityIfSellInLowerThan(item, ELEVEN);
    increaseQualityIfSellInLowerThan(item, SIX);
  }

}
