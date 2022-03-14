package studya.a21;

	class A21_exec {
		
		public static void main(String[] args) {
			
			A21_StrArray strArray = new A21_StrArray();
			
			//aaa`dd‚ğ’Ç‰Á
			strArray.add("aaa");
			strArray.add("bbb");
			strArray.add("ccc");
			strArray.add("dd");
			
			//4‚Â‚Ì—v‘f‚ğæ“¾‚µ‚Ä•\¦
			for(int i = 0; i < 4 ; i++){
				System.out.println(strArray.items[i]);
			
			}
			//‚·‚×‚ÄƒNƒŠƒA
			strArray.clear();
			
			//ee001`e100‚Ì100ŒÂ’Ç‰Á
			java.text.DecimalFormat format = new java.text.DecimalFormat("ee000");
			for(int i = 1; i <= 100; i++){
			strArray.add(format.format(i));
			}
			
			//76”Ô–Ú‚Ì—v‘f‚ğæ“¾‚µ‚Ä•\¦
			String number = strArray.get(76);
			
			//æ“ª‚Ì—v‘f‚ğa001‚Éã‘‚«
			strArray.set(0 , "a001");
			
			//ÅŒã‚Ì—v‘f‚ğz100‚Éã‘‚«
			strArray.set(99 , "z100");
			
			//æ“ª‚Ì—v‘f‚ğæ“¾‚µ‚Ä•\¦
			String number1 = strArray.get(0);
			
			//ÅŒã‚Ì—v‘f‚ğæ“¾‚µ‚Ä•\¦
			String number2 = strArray.get(99);
			
			strArray.clear();
       
		
			
		}
	}
