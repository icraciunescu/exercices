package issues.i030.stockMarketDataProcessor.client;

import issues.i030.stockMarketDataProcessor.aggregators.AggregatorProcessor;
import issues.i030.stockMarketDataProcessor.aggregators.MaxAggregator;

import java.io.IOException;

public class AggregatorApp {

	public static void main(String[] args) throws IOException {
		
		/**
			You'll need to uncomment the below code. You'll notice it does not compile!
			
			There are 2 objectives in this assignment.
			
			1).  Make sure the code compiles correctly after you uncomment it below.
			2).  Make sure it runs as explained in the assignment video!
			
			-->> YOUR WORK SHOULD BE DONE IN THE AggregatorProcessor CLASS. 
		**/

		MaxAggregator agg = new MaxAggregator(  );
		AggregatorProcessor<MaxAggregator> aggsProcessor =
				new AggregatorProcessor(agg, "D:\\JavaTest\\Exercises\\src\\issues\\i030\\StockMarketDataProcessor\\table.csv");
		double value = aggsProcessor.runAggregator(3);
		System.out.println(value);



//		MinAggregator agg = new MinAggregator();
//		AggregatorProcessor<MinAggregator> aggsProcessor = new AggregatorProcessor<MinAggregator>(agg, "table.csv");
//		double value = aggsProcessor.runAggregator(1);
//		System.out.println(value);
	

	}

}
