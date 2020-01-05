package issues01.i030.stockMarketDataProcessor.client;

import issues01.i030.stockMarketDataProcessor.fileprocessors.StockFileData;
import issues01.i030.stockMarketDataProcessor.fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("D:\\JavaTest\\Exercises\\src\\issues\\i030\\StockMarketDataProcessor\\delete.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		// Insert your code here..
		for (String line : lines) {
			String[] values = line.split(",");
			int cnt = 0;
			HashMap<String, Double> headerValueMap = new HashMap<>();
			for (String value : values) {
				double dval = Double.parseDouble(value);
				headerValueMap.put( headers.get( cnt ), dval );
				cnt++;
			}
			dataResult.add(headerValueMap);
		}

		return dataResult;
	}

}
