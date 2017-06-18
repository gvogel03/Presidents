import java.util.Scanner;

public class Presidents{
	static Scanner console = new Scanner(System.in);
	static String[][]presidents = new String[32][2];
	static boolean quit = true;
	public static void main(String[]args){
		presidents[0][0] = "George Washington";
		presidents[0][1] = "1789 - 1797";
		presidents[1][0] = "John Adams";
		presidents[1][1] = "1797 - 1801";
		presidents[2][0] = "Thomas Jefferson";
		presidents[2][1] = "1801 - 1809";
		presidents[3][0] = "James Madison";
		presidents[3][1] = "1809 - 1817";
		presidents[4][0] = "James Monroe";
		presidents[4][1] = "1817 - 1825";
		presidents[5][0] = "John Quincy Adams";
		presidents[5][1] = "1825 - 1829";
		presidents[6][0] = "Andrew Jackson";
		presidents[6][1] = "1829 - 1837";
		presidents[7][0] = "Martin Van Buren";
		presidents[7][1] = "1837 - 1841";
		presidents[8][0] = "William H. Harrison";
		presidents[8][1] = "1841 - 1841";
		presidents[9][0] = "John Tyler";
		presidents[9][1] = "1841 - 1845";
		presidents[10][0] = "James Polk";
		presidents[10][1] = "1845 - 1849";
		presidents[11][0] = "Zachary Taylor";
		presidents[11][1] = "1849 - 1850";
		presidents[12][0] = "Millard Fillmore";
		presidents[12][1]= "1850 - 1853";
		presidents[13][0] = "Franklin Pierce";
		presidents[13][1] = "1853 - 1857";
		presidents[14][0] = "James Buchanan";
		presidents[14][1] = "1857 - 1861";
		presidents[15][0] = "Abraham Lincoln";
		presidents[15][1] = "1861 - 1865";
		presidents[16][0] = "Andrew Jackson";
		presidents[16][1] = "1865 - 1869";
		presidents[17][0] = "Ulysees S. Grant";
		presidents[17][1] = "1869 - 1877";
		presidents[18][0] = "Rutherford B. Hayes";
		presidents[18][1] = "1877 - 1881";
		presidents[19][0] = "James Garfield";
		presidents[19][1] = "1881 - 1881";
		presidents[20][0] = "Chester A. Arthur";
		presidents[20][1] = "1881 - 1885";
		presidents[21][0] = "Grover Cleveland(1st term)";
		presidents[21][1] = "1885 - 1889";
		presidents[22][0] = "Benjamin Harrison";
		presidents[22][1] = "1885 - 1889";
		presidents[23][0] = "Grover Cleveland(2nd term)";
		presidents[23][1] = "1893 - 1897";
		presidents[24][0] = "William Mckinley";
		presidents[24][1] = "1897 - 1901";
		presidents[25][0] = "Theodore Roosevelt";
		presidents[25][1] = "1901 - 1909";
		presidents[26][0] = "William H. Taft";
		presidents[26][1] = "1909 - 1913";
		presidents[27][0] = "Woodrow Wilson";
		presidents[27][1] = "1913 - 1921";
		presidents[28][0] = "Warren G. Harding";
		presidents[28][1] = "1921 - 1923";
		presidents[29][0] = "Calvin Coolidge";
		presidents[29][1] = "1923 - 1929";
		presidents[30][0] = "Herbert Hoover";
		presidents[30][1] = "1929 - 1933";
		presidents[31][0] = "Franklin D. Roosevlet";
		presidents[31][1] = "1933 - 1945";
		introMsg();
		rules();
		question();
	}
	public static void introMsg(){
		System.out.println("Welcome to U.S Presidents study guide!");
		System.out.println("Press enter to continue:");
		console.nextLine();
	}
	public static void rules(){
		System.out.println("I will give you a president and you must give me the years he served as president");
		System.out.println("Press enter to begin");
		console.nextLine();
	}
	public static void question(){
		int randomint= (int) (Math.random() * 33);
		System.out.println("What years did president " + presidents[randomint][0] + " serve in office?");
		String answer = console.nextLine();
		checkAnswer(answer, randomint);
	}
	public static void checkAnswer(String answer, int randomint){
		if(answer.equals(presidents[randomint][1])){
			System.out.println("Correct! Press enter to , or quit to terminate your session");
			if(console.nextLine().equalsIgnoreCase("quit")){
				System.out.println("Thanks for playing!");
			}
			else{
				question();
			}
		}
		else{
			System.out.println("Incorrect, " + presidents[randomint][0] + " served as president from " + presidents[randomint][1]);
			System.out.println("Press enter to continue, or enter \"quit\" to exit");
			if(console.nextLine().equalsIgnoreCase("quit")){
				System.out.println("Thanks for playing!");
			}
			else{
				question();
			}
		}
	}
}