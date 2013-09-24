package packageYield;

public class Yield {

	public static void Yield(investment x){
		x.futureValue = x.initialInvestment * Math.pow(1+x.percent, x.years);
	}
}
