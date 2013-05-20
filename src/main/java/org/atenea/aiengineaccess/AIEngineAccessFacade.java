package org.atenea.aiengineaccess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atenea.base.Log;
import org.scuadra.atenea.aiengine.AIEngineFacade;
import org.scuadra.atenea.aiengine.Message;



public class AIEngineAccessFacade {
	
	private Logger logger = LogManager.getLogger(this.getClass());
	
	public String excecute(String input) {
		
		Message message = new Message(input);
		
		AIEngineFacade aiEngineFacade = new AIEngineFacade();
		
		return aiEngineFacade.execute(message).getText();

	}
	
	public Message excecute(Message input) {
		
		AIEngineFacade aiEngineFacade = new AIEngineFacade();
		
		return aiEngineFacade.execute(input);

	}
	
}
