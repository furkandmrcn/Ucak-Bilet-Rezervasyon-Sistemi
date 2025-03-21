package projeYapimi;

public class BiletFiyati {
	
	double ekoBilet;
	
	double busibilet;
	
	double fiyat;
	
	
	public BiletFiyati(double fiyat) {
		
		this.fiyat=fiyat;
		
	}
	
	double ekonomi() {
		
		double ekoF=fiyat;
	 return	this.ekoBilet=ekoF;
		
	}
	
	double business() {
		
		double busiF = ekonomi()*1.5;
		
		return busiF;
	}

}
