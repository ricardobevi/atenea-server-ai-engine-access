package org.atenea.aiengineaccess.test;

import org.atenea.aiengineaccess.AIEngineAccessFacade;

public class AIEngineAccessTest {

	public static void main(String[] args) {
		AIEngineAccessFacade engineAccess = new AIEngineAccessFacade();
		
		System.out.println( "##############################");
		System.out.println( engineAccess.excecute("hola") );
		System.out.println( engineAccess.excecute("hola") );
		System.out.println( engineAccess.excecute("hola") );
		System.out.println( engineAccess.excecute("hola") );
		System.out.println( engineAccess.excecute("hola") );
		System.out.println( "##############################");
		while(true);
	}
	
}