package org.squadra.atenea.aiengineaccess;

import org.squadra.atenea.aiengine.AIEngineFacade;
import org.squadra.atenea.aiengine.Message;



public class AIEngineAccessFacade {
	
	//private Logger logger = LogManager.getLogger(this.getClass());
	
	private AIEngineFacade aiEngineFacade;
	
	public AIEngineAccessFacade(){
		aiEngineFacade = new AIEngineFacade();
	}
	
	
	public String excecute(String input) {
		
		Message message = new Message(input);
		
		return aiEngineFacade.execute(message).getText();

	}
	
	public Message excecute(Message input) {
		
		AIEngineFacade aiEngineFacade = new AIEngineFacade();
		
		return aiEngineFacade.execute(input);

	}
	
}
