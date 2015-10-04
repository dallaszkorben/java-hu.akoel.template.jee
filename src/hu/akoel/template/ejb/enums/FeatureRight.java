package hu.akoel.template.ejb.enums;

import hu.akoel.template.ejb.services.LocalizeService;

public enum FeatureRight {
	USER_CAPTURE("fr_user_capture"),
	ROLE_CAPTURE("fr_role_capture"),
	ROLE_UPDATE("fr_role_capture"),
	ROLE_READ("rf_role_read"),
	FEATURERIGHT_CAPTURE("fr_featureright_capture"),
	;	
	String code;
	
	private FeatureRight( String code ){
		this.code = code;
	}
	
	public String getLocalized(){
		return LocalizeService.getLocalized(code);
	}
}
