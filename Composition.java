package Java_composition;

public class Composition {

	public static void main(String[] args) {
		���� a���� = new ����();
	    a����.����();
	    // ��� : ������ ������ ���ư��ϴ�.
	    
	    û�տ��� aû�տ��� = new û�տ���();
	    aû�տ���.����();
	    // ��� : ������ ������ ���ư��ϴ�.
	    
	    ����� a����� = new �����();
	    a�����.����();
	    // ��� : ������ ������ ���ư��ϴ�.
	    
	    ������ a������ = new ������();
	     a������.����();
	    //��� : ������ ������ ���ư��ϴ�.

	}

}

class ����{
		 void ����(){
			System.out.println("������ ������ ���ư��ϴ�.");		
		}
}
class û�տ��� extends ����{
	 
}
class ����� extends ����{
	 
}
class ������ extends ����{
	void ����(){
		System.out.println("�������� �ϴ��� �����ƿ�Ф�.");		
	}
}

