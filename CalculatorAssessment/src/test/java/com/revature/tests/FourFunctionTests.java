package com.revature.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.revatuer.assessors.RevAssess;
import com.revatuer.assessors.RevaTest;

@ExtendWith(RevAssess.class)
class FourFunctionTests {

	@RevaTest(points = 10)
	void add() {
		fail("Not yet implemented");
	}
	
	@RevaTest(points = 10)
	void subtract() {
		fail("Not yet implemented");
	}
	
	@RevaTest(points = 10)
	void multiply() {
		fail("Not yet implemented");
	}
	
	@RevaTest(points = 10)
	void divide() {
		fail("Not yet implemented");
	}

}
