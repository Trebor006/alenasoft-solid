package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class AgedBrieCategory extends Template implements Qualitable {

  @Override
  public void firstSettingQuality(Item item) {
    increaseQuality(item);
  }

  @Override
  public void secondSettingQuality(Item item) {
    if (isQualityLowerThanFifty(item)) {
      increaseQuality(item);
    }
  }
}
