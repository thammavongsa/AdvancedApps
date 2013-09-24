package packageYield;

import java.util.ArrayList;
import java.util.List;

public class testYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yield ol = new Yield ();
		List<investment> list = new ArrayList<investment>();
		
		list.add(new investment( .03,1,1000));
		list.add(new investment( .05,1,1000));
		list.add(new investment( .07,1,1000));
		
		list.add(new investment( .03,2,1000));
		list.add(new investment( .05,2,1000));
		list.add(new investment( .07,2,1000));
		
		list.add(new investment( .03,3,1000));
		list.add(new investment( .05,3,1000));
		list.add(new investment( .07,3,1000));

		System.out.println(String.format("%-10s%-10s%-15s%-10s", "percent", "years", "Investment", "Future Value"));
        for (investment y : list) {
        	ol.Yield(y);
            System.out.println(String.format("%-10s%-10s%-15d%-10s", y.percent, y.years, y.initialInvestment, y.futureValue));
	}
	}

	}


