package com.kodlamaio.hrms.core.validation;

import java.util.UUID;

public class ActivationCodeManager implements ActivationCodeService {

	@Override
	public boolean sendActivationCode(String email) {
		UUID uuid = UUID.randomUUID();
		String code = uuid.toString();
		System.out.println("Aktivasyon kodunuz "+ email+" adresinize gönderilmiştir. Kodunuz: "+code);
		return true;
	}

}
