package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {

	void gameSale(Game game,Gamer gamer,Campaign campaign);
}
