package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.Mock;

import metier.Animal;
import metier.Lion;
import metier.Zoo;

public class ZooTestValidation {

Zoo zoo = Mockito.mock(Zoo.class);
Zoo zooNoMock = new Zoo();

 @Mock
 private ArrayList<Animal> mockArrayListAnimal;

 public void setUp() {
   MockitoAnnotations.initMocks(this);
 }



@Test
	public void testAjouterAnimalMock() {
		Lion lion = Mockito.mock(Lion.class);
		zoo.AddAnimal(lion);
}

	@Test
	public void testGetAnimalMock() {

		Mockito.when(zoo.getAnimauxByCri("warg")).thenReturn(mockArrayListAnimal);
		assertEquals(mockArrayListAnimal,zoo.getAnimauxByCri("warg"));
}

	@Test
		Lion lion = new Lion();
		zooNoMock.AddAnimal(lion);
}

	@Test
	public void testGetAnimal() {
		Lion lion =  new Lion();
		zooNoMock.AddAnimal(lion);
		assertEquals(1,zooNoMock.getAnimauxByCri("warg").size());
	}

}