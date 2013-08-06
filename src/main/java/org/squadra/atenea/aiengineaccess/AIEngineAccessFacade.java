package org.squadra.atenea.aiengineaccess;

import lombok.extern.log4j.Log4j;

import org.squadra.atenea.aiengine.AIEngineFacade;
import org.squadra.atenea.ateneacommunication.Message;



@Log4j
public class AIEngineAccessFacade {
	
	//private Logger logger = LogManager.getLogger(this.getClass());
	
	private AIEngineFacade aiEngineFacade;
	
	public AIEngineAccessFacade(){
		
		aiEngineFacade = new AIEngineFacade();
	}
	
	
	public String execute(String input) {
		
		log.debug("------------log aiEngineAccess");
		Message message = new Message(input);
		
		return aiEngineFacade.execute(message).getText();

	}
	
	public Message execute(Message input) {
		log.debug("------------log aiEngineAccess");
		AIEngineFacade aiEngineFacade = new AIEngineFacade();
		
		return aiEngineFacade.execute(input);

	}
	
}
