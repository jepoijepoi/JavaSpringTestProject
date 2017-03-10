package com.ul.testwebproject;

public class MyTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String modelName = "LOWE'S COMPANIES (602979) | Lumi_O_D_V2'";
//		System.out.println("modelName1: " + modelName);
//		if(modelName.indexOf("'") >= 0) {
//			System.out.println(modelName.indexOf("'"));
//			modelName = modelName.replaceAll("'", "\\\\'");
//			System.out.println("modelName: " + modelName.replaceAll("'", "&#039"));
//		}
//		System.out.println("modelName2: " + modelName);
		
//		Map<String, Integer> attrNames = new HashMap<String, Integer>();
//		attrNames.put("Universal_Product_Code_UPC", Integer.valueOf(1));
//		attrNames.put("Universal_Product_Code_UPC", Integer.valueOf(2));
//		
//		System.out.println(attrNames.get("Universal_Product_Code_UPC"));
//		
//		String strArray[] = {"Test1","Test2"};
//		System.out.println(strArray.length);
//		
//		String strArray2[] = {"Test1","Test2","Test3"};
//		strArray = strArray2;
//		System.out.println(strArray.length);
//		System.out.println(Arrays.toString(strArray));
		
		String str = "Color Rendering: Fidelity Index at Default Setting";
		str = str.replaceAll(":", "");
		System.out.println(str);
		
		String addIdentifyingInformationBasicModel = null;
		System.out.println((addIdentifyingInformationBasicModel!=null)?addIdentifyingInformationBasicModel:"test");
		
	}

}
