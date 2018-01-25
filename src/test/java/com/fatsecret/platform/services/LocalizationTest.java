package com.fatsecret.platform.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LocalizationTest {
	
	@Test
	public void testRegions() {
		
		assertEquals("AD", Localization.Region.AD.toString());
	}

	@Test
	public void testLanguages() {
		
		assertEquals("ar", Localization.Language.ar.toString());
		assertEquals("en-UK", Localization.Language.en_UK.toString());
	}
}