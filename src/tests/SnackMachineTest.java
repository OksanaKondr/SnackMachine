package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import snackmachine.Coffee;
import snackmachine.SnackMachine;
import snackmachine.Toast;

public class SnackMachineTest {
	
	@BeforeClass
		public static void init() {
			System.out.println("Test Started");
	
		}
	
		@AfterClass
		public static void exit() {
			System.out.println("Test Finished");
	
		}
	
		@Test
		public void test_coffe() throws Exception {
			System.out.println("Test coffee started");
			Coffee coffee = new Coffee();
	
			Assert.assertEquals(1, coffee.make());
			Assert.assertEquals(10, coffee.make(10));
			Assert.assertEquals(0, coffee.make(-10));
			
			Assert.assertEquals(165779.6875, coffee.getCalories(50.0, 70));
			Assert.assertEquals(336822.2222222222, coffee.getCalories(100.0, 80));
			Assert.assertEquals(195356.88888888888, coffee.getCalories(58.0, 80));
			Assert.assertEquals(0.0, coffee.getCalories(0.0, 0));
			Assert.assertEquals(22500.0, coffee.getCalories(75.0, -30));
			Assert.assertEquals(0.0, coffee.getCalories(-200.0, -30));
			
			System.out.println("Test coffee finished");
		}
	
		@Test(dependsOnMethods = "test_coffe")
		public void test_toast() {
			System.out.println("Test toast started");
			Toast toast = new Toast();
	
			Assert.assertEquals(1, toast.make());
			Assert.assertEquals(10, toast.make(10));
			Assert.assertEquals(0, toast.make(-10));
			
			Assert.assertEquals(166171.5, toast.getCalories(50.0));
			Assert.assertEquals(332343.0, toast.getCalories(100.0));
			Assert.assertEquals(192758.94, toast.getCalories(58.0));
			Assert.assertEquals(0.0, toast.getCalories(0.0));
			Assert.assertEquals(0.0, toast.getCalories(-30.0));
			
			System.out.println("Test toast finished");
	
		}
	
		@Test
		public void parameters_test() {
			Assert.assertEquals("Version 1.1", SnackMachine.getVersion());
			Assert.assertTrue(SnackMachine.getHelp().contains("-makeToast"));
			Assert.assertTrue(SnackMachine.getHelp().contains("-makeCoffee"));
	
		}

}