package lession14_Commodity;

import java.util.Comparator;

public class CommodyComparatorByLenght implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if (o1.getLength() - o2.getLength() >0 )
		{
			return 1;
		}
		else {
			return -1;
		}
	}

}
