package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;

public class ConjuredCategory extends DefaultCategory {

  @Override
  public void updateQuality(Item item) {
    defaultItemCategoryCalculateQuality(item);
    defaultItemCategoryCalculateQuality(item);
  }
}
