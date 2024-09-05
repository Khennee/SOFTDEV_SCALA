object DonutShopTest extends App {
  object DonutShop {

    def addStock(STOCKS: Map[String, Int], FLAVOR: String, QUANTITY: Int): Map[String, Int] = {
      val CURRENT_STOCK = STOCKS.getOrElse(FLAVOR, 0)
      STOCKS + (FLAVOR -> (CURRENT_STOCK + QUANTITY))
    }

    def removeStock(STOCKS: Map[String, Int], FLAVOR: String, QUANTITY: Int): Map[String, Int] = {
      val CURRENT_STOCK = STOCKS.getOrElse(FLAVOR, 0)
      if (QUANTITY >= CURRENT_STOCK) STOCKS - FLAVOR
      else STOCKS + (FLAVOR -> (CURRENT_STOCK - QUANTITY))
    }

    def addNewFlavor(STOCKS: Map[String, Int], FLAVOR: String, QUANTITY: Int): Map[String, Int] = {
      addStock(STOCKS, FLAVOR, QUANTITY)
    }

    def getStock(STOCKS: Map[String, Int], FLAVOR: String): Int = {
      STOCKS.getOrElse(FLAVOR, 0)
    }
  }
  val CURRENT_STOCKS = Map("Pancit Canton Donut Flavor" -> 15, "Spicy Pancit Canton Bavarian Flavor" -> 2)
  println(CURRENT_STOCKS)
  val ANOTHER_NEW_STOCKS_HAS_ARRIVED = DonutShop.addStock(CURRENT_STOCKS, "Spicy Pancit Canton Bavarian Flavor", 2)
  println(ANOTHER_NEW_STOCKS_HAS_ARRIVED)
  val UPDATED_STOCKS = DonutShop.addNewFlavor(CURRENT_STOCKS, "Donutsilog", 8)
  println(UPDATED_STOCKS)
  val DEGRADE_STOCKS = DonutShop.removeStock(UPDATED_STOCKS, "Donutsilog", 8)
  println(DEGRADE_STOCKS)
  val GET_STOCKS = DonutShop.getStock(DEGRADE_STOCKS, "Donutsilog")
  println(GET_STOCKS)
}
