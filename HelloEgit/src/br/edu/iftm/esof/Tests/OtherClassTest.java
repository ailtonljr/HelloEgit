package br.edu.iftm.esof.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.esof.OtherClass;

public class OtherClassTest {

	@Test
	public void testGetMessage() {
		OtherClass oc = new OtherClass();
		assertNotNull(oc);
		
		assertEquals("Hello EGit with Eclipse!!!", oc.getMessage());
	}

}
