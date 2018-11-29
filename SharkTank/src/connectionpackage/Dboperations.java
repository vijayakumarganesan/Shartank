package connectionpackage;

import java.util.ArrayList;

public interface Dboperations {
	public ArrayList SeriesFilter(int series);
	public ArrayList SeasonFilter(int season);
	public ArrayList AmountFilter(int amount);
	public ArrayList GenderFilter(String gender);
	public ArrayList RowFilter(int row);

}
