package kr.ac.koreantech.devopt_step0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevoptStep0ApplicationTests {

	@Test
	void contextLoads() {
	}
	//두 수를 더하는 함수
	int add(int a, int b){
		return a+b;
	}

	@Test
	void addTest1(){
		int result = add(10,20);
		assertEquals(30,result);
	}
	@Test
	void addTest2(){
		int result = add(10,20);
		assertEquals(10,result);
	}

}
