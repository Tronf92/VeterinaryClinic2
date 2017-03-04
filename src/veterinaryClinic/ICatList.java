package veterinaryClinic;

public interface ICatList {
	void addCat(Cat catToAdd) throws Exception;
	Cat getCat(int catId);
	ICatList getCats(Address address) throws Exception;
}
