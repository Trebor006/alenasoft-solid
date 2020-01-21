package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.conts.CategoryTypesConst;

public class ItemCategoryFactory {

  private ItemCategoryFactory() {}

  public static Qualitable categorize(Item item) {
    if (CategoryTypesConst.AGED_BRIE.getValue().equals(item.getName())) {
      return new AgedBrieCategory();
    }

    if (CategoryTypesConst.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT
        .getValue()
        .equals(item.getName())) {
      return new BackStagePassesCategory();
    }

    if (CategoryTypesConst.SULFURAS_HAND_OF_RAGNAROS.getValue().equals(item.getName())) {
      return new SulfurasCategory();
    }

    if (CategoryTypesConst.CONJURED_MANA_CAKE.getValue().equals(item.getName())) {
      return new ConjuredCategory();
    }

    return new DefaultCategory();
  }
}
