package edu.alenasoft.gildedrose.category.validator;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.conts.CategoryConst;

public class ItemValidator implements CategoryConst {

  public static boolean isSellInLowerThanValue(Item item, Integer value) {
    return item.getSellIn() < value;
  }

  public static boolean isQualityLowerThanFifty(Item item) {
    return item.getQuality() < FIFTY;
  }

  public static boolean isQualityGreaterThanZero(Item item) {
    return item.getQuality() > ZERO;
  }
}
