package studya.a21;

	class A21_exec {
		
		public static void main(String[] args) {
			
			A21_StrArray strArray = new A21_StrArray();
			
			//aaa�`dd��ǉ�
			strArray.add("aaa");
			strArray.add("bbb");
			strArray.add("ccc");
			strArray.add("dd");
			
			//4�̗v�f���擾���ĕ\��
			for(int i = 0; i < 4 ; i++){
				System.out.println(strArray.items[i]);
			
			}
			//���ׂăN���A
			strArray.clear();
			
			//ee001�`e100��100�ǉ�
			java.text.DecimalFormat format = new java.text.DecimalFormat("ee000");
			for(int i = 1; i <= 100; i++){
			strArray.add(format.format(i));
			}
			
			//76�Ԗڂ̗v�f���擾���ĕ\��
			String number = strArray.get(76);
			
			//�擪�̗v�f��a001�ɏ㏑��
			strArray.set(0 , "a001");
			
			//�Ō�̗v�f��z100�ɏ㏑��
			strArray.set(99 , "z100");
			
			//�擪�̗v�f���擾���ĕ\��
			String number1 = strArray.get(0);
			
			//�Ō�̗v�f���擾���ĕ\��
			String number2 = strArray.get(99);
			
			strArray.clear();
       
		
			
		}
	}
