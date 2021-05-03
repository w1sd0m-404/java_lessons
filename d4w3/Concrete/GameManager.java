package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void gameAdd(Game game) {
		System.out.println("Yeni oyun eklendi : " +game.getPrice() + " TL" + " "+ game.getGameName());
		
	}

	@Override
	public void gameUpdate(Game game) {
		System.out.println("Oyun güncellendi : " + game.getGameName());
		
	}

	@Override
	public void gameDelete(Game game) {
		System.out.println("Oyun baþarýyla kaldýrýldý : " + game.getGameName());
		
	}

}
