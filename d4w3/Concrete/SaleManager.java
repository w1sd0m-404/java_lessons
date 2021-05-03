package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void gameSale(Game game, Gamer gamer,Campaign campaign) {
		
		System.out.println(game.getGameName() +" standart sat�� fiyat�: "+ game.getPrice() + " .Mevcut kampanya fiyat�: " + game.getAfterDiscountPrice(campaign));
		
		if(gamer.getCoin() >= game.getAfterDiscountPrice(campaign)) {
			System.out.println(game.getGameName() +" adl� oyun ba�ar�yla sat�n al�nd�.");
		}else {
			System.out.println(game.getGameName() +" adl� oyunu sat�n alma i�lemi ba�ar�s�z oldu. L�tfen bakiyenizi kontrol edip tekrar deneyiniz.");
		}
		
	}

}
