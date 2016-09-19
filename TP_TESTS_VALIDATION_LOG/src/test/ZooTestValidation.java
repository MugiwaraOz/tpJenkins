package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import metier.Animal;
import metier.Lion;
import metier.Zoo;

public class ZooTestValidation {

	 Zoo zoo = Mockito.mock(Zoo.class); 

	@Mock
	private ArrayList<Animal> mockArrayList;
	
	@Test
	public void testAjouterEvenement() {
	//	Mockito.when(zoo.getAnimauxByCri("niope"))
	//	Lion lion = Mockito.mock(Lion.class);
	//	ArrayList<Animal> = Mockito.mock(Animal.class)
	//	zoo.AddAnimal(lion);
	}
	
	@Test
	public void TestZooVide() {}
}

