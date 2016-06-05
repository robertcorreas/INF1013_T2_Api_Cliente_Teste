package cliente;

import java.net.Socket;

public interface ITratador extends Runnable {

	void setSocket(Socket socket);
}
