package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.UtilConst;

public class ItemCategory implements UtilConst {

  protected void increaseQuality(Item item) {
    item.setQuality(item.getQuality() + 1);
  }

  protected void decreaseQuality(Item item) {
    item.setQuality(item.getQuality() - 1);
  }

  protected void decreaseSellIn(Item item) {
    item.setSellIn(item.getSellIn() - 1);
  }
}
