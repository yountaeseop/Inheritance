package Java_composition;

public class Composition {

	public static void main(String[] args) {
		오리 a오리 = new 오리();
	    a오리.날다();
	    // 출력 : 오리가 날개로 날아갑니다.
	    
	    청둥오리 a청둥오리 = new 청둥오리();
	    a청둥오리.날다();
	    // 출력 : 오리가 날개로 날아갑니다.
	    
	    흰오리 a흰오리 = new 흰오리();
	    a흰오리.날다();
	    // 출력 : 오리가 날개로 날아갑니다.
	    
	    고무오리 a고무오리 = new 고무오리();
	     a고무오리.날다();
	    //출력 : 오리가 날개로 날아갑니다.

	}

}

class 오리{
		 void 날다(){
			System.out.println("오리가 날개로 날아갑니다.");		
		}
}
class 청둥오리 extends 오리{
	 
}
class 흰오리 extends 오리{
	 
}
class 고무오리 extends 오리{
	void 날다(){
		System.out.println("고무오리는 하늘을 못날아요ㅠㅠ.");		
	}
}

