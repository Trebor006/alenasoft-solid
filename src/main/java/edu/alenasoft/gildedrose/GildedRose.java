package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static final String AGED_BRIE = "Aged Brie";
  public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
  public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT =
      "Backstage passes to a TAFKAL80ETC concert";
  public static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";

  public static final Integer ZERO = 0;
  public static final Integer SIX = 6;
  public static final Integer ELEVEN = 11;
  public static final Integer FIFTY = 50;

  public static List<Item> items = new ArrayList<>();

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();

    System.out.println(items);
  }

  public static void updateQuality() {
    for (Item item : items) {
      updateQuality(item);
    }
  }

  private static void updateQuality(Item item) {
    switch (item.getName()) {
      case AGED_BRIE:
        agedBrieItemCalculateQuality(item);
        break;
      case BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT:
        backstagePassesCalculateQuality(item);
        break;
      case SULFURAS_HAND_OF_RAGNAROS:
        break;
      case CONJURED_MANA_CAKE:
        normalItemCalculateQuality(item);
        normalItemCalculateQuality(item);
        break;
      default:
        normalItemCalculateQuality(item);
        break;
    }
  }

  private static void agedBrieItemCalculateQuality(Item item) {
    if (item.getQuality() < FIFTY) {
      increaseQuality(item);
    }
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      if (item.getQuality() < FIFTY) {
        increaseQuality(item);
      }
    }
  }

  private static void backstagePassesCalculateQuality(Item item) {
    if (item.getQuality() < FIFTY) {
      increaseQuality(item);
      if (item.getSellIn() < ELEVEN) {
        increaseQuality(item);
      }
      if (item.getSellIn() < SIX) {
        increaseQuality(item);
      }
    }
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      item.setQuality(ZERO);
    }
  }

  private static void normalItemCalculateQuality(Item item) {
    decreaseQualityGreaterThanZero(item);
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      decreaseQualityGreaterThanZero(item);
    }
  }

  private static void increaseQualityIfLowerThanFifty(Item item) {
    if (item.getQuality() < FIFTY) {
      increaseQuality(item);
    }
  }

  private static void decreaseQualityGreaterThanZero(Item item) {
    if (item.getQuality() > ZERO) {
      decreaseQuality(item);
    }
  }

  private static void increaseQuality(Item item) {
    item.setQuality(item.getQuality() + 1);
  }

  private static void decreaseQuality(Item item) {
    item.setQuality(item.getQuality() - 1);
  }

  private static void decreaseSellIn(Item item) {
    item.setSellIn(item.getSellIn() - 1);
  }
}
