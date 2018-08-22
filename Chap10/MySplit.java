
public class MySplit {

	public static void main(String[] args) {
		String s = "ab#12#453";
		String regex = "#";
		String s2 = "ab?#12#453";
		String regex2 = "[#?]";
		String[] result1 = split(s,regex);
		String[] result2 = split(s2,regex2);
		for ( int i = 0; i < result1.length ; i ++ ) {
			System.out.println(result1[i]+" ");
		}
		for ( int i = 0; i < result1.length ; i ++ ) {
			System.out.println(result2[i]+" ");
		}
		

	}

	public static String[] split(String s, String regex) {
		String[] splittedArray = new String[8];
		initializeArray(splittedArray);
		for ( int i = 0, countOfString = 0; i < s.length() ; i ++) {
			//����ַ��������Ԫ�������������ȶ��ַ�����������������*2
			if ( countOfString >= splittedArray.length) {
				String[] tempString = new String[splittedArray.length];
				System.arraycopy(splittedArray, 0, tempString, 0, splittedArray.length);
				splittedArray = tempString;
				initializeArray(splittedArray);
			}
			if (!isDelimiter(s.charAt(i),regex)){
				splittedArray[countOfString]+=s.charAt(i);
			}
			else if (isDelimiter(s.charAt(i),regex)) {
				countOfString ++;
				splittedArray[countOfString] += s.charAt(i)+"";
				//����ַ������¸��ַ����Ƿָ�������countOfString ++
				if ( !isDelimiter(s.charAt(i+1),regex))
					countOfString++;
				//����¸��ַ������¸��ַ��Ƿָ������������������Ϊ���Զ�countOfString++
			}
		}
		return splittedArray;
	}

	private static void initializeArray(String[] splittedArray) {
		for ( int i = 0; i < splittedArray.length ; i ++ ) {
			if ( splittedArray[i]==null)		
				splittedArray[i] = "";
		}	
	}

	private static boolean isDelimiter(char charAt, String regex) {
		if (regex.length() == 1) {
			if  ((charAt+"").equals(regex))
				return true;
		}
		else  if (regex.length()!=1 && regex.charAt(0)=='['&&regex.charAt(regex.length() - 1)==']'){
			for ( int i = 1; i < regex.length()-1; i ++ ) {
				if ( charAt ==regex.charAt(i))
					return true;
			}
			}
		return false;
	}

}
