package com.kodlamaio.hrms;

import java.util.regex.Pattern;

import com.kodlamaio.hrms.entities.concretes.Employee;

public class MernisValidation {
	static String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	public static final Pattern pattern = Pattern.compile(regex);
		
	public boolean isVerified(Employee employee) {
		boolean result=true;
		if(employee.getFirstName().length()<=2 || employee.getLastName().length()<=1 || employee.getNationalityId().length()!=11) {
			result=false;
		}
		
		if(result==false) {
			System.out.println("HATA! Lütfen bilgilerinizin doğruluğunu kontrol edip tekrar deneyiniz.");
		}else {
			System.out.println("BAŞARILI! Doğrulama başarılı.");
		}
		return result;
	}
}
