package org.atenea.aiengineaccess.test;

import org.squadra.atenea.aiengineaccess.AIEngineAccessFacade;

public class AIEngineAccessTest {

	public static void main(String[] args) {
		AIEngineAccessFacade engineAccess = new AIEngineAccessFacade();
		
		System.out.println( "##############################");
		System.out.println( engineAccess.execute("hola") );
		System.out.println( engineAccess.execute("hola") );
		System.out.println( engineAccess.execute("hola") );
		System.out.println( engineAccess.execute("hola") );
		System.out.println( engineAccess.execute("hola") );
		System.out.println( "##############################");
		while(true);
	}
	
}
