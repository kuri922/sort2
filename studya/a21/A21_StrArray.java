package studya.a21;
import java.text.*;

public class A21_StrArray {
	// �������ێ�����
	public String[] items = new String[0];
	public String[] items2 = new String [items.length + 1];
	public int size = 0;

	
	// �ŉ��s�ɗv�f��ǉ�
	public void DynamicArrayTest() {
		items2 = new String [items.length + 1];
		System.arraycopy(items, 0, items2, 0, items.length);
		items = items2;			
	}			

	public void add(String data){
		DynamicArrayTest( );
		items[size] = data;
		System.out.println(items[size]);
		size++;

	}

	// �w��C���f�b�N�X�̗v�f���㏑���i�w��C���f�b�N�X�������ꍇ�G���[�j
	public void set(int index, String data){
	
		try {
			size = index;
			items[size] = data;
			System.out.println(items[size]);
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("�w��̃C���f�b�N�X������܂���");
		}
	
	}

// �w��C���f�b�N�X�̗v�f���擾�i�w��C���f�b�N�X�������ꍇ�G���[�j;
	public String get(int index){
		size = index;
		try {
			System.out.println(items[size]);
		}
		catch(NullPointerException e) {
			System.out.println("�w��̃C���f�b�N�X������܂���B");
		}
		return items[size];

	}


// �S�Ă̗v�f���N���A
	public void clear(){
		
		
		for (int i = 0; i < items.length; i++) {
			String[] items = new String[0];
		//items[i] = null;
				size = 0;
		}
	
		
		
		
	}
	
}	