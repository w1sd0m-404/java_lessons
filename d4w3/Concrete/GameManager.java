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
		System.out.println("Oyun g�ncellendi : " + game.getGameName());
		
	}

	@Override
	public void gameDelete(Game game) {
		System.out.println("Oyun ba�ar�yla kald�r�ld� : " + game.getGameName());
		
	}

}
