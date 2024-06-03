package Abstractclass;

public class testbank {
	public static void main(String [] args) {
		
		HDFCbank hb =new HDFCbank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		
		bank b=new HDFCbank();
		b.credit();
		b.debit();
		b.loan();
		
		
	}

}
