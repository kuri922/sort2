package studya.a21;
import java.util.stream.IntStream;

public class A23_StrArray {

	// �������ێ�����
	public String[] items = new String[0];
	public int capacity = 0;
	private int size = 0;


	// �ŉ��s�ɗv�f��ǉ�
	public void add(String data){
		String[] tempArray = null;
		if (size == capacity) {
			tempArray = new String[capacity + 1];
			{
				 if (capacity >= 0) {
                    System.arraycopy(items, 0, tempArray, 0, capacity);
				 }
			}
			items[size] = data;
			size++;
			
		}
		
		//items[addNumber] = data;
		//System.out.println(addNumber + items[addNumber]);
		//addNumber++;
	}

	// �w��C���f�b�N�X�̗v�f���㏑���i�w��C���f�b�N�X�������ꍇ�G���[�j
	public void set(int index, String data){
	
		try {
		
			addNumber = index;
			items[addNumber] = data;
			System.out.println(addNumber + items[addNumber]);
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("�w��̃C���f�b�N�X������܂���");
		}
	
	}

// �w��C���f�b�N�X�̗v�f���擾�i�w��C���f�b�N�X�������ꍇ�G���[�j;
	public String get(int index){
		addNumber = index;
		System.out.println(addNumber + items[addNumber]);
		return items[addNumber];
		
	}


// �S�Ă̗v�f���N���A
	public void clear(){
		
		for (int i = 0; i < addNumber; i++) {
		items[i] = null;
		}
		addNumber = 0;
	}
	
}	


package studya.a21;

	class A23_exec {
		
		public static void main(String[] args) {
			
			A21_StrArray strArray = new A21_StrArray();
			strArray.get("10");
			strArray.get("20");
			strArray.get("30");
			strArray.get("50");
        
		}
	}