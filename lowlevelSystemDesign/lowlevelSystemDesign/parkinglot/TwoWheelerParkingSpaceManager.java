package lowlevelSystemDesign.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpaceManager implements ParkingSpaceManager{

	List<ParkingSpace> parkingSpaceList;
	
	TwoWheelerParkingSpaceManager(int avalableLotSize){
		parkingSpaceList = new ArrayList<>(avalableLotSize);
	}

	
	@Override
	public ParkingSpace getParkingSpace() {
		if(parkingSpaceList.size() > 0){
			for(ParkingSpace parkingSpace : parkingSpaceList) {
				if(!parkingSpace.isSpaceBooked())
					return parkingSpace;
			}
		}
		return null;
	}

	@Override
	public void vacateParkingSpace(ParkingSpace parkingSpace) {
		parkingSpaceList.remove(parkingSpace);
	}


	@Override
	public void addParkingSpace(ParkingSpace space) {
		parkingSpaceList.add(space);
	}


}
