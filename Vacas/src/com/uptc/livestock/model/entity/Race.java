package com.uptc.livestock.model.entity;

public enum Race {
	
	NORMANDO(Constant.BOVINE_AGILE), 
	SIMMENTAL(Constant.BOVINE_AGILE), 
	SANMARTINERO(Constant.BOVINE_AGILE),
	GYR(Constant.BOVINE_AGILE),
	BRAHMAN(Constant.BOVINE_AGILE),
	HOUSTON(Constant.BOVINE_AGILE),
	ANGUS(Constant.BOVINE_AGILE),
	BRANGUS(Constant.BOVINE_AGILE),
	HARTON_DEL_VALLE(Constant.BOVINE_AGILE),
	CEBU(Constant.BOVINE_AGILE), 
	JERSEY(Constant.BOVINE_NORMAL), 
	HOLSTEIN(Constant.BOVINE_NORMAL), 
	BUFALA(Constant.BOVINE_NORMAL),
	BLANCO_OREJINEGRO(Constant.BOVINE_NORMAL), 
	CAQUETEÑO(Constant.BOVINE_NORMAL), 
	CHINO_SANTANDEREANO(Constant.BOVINE_NORMAL),
	COSTEÑO_CON_CUERNOS(Constant.BOVINE_NORMAL),
	LUCERNA(Constant.BOVINE_NORMAL),
	VELAZQUEZ(Constant.BOVINE_NORMAL);
	
	private String charact;
	
	private Race(String charact) {
		this.charact = charact;
	}

	public String getCharact() {
		return charact;
	}

	public void setCharact(String charact) {
		this.charact = charact;
	}


}