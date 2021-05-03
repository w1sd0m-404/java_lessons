package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checking(Gamer gamer) {
		boolean result = true;
		if(gamer.getFirstName().length()<=2 || gamer.getLastName().length()<=1 || gamer.getNationalityId().length()!=11 || gamer.getBirthDate().length() == 0) {
			result = false;
		}
		
		if(result == false) {
			System.out.println("Kimlik bilgileri hatalý. Lütfen tekrar deneyiniz.");
		}else {
			System.out.println("Kimlik doðrulamasý baþarýlý.");
		}
		return result;
	}

}
