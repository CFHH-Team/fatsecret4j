package com.fatsecret.platform.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.fatsecret.platform.model.Food;


public class FoodServiceTest {
	private FatsecretService service;
	
	@Before
	public void setUp() {
        String key = "your key";
        String secret = "your secret";

        service = new FatsecretService(key, secret);
	}
	
	@Test
	public void testGetFood() {
		Food food = service.getFood(285243L);
		assertEquals("Penne", food.getName());
		assertEquals(4, food.getServings().size());
		assertEquals("Generic", food.getType());
	}

	@Test
	public void testGetFoodTypeGeneric() {
		Food food = service.getFood(285243L);
		assertEquals("Generic", food.getType());
	}

	@Test
	public void testGetFoodTypeBrand() {
		Food food = service.getFood(1844450L);
		assertEquals("Brand", food.getType());
	}
	
	@Test
	public void testFindIdForBarcode() {
		String barcode = "009800895007";
		Long foodId = service.findIdForBarcode(barcode);
		assertEquals(3471554L, foodId.longValue());
	}

	@Test
	public void testFindIdForLocalBarcode() {
		String barcode = "01275926";
		Long foodId = service.findIdForBarcode(barcode, Localization.Region.GB);
		assertEquals(9656359L, foodId.longValue());
	}
}