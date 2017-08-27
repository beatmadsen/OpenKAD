package il.technion.ewolf.kbr.openkad.net;


import il.technion.ewolf.kbr.Node;
import il.technion.ewolf.kbr.openkad.msg.KadMessage;

import java.io.IOException;

public interface Communicator extends Runnable {

    void bind();

    void send(Node to, KadMessage msg) throws IOException;

    void shutdown(Thread serverThread);
}