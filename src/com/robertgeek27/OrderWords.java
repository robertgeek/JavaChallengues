import java.util.Comparator;

/**
 * @author robertgeek27
 *
 */
public class OrderWords implements Comparator<String>{

	/**
	 *@param s1 One String for compare with s2
	 *@param s2 Second String for compare with s1
	 *@return Return the integer depends of result of comparation.
	 */
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return 1;
		else if (s1.length() > s2.length())
			return -1;
		else
			return 0;
	}

}
