package lession14_Commodity;

import java.util.Comparator;

public class CommodyComparatorByWeight implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getWeight() - o2.getWeight() >0 )
		{
			return 1;
		}
		else {
			return -1;
		}
	}

}
