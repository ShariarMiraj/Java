package interfaces;
import  classes.*;

public interface StoreHouseOperations
{
	void insertStoreHouse(StoreHouse s);
	void removeStoreHouse(StoreHouse s);
	StoreHouse getStoreHouse(String sid);
	void showAllStoreHouses();
	
	
}