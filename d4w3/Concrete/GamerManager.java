package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void gamerAdd(Gamer gamer) {
		System.out.println("Oyuncu sisteme ba�ar�yla kaydedildi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void gamerUpdate(Gamer gamer) {
		System.out.println("Oyuncu bilgileri g�ncellendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void gamerDelete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adl� oyuncu silindi...");
		
	}

	
}
