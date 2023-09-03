package com.example.ooppractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OopPracticeApplicationTests {

	@DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 에러가 발생하지 않는다.")
	@Test
	void validatePasswordTest() {
		assertThatCode(Passwordvalidator.validate("serverwizerd"))
	}

}
