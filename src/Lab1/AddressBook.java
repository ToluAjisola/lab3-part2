package Lab1;
import java.util.*;

public class AddressBook {

	private List<BuddyInfo> infos;
		
		
		public AddressBook() {
			this.infos= new ArrayList<BuddyInfo>();
		}
		
		public void addBuddy(BuddyInfo aBuddyInfo) {

			if(aBuddyInfo != null) {
				this.infos.add(aBuddyInfo);
			}
		}

		public BuddyInfo removeBuddy(int index) {

			if(index >= 0 && index < this.infos.size()) {
				return this.infos.remove(index);
			}
			return null;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
			AddressBook addressBook = new AddressBook();
			addressBook.addBuddy(buddy);
			addressBook.removeBuddy(0);
		}

	
}
