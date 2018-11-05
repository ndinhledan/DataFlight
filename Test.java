import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	static FlightScheduler flight = new FlightScheduler();
	static double[][] result = new double[8][4];

	public static void main(String[] args) {
	int edge=0;
	int vertix=0;

		/*result[0][0] = flight.experimentalMode(1000, 1000);
		for (int i=0; i<2; i++){
			if (i==0) vertix = 1000;
			else if (i==1) vertix = 5000;
			result[1][i] = flight.experimentalMode(vertix, 5000);
		}*/
	
		/*for (int i=0; i<3; i++){
			if (i==0) vertix = 1000;
			else if (i==1) vertix = 5000;
			else if (i==2) vertix = 10000;
			else if (i==3) vertix = 15000;
			result[2][i] = flight.experimentalMode(vertix, 10000);
		}*/
		for (int i=0; i<4; i++){
			if (i==0) vertix = 1000;
			else if (i==1) vertix = 5000;
			else if (i==2) vertix = 10000;
			else if (i==3) vertix = 15000;
			result[3][i] = flight.experimentalMode(vertix, 15000);
		}
		/*for (int i=0; i<4; i++){
			if (i==0) vertix = 1000;
			else if (i==1) vertix = 5000;
			else if (i==2) vertix = 10000;
			else if (i==3) vertix = 15000;
			result[4][i] = flight.experimentalMode(vertix, 20000);
		}*/
		/*for (int i=0; i<4; i++){
			if (i==0) vertix = 1000;
			else if (i==1) vertix = 5000;
			else if (i==2) vertix = 10000;
			else if (i==3) vertix = 15000;
			result[5][i] = flight.experimentalMode(vertix, 30000);
		}*/
		/*for (int i=0; i<4; i++){
			if (i==0) vertix = 1000;
			else if (i==1) vertix = 5000;
			else if (i==2) vertix = 10000;
			else if (i==3) vertix = 15000;
			result[6][i] = flight.experimentalMode(vertix, 60000);
		}*/
		/*result[7][1] = flight.experimentalMode(5000, 120000);
		result[7][2] = flight.experimentalMode(10000, 120000);
		result[7][3] = flight.experimentalMode(15000, 120000);*/
		System.out.println(result[0][0]);
		writeMatrix(3);

	}

	public static void writeMatrix(int i){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Result.txt", true));

			//for (int i=0; i<8; i++){
				for (int j=0; j<4; j++){
					bw.write(result[i][j]+ "               ");
				}
				bw.newLine();
			//}
			bw.flush();
		} catch (IOException e){}
	}

}