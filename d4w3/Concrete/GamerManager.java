package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void gamerAdd(Gamer gamer) {
		System.out.println("Oyuncu sisteme baþarýyla kaydedildi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void gamerUpdate(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void gamerDelete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adlý oyuncu silindi...");
		
	}

	
}
