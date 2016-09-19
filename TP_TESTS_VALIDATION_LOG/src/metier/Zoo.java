package metier;

import java.util.ArrayList;

public class Zoo {
	
ArrayList<Animal> lstAnimaux = new ArrayList<>();
	
	public void AddAnimal(Animal animal)
	{
		lstAnimaux.add(animal);
	}
	
	public ArrayList<Animal> getAnimauxByCri(String cri)
	{
		ArrayList<Animal> lstAnimauxVoulus = new ArrayList<>();
		for(int i=0; i < lstAnimaux.size(); i++)
		{
			if(lstAnimaux.get(i).getCri().contains(cri))
			{
				lstAnimauxVoulus.add(lstAnimaux.get(i));	
			}
			
		}
		return lstAnimauxVoulus;
	}
}
