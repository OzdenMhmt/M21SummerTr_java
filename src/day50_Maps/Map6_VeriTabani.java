package day50_Maps;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


import java.util.HashMap;

import java.util.Map;

public class Map6_VeriTabani {

	public static void main(String[] args) {

		String dosyaYolu = "C:\\Users\\snynk\\Desktop\\VeriTabani1.csv";

		Map<String, String> veriMap = veriTabaniAl(dosyaYolu);
		System.out.println(veriMap);

	}

	@SuppressWarnings("resource")
	public static Map<String, String> veriTabaniAl(String dosyaYolu) {

		Map<String, String> eklenecekMap = new HashMap<>();
		// List<String>tempList=new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
			String satir = br.readLine();

			while (satir != null) {

				String keyValueArr[] = satir.split(";");// benimkinde noktali virgulle ayirmis
				eklenecekMap.put(keyValueArr[0], keyValueArr[1]);
				// tempList.add(satir);

				satir = br.readLine();
			}
		} catch (IOException e) {

			e.printStackTrace(); // detayli hata raporu verir
		}
		// System.out.println(tempList);

		return eklenecekMap;
	}

}
