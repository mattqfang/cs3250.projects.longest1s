package cs3250.projects.longest1s;

import org.junit.Test;

import junit.framework.Assert;

public class Tests {
	
	@Test
	public void TestAnswer() {
		Assert.assertEquals(3, LongestOnes.findConsecutiveOnes(14));
	}
}
