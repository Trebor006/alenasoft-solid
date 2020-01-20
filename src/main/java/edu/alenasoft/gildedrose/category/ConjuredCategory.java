package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.ItemCategory;

public class ConjuredCategory extends ItemCategory {

  @Override
  public void updateQuality(Item item) {
    defaultItemCategoryCalculateQuality(item);
    defaultItemCategoryCalculateQuality(item);
  }
}
