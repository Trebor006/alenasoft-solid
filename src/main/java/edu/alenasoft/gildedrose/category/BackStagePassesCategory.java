package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class BackStagePassesCategory extends Template implements Qualitable {

  @Override
  public void firstSettingQuality(Item item) {
    increaseQuality(item);
    if (isSellInLowerThanValue(item, ELEVEN)) {
      increaseQuality(item);
    }
    if (isSellInLowerThanValue(item, SIX)) {
      increaseQuality(item);
    }
  }

  @Override
  public void secondSettingQuality(Item item) {
    item.setQuality(ZERO);
  }
}
