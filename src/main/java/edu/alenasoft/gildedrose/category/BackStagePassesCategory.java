package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class BackStagePassesCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    if (isQualityLowerThanFifty(item)) {
      increaseQuality(item);
      if (isSellInLowerThanValue(item, ELEVEN)) {
        increaseQuality(item);
      }
      if (isSellInLowerThanValue(item, SIX)) {
        increaseQuality(item);
      }
    }
    decreaseSellIn(item);
    if (isSellInLowerThanValue(item, ZERO)) {
      item.setQuality(ZERO);
    }
  }
}
