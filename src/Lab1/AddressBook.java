package Lab1;
import java.util.*;

public class AddressBook {

		public ArrayList<BuddyInfo> infos= new ArrayList<BuddyInfo>();
		
		public void addBuddy(BuddyInfo aBuddyInfo) {

			if(aBuddyInfo != null) {
				infos.add(aBuddyInfo);
			}
		}

		public void removeBuddy(int index) {

			if(index >= 0 && index < infos.size()) {
				infos.remove(index);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
			AddressBook addressBook = new AddressBook();
			addressBook.addBuddy(buddy);
			addressBook.removeBuddy(0);
		}

	
}
