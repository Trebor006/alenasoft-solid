package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static final String AGED_BRIE = "Aged Brie";
  public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
  public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

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
    for (int i = 0; i < items.size(); i++) {
      if ((!AGED_BRIE.equals(items.get(i).getName()))
          && !BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT.equals(items.get(i).getName())) {
        if (items.get(i).getQuality() > ZERO) {
          if (!SULFURAS_HAND_OF_RAGNAROS.equals(items.get(i).getName())) {
            items.get(i).setQuality(items.get(i).getQuality() - 1);
          }
        }
      } else {
        if (items.get(i).getQuality() < FIFTY) {
          items.get(i).setQuality(items.get(i).getQuality() + 1);

          if (BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT.equals(items.get(i).getName())) {
            if (items.get(i).getSellIn() < ELEVEN) {
              if (items.get(i).getQuality() < FIFTY) {
                items.get(i).setQuality(items.get(i).getQuality() + 1);
              }
            }

            if (items.get(i).getSellIn() < SIX) {
              if (items.get(i).getQuality() < FIFTY) {
                items.get(i).setQuality(items.get(i).getQuality() + 1);
              }
            }
          }
        }
      }

      if (!SULFURAS_HAND_OF_RAGNAROS.equals(items.get(i).getName())) {
        items.get(i).setSellIn(items.get(i).getSellIn() - 1);
      }

      if (items.get(i).getSellIn() < ZERO) {
        if (!AGED_BRIE.equals(items.get(i).getName())) {
          if (!BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT.equals(items.get(i).getName())) {
            if (items.get(i).getQuality() > ZERO) {
              if (!SULFURAS_HAND_OF_RAGNAROS.equals(items.get(i).getName())) {
                items.get(i).setQuality(items.get(i).getQuality() - 1);
              }
            }
          } else {
            items.get(i).setQuality(ZERO);
          }
        } else {
          if (items.get(i).getQuality() < FIFTY) {
            items.get(i).setQuality(items.get(i).getQuality() + 1);
          }
        }
      }
    }
  }
}
