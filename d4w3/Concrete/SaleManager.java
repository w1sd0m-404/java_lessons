package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void gameSale(Game game, Gamer gamer,Campaign campaign) {
		
		System.out.println(game.getGameName() +" standart satýþ fiyatý: "+ game.getPrice() + " .Mevcut kampanya fiyatý: " + game.getAfterDiscountPrice(campaign));
		
		if(gamer.getCoin() >= game.getAfterDiscountPrice(campaign)) {
			System.out.println(game.getGameName() +" adlý oyun baþarýyla satýn alýndý.");
		}else {
			System.out.println(game.getGameName() +" adlý oyunu satýn alma iþlemi baþarýsýz oldu. Lütfen bakiyenizi kontrol edip tekrar deneyiniz.");
		}
		
	}

}
