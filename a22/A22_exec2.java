package studya.a22;
import studya.a21.A21_StrArray;
import java.text.*;


class A22_exec2 {
		
		public static void main(String[] args) {
			A22_StrArray strArray = new A22_StrArray();
			for(int i= 0; i <= 5 ; i++){
				for(int j = 0; j <= 10; j++){
					java.text.DecimalFormat f = new java.text.DecimalFormat("0");
						strArray.add(f.format(j));
				}
				//strArray.get(5000);
				strArray.sort(0);
				strArray.clear();
			}

	}
}