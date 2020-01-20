package edu.alenasoft.gildedrose.category;

import edu.alenasoft.gildedrose.Item;
import edu.alenasoft.gildedrose.category.conts.CategoryTypesConst;

public class ItemCategoryFactory implements CategoryTypesConst {

  public static Qualitable categorize(Item item) {
    if (AGED_BRIE.equals(item.getName())) {
      return new AgedBrieCategory();
    }

    if (BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT.equals(item.getName())) {
      return new BackStagePassesCategory();
    }

    if (SULFURAS_HAND_OF_RAGNAROS.equals(item.getName())) {
      return new SulfurasCategory();
    }

    if (CONJURED_MANA_CAKE.equals(item.getName())) {
      return new ConjuredCategory();
    }

    return new DefaultCategory();
  }
}
