package hello;

import java.util.Arrays;

public class ZipCode {
	
	int [] zipCodeList;
	String finalOutput;
	
	public ZipCode(int[] zipCodeList) {
		
		this.zipCodeList= zipCodeList;
		this.finalOutput = "The maximum of the zip code list :"+processZipCode(zipCodeList);
	}
	private int processZipCode(int[] zipCodeList2) {
		Arrays.sort(zipCodeList2);
		return zipCodeList2[0];
	}
	public int[] getZipCodeList() {
		return zipCodeList;
	}
	public void setZipCodeList(int[] zipCodeList) {
		this.zipCodeList = zipCodeList;
	}
	public String getFinalOutput() {
		return finalOutput;
	}
	public void setFinalOutput(String finalOutput) {
		this.finalOutput = finalOutput;
	}
   
}
