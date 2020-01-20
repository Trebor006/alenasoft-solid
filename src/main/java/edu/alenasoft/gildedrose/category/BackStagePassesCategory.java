package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class BackStagePassesCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    increaseQualityIfLowerThanFifty(item);
    decreaseSellIn(item);
    if (isSellInLowerThanValue(item, ZERO)) {
      item.setQuality(ZERO);
    }
  }

  private void increaseQualityIfLowerThanFifty(Item item) {
    if (!isQualityLowerThanFifty(item)) {
      return;
    }
    increaseQuality(item);
    increaseQualityIfSellInLowerThan(item, ELEVEN);
    increaseQualityIfSellInLowerThan(item, SIX);
  }

}
