package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.conts.CategoryConst;
import edu.alenasoft.gildedrose.category.validator.ItemValidator;

public class BackStagePassesCategory extends ItemCategory implements Qualitable {

  @Override
  public void updateQuality(Item item) {
    increaseQualityIfLowerThanFifty(item);
    decreaseSellIn(item);
    if (ItemValidator.isSellInLowerThanValue(item, CategoryConst.ZERO.getValue())) {
      item.setQuality(CategoryConst.ZERO.getValue());
    }
  }

  private void increaseQualityIfLowerThanFifty(Item item) {
    if (ItemValidator.isQualityGreaterOrEqualThanFifty(item)) {
      return;
    }
    increaseQuality(item);
    increaseQualityIfSellInLowerThan(item, CategoryConst.ELEVEN.getValue());
    increaseQualityIfSellInLowerThan(item, CategoryConst.SIX.getValue());
  }
}
