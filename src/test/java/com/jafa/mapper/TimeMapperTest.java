package com.jafa.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.AppTest;

import lombok.extern.log4j.Log4j;

@Log4j
public class TimeMapperTest extends AppTest {

	@Autowired
	TimeMapper mapper;
	
	@Test
	public void test() {
		String time = mapper.getTime();
		System.out.println(time);
		log.info("log4j 사용 테스트 .....");
	}

}
