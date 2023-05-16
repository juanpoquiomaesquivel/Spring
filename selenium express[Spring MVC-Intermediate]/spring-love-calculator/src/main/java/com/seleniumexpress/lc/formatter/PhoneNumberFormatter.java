package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("Inside the print() of the PhoneNumberFormatter");
		
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside the parse of the PhoneNumberFormatter");

		// split the string received from the user
		String[] phoneNumberArray = completePhoneNumber.split("-");

		// Extract the countryCode and set it to the phone class countryCodeProperty
		Phone phone = new Phone();
		
		// wheter the number consists of -
		int index = completePhoneNumber.indexOf('-');
		boolean valor = completePhoneNumber.startsWith("-");
		if (index == -1 || valor) {
			// if the '-' is not found, then add 91 as the default country code
			phone.setCountryCode("91");
			phone.setUserNumber(valor ? phoneNumberArray[0] : phoneNumberArray[1]);
		} else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);	
		}

		return phone;
	}
}

// https://www.youtube.com/watch?v=q9hjjeJA7Yw&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=9&pp=iAQB