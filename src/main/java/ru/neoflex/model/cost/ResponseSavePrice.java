package ru.neoflex.model.cost;

public class ResponseSavePrice {

	private String resultText;
	private String resultCode;

	public void setResultText(String resultText){
		this.resultText = resultText;
	}

	public String getResultText(){
		return resultText;
	}

	public void setResultCode(String resultCode){
		this.resultCode = resultCode;
	}

	public String getResultCode(){
		return resultCode;
	}

	@Override
 	public String toString(){
		return 
			"ResponceSavePrice{" + 
			"resultText = '" + resultText + '\'' + 
			",resultCode = '" + resultCode + '\'' + 
			"}";
		}
}
