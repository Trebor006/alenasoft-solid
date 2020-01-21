package edu.alenasoft.gildedrose.category.conts;

import lombok.Getter;

@Getter
public enum CategoryConst {
  ZERO(0),
  SIX(6),
  ELEVEN(11),
  FIFTY(50);

  Integer value;

  CategoryConst(Integer value) {
    this.value = value;
  }
}
