package edu.alenasoft.gildedrose;

public class ItemCategory implements UtilConst {

  public void updateQuality(Item item) {
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

  private void agedBrieItemCalculateQuality(Item item) {
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

  private void backstagePassesCalculateQuality(Item item) {
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

  private void normalItemCalculateQuality(Item item) {
    decreaseQualityGreaterThanZero(item);
    decreaseSellIn(item);
    if (item.getSellIn() < ZERO) {
      decreaseQualityGreaterThanZero(item);
    }
  }

  private void decreaseQualityGreaterThanZero(Item item) {
    if (item.getQuality() > ZERO) {
      decreaseQuality(item);
    }
  }

  private void increaseQuality(Item item) {
    item.setQuality(item.getQuality() + 1);
  }

  private void decreaseQuality(Item item) {
    item.setQuality(item.getQuality() - 1);
  }

  private void decreaseSellIn(Item item) {
    item.setSellIn(item.getSellIn() - 1);
  }

}
