public class CurruncyConverter {
	
	void convertRs(double inr){
		System.out.println("Conversion of Rs to USD is: "+(inr/87.69));
	}
	
	void ConvertUsd(double usd) {
		System.out.println("Conversion of USD to Rs is: "+(usd*87.53));
	}

	public static void main(String[] args) {
		CurruncyConverter obj = new CurruncyConverter();
		obj.convertRs(10000);
		obj.ConvertUsd(10000);

	}

}
