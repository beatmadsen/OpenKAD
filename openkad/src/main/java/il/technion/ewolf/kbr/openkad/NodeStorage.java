package il.technion.ewolf.kbr.openkad;

import il.technion.ewolf.kbr.Node;

import java.util.List;


public interface NodeStorage {
	/**
	 * Register this data structure to listen to incoming messages and update itself
	 * accordingly.
	 * Invoke this method after creating the entire system
	 */
	void registerIncomingMessageHandler();
	/**
	 * 
	 * @return a list containing all the nodes in the data structure
	 */
	List<Node> getAllNodes();

}
