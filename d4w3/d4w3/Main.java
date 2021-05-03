package d4w3;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer wisdom = new Gamer(29, 300, "Mahmut", "Özel", "12345678910", "20.05.1999");
		Game cod4 = new Game(1, "Call of Duty 4", 310);
		Campaign campaign = new Campaign(5, "RAMAZAN", 40);
		
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.gamerAdd(wisdom);
		gamerManager.gamerUpdate(wisdom);
		gamerManager.gamerDelete(wisdom);
		System.out.println();
		System.out.println("-----------------------------------");
		
		
		GamerCheckManager check = new GamerCheckManager();
		check.checking(wisdom);
		System.out.println(".......................................");
		
		
		GameManager gameManager = new GameManager();
		gameManager.gameAdd(cod4);
		gameManager.gameUpdate(cod4);
		gameManager.gameDelete(cod4);
		System.out.println();
		System.out.println("********************************");
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaignAdd(campaign);
		campaignManager.campaignUpdate(campaign);
		campaignManager.campaignDelete(campaign);
		System.out.println();
		System.out.println("--------------------------------------");
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.gameSale(cod4, wisdom, campaign);

	}

}
