package edu.alenasoft.gildedrose.category.conts;

import lombok.Getter;

@Getter
public enum CategoryTypesConst {
  AGED_BRIE("Aged Brie"),
  SULFURAS_HAND_OF_RAGNAROS("Sulfuras, Hand of Ragnaros"),
  BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT("Backstage passes to a TAFKAL80ETC concert"),
  CONJURED_MANA_CAKE("Conjured Mana Cake");

  String value;

  CategoryTypesConst(String value) {
    this.value = value;
  }
}
