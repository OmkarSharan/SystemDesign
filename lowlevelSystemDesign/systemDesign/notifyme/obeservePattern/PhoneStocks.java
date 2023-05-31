package systemDesign.notifyme.obeservePattern;

import java.util.ArrayList;
import java.util.List;

public class PhoneStocks implements Subject{
	
	public List<Observer> observerList;
	public PhoneStocks() {
		observerList = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		observerList.add(ob);
	}

	@Override
	public void unregiterObserver(Observer ob) {
		// TODO Auto-generated method stub
		observerList.remove(ob);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer ob : observerList) {
			ob.update();
		}
	}
	
	public void update() {
		if(observerList.size() > 0)
			notifyObserver();
	}

}
