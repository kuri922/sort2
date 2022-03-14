
import java.util.stream.IntStream;

public class Sample112 {

	// 文字列を保持する
	public String[] items = new String[2];
	public int capacity = 0;
	private int size = 2;


	// 最下行に要素を追加
	public void add(String data){
		if (size == capacity) {
			ArraySize();
		}
		items[size] = data;
		size++;
		//items[addNumber] = data;
		//System.out.println(addNumber + items[addNumber]);
		//addNumber++;
	}

	// 指定インデックスの要素を上書き（指定インデックスが無い場合エラー）
	public void set(int index, String data){
	
		try {
		
			addNumber = index;
			items[addNumber] = data;
			System.out.println(addNumber + items[addNumber]);
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("指定のインデックスがありません");
		}
	
	}

// 指定インデックスの要素を取得（指定インデックスが無い場合エラー）;
	public String get(int index){
		addNumber = index;
		System.out.println(addNumber + items[addNumber]);
		return items[addNumber];
		
	}


// 全ての要素をクリア
	public void clear(){
		
		for (int i = 0; i < addNumber; i++) {
		items[i] = null;
		}
		addNumber = 0;
	}
	
}	




	class Sample111 {
		
		public static void main(String[] args) {
			
			A21_StrArray strArray = new A21_StrArray();
			strArray.get("10");
			strArray.get("20");
			strArray.get("30");
			strArray.get("50");
        
		}
	}