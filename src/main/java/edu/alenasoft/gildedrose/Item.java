package edu.alenasoft.gildedrose;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

  public String name;
  public int sellIn;
  public int quality;

  public Item(String name, int sellIn, int quality) {
    this.setName(name);
    this.setSellIn(sellIn);
    this.setQuality(quality);
  }

  @Override
  public String toString() {
    return "Item{" + "name='" + name + '\'' + ", sellIn=" + sellIn + ", quality=" + quality + '}';
  }
}
