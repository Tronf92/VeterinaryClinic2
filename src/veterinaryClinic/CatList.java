package veterinaryClinic;

import java.util.HashMap;

public class CatList implements ICatList {
	private HashMap<Integer, Cat> cats = new HashMap<>();
	
	@Override
	public void addCat(Cat catToAdd) throws Exception {
		if(cats.containsKey(catToAdd.getID())){
			throw new Exception("Cat is already in list!");
		}
		cats.put(catToAdd.getID(), catToAdd);
	}

	@Override
	public Cat getCat(int catId) {
		return cats.get(catId);
	}

	@Override
	public ICatList getCats(Address address) throws Exception {
		ICatList catsOnAddress = new CatList();
		for(Cat cat : cats.values()){
			if(cat.getAddress().equals(address)){
				catsOnAddress.addCat(cat);
			}
		}
		return catsOnAddress;
	}
	
	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		for (Cat cat : cats.values()){
			stringBuilder.append(cat);
			stringBuilder.append(System.lineSeparator());
		}
		return stringBuilder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cats == null) ? 0 : cats.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatList other = (CatList) obj;
		if (cats == null) {
			if (other.cats != null)
				return false;
		} else if (!cats.equals(other.cats))
			return false;
		return true;
	}
}
