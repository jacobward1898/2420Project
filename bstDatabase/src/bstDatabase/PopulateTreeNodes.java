package bstDatabase;

import java.io.IOException;

public class PopulateTreeNodes {

	private static Tree database;
	
	public PopulateTreeNodes() throws Exception{
		String[] data = Utilities.fileToStringArray("datacitystate.csv");
		Account[] accounts = new Account[data.length];
		for (int i = 0; i < data.length; i++) {
			accounts[i] = new Account(data[i]);
		}
		database = new Tree(accounts[0]);
		for (int i = 1; i <= accounts.length - 1; i++) {
			// System.out.println("inserting \"" + accounts[i].toString()+"\"");
			database.insertNode(database.root, accounts[i]);
		}
		Account a = new Account(111111111, "Hamm", "Bacon", 4356289513L,
				"hammbacon@utahcorp.com", "21 N 1260 E", 84720, "password", 3,
				27, 1992, "Human Resources");

		database.insertNode(database.root,a);
		System.out.println(database.getNode(111111111).getAccount().toString());
	}
	
	public static void main(String[] args) throws Exception {
//		long startTime = System.currentTimeMillis();
//		String[] data = Utilities.fileToStringArray("datacitystate.csv");
//		Account[] accounts = new Account[data.length];
//
//		for (int i = 0; i < data.length; i++) {
//			accounts[i] = new Account(data[i]);
//		}
//
//		Tree database = new Tree(accounts[0]);
//		for (int i = 1; i <= accounts.length - 1; i++) {
//			// System.out.println("inserting \"" + accounts[i].toString()+"\"");
//			database.insertNode(database.root, accounts[i]);
//		}
//
//		System.out.println(Utilities.runtime(startTime));
//
//		Account a = new Account(111111111, "Hamm", "Bacon", 4356289513L,
//				"hammbacon@utahcorp.com", "21 N 1260 E", 84720, "password", 3,
//				27, 1992, "Human Resources");
//
//		database.insertNode(database.root,a);
//		System.out.println(database.getNode(111111111).getAccount());
//		
//		
//		System.out.println(database.getNode(181242337).getAccount().toString());
//		database.deactivateNode(181242337);
//		System.out.println(database.getNode(181242337).getAccount().toString());
		PopulateTreeNodes main = new PopulateTreeNodes();
		System.out.println(database.getNode(111111111).getAccount());
	}
	
	public static Account getAccount(int ssn){
		return database.getNode(ssn).getAccount();
	}
}
