package Regx;
/**
 * @author ²Ì³¯³¼
 * @time 2015Äê2ÔÂ4ÈÕ
 * @introduce Practice
 * @link http://www.cnblogs.com/courtier/p/4273193.html
 * */
public class KMP {
	//Pattern 
	private static String pat;
	//Length
	private static int M;
	private static int R;
	//Dfa
	private static int[][] dfa;
	
	static
	{
		R = 256;
		pat = "ABABAC";				
		M = pat.length();
		dfa = new int[R][M];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dfa[pat.charAt(0)][0] = 1;
		for (int X = 0,j = 1; j < M; j++) {
			
			for (int c = 0; c < R; c++) {
				dfa[c][j] = dfa[c][X];
			}
			
			dfa[pat.charAt(j)][j] = j+1;

			X = dfa[pat.charAt(j)][X];
			
			System.out.println("The KMP is A " + X);
		}
	}

}
