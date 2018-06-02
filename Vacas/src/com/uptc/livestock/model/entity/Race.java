package com.uptc.livestock.model.entity;

public enum Race {
	
	NORMANDO(Constant.BOVINE_AGILE, "Normando.jpg"), 
	SIMMENTAL(Constant.BOVINE_AGILE, "Simmental.jpg"), 
	SANMARTINERO(Constant.BOVINE_AGILE, "SanMartinero.jpg"),
	GYR(Constant.BOVINE_AGILE, "GYR.jpg"),
	BRAHMAN(Constant.BOVINE_AGILE, "Brahman.jpg"),
	HOUSTON(Constant.BOVINE_AGILE, ""),
	ANGUS(Constant.BOVINE_AGILE, "Angus.jpg"),
	BRANGUS(Constant.BOVINE_AGILE, "Brangus.jpg"),
	HARTON_DEL_VALLE(Constant.BOVINE_AGILE, "Harton.jpg"),
	CEBU(Constant.BOVINE_AGILE, "Cebu.jpg"), 
	JERSEY(Constant.BOVINE_NORMAL, "Jersey.jpg"), 
	HOLSTEIN(Constant.BOVINE_NORMAL, "Holstein.jpg"), 
	BUFALA(Constant.BOVINE_NORMAL, "Bufala.jpg"),
	BLANCO_OREJINEGRO(Constant.BOVINE_NORMAL, "BlancoOrejinegro.jpg"), 
	CAQUETEÑO(Constant.BOVINE_NORMAL, "Caqueteño.jpg"), 
	CHINO_SANTANDEREANO(Constant.BOVINE_NORMAL, "Chino.jpg"),
	COSTEÑO_CON_CUERNOS(Constant.BOVINE_NORMAL, "Costenio.jpg"),
	LUCERNA(Constant.BOVINE_NORMAL, "Lucerna.jpg"),
	VELAZQUEZ(Constant.BOVINE_NORMAL, "Velasquez.jpg");
	
	private String charact;
	private String nameImage;
	
	private Race(String charact, String nameImage) {
		this.charact = charact;
		this.nameImage = nameImage;
	}

	public String getCharact() {
		return charact;
	}

	public void setCharact(String charact) {
		this.charact = charact;
	}

	public String getNameImage() {
		return nameImage;
	}

	public void setNameImage(String nameImage) {
		this.nameImage = nameImage;
	}
	
	


}