package edu.alenasoft.gildedrose.category.validator;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.conts.CategoryConst;

public class ItemValidator {

  private ItemValidator() {}

  public static boolean isSellInLowerThanValue(Item item, Integer value) {
    return item.getSellIn() < value;
  }

  public static boolean isQualityGreaterOrEqualThanFifty(Item item) {
    return item.getQuality() >= CategoryConst.FIFTY.getValue();
  }

  public static boolean isQualityGreaterThanZero(Item item) {
    return item.getQuality() > CategoryConst.ZERO.getValue();
  }
}
