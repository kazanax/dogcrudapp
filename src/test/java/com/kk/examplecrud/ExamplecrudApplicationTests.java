package com.kk.examplecrud;


import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ExamplecrudApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void getMethod(){

    	given()
             
             .when()
             .get("dogs")
             .then()
             .statusCode(200);
	}


}