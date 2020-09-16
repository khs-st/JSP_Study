import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {

		/*
		  Vector v = new Vector();//타입 미설정 Object로 선언된다.
		  Vector<Student> student = new Vector<Student>(); //타입설정 Student객체만 사용가능 
		  Vector<Integer> num2 = new Vector<Integer>(); //타입설정 int타입만 사용가능
		  Vector<Integer> num3 = new Vector<>();//new에서 타입 파라미터 생략가능
		  Vector<String> v2 = new Vector<String>(10);//초기용량(capacity)지정 Vector<Integer> v3 = new
		  Vector<Integer>(Arrays.asList(1,2,3)); //초기값 지정
		 */
		Vector<String> v1 = new Vector<String>(2);

		v1.addElement("삼성");
		v1.addElement("LG");
		v1.addElement("SK");
		v1.addElement("구글");

		System.out.println("Vector 요소들은 다음과 같다.");
		for (int i = 0; i < v1.size(); i++) {
			System.out.println("v1의 " + i + "번째 요소 : " + v1.elementAt(i));
		}

		Enumeration<String> e = v1.elements();

		System.out.println();
		System.out.println("Vector v1으로부터 생성한 Enumeration의 요소들은 다음과 같다.");

		while (e.hasMoreElements()) {
			System.out.println("e의 요소 : " + e.nextElement());
		}
	}
}
