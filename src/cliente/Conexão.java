package cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import com.google.gson.Gson;

public class Conexão {

	private String endereço;
	private int porta;
	private Socket socket;
	private Gson gson = new Gson();

	public Conexão(String endereço, int porta) {
		this.endereço = endereço;
		this.porta = porta;
	}

	public void AbrirConexão(ITratador tratadorDeMensagensDoServidor) throws IOException {
		this.socket = new Socket(this.endereço, this.porta);

		System.out.println("O cliente se conectou ao servidor");
		tratadorDeMensagensDoServidor.setSocket(this.socket);
		Thread t = new Thread(tratadorDeMensagensDoServidor);
		t.start();
	}

	public <T> void EnviarInformação(T informação) throws IOException {
		PrintStream saida = new PrintStream(this.socket.getOutputStream());
		String json = gson.toJson(informação);
		saida.println(json);
	}

}
