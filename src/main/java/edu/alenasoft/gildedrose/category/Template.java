package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public abstract class Template extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    if (item.getQuality() < FIFTY) {
      firstSettingQuality(item);
    }
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      secondSettingQuality(item);
    }
  }

  public abstract void firstSettingQuality(Item item);

  public abstract void secondSettingQuality(Item item);

}
