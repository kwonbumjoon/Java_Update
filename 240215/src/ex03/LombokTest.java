package ex03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data				// equals, hashcode, setter, getter, tostring을 포함(가끔 버그 있음)
@Setter				// Setter 생성
@Getter				// Getter 생성
@ToString
@AllArgsConstructor	// 모든 변수 받아주는 생성자
@NoArgsConstructor	// default 생성자
public class LombokTest {
	int a;
	int b;
	int c;
	int d;

	public static void main(String[] args) {
		
		
	}

	
}
