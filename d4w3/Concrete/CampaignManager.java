package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println(campaign.getDiscountCode() + " kodu ile yeni bir kampanya eklendi. " + "�ndirim oran� : %" + campaign.getDiscountRate());
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + " id'li kampanyan�n bilgileri g�ncellendi.");
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + " id'li kampanya silindi.");
		
	}

}
