package cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;

public class TratadorMensagemServidor implements ITratador {

	private Socket cliente; 
	private Gson gson = new Gson();

	public TratadorMensagemServidor() {
		
	}

	@Override
	public void run() {
		Scanner in_serv;
		try {
			in_serv = new Scanner(cliente.getInputStream());
			while (in_serv.hasNextLine()) {
				
				Teste t = gson.fromJson(in_serv.nextLine(), Teste.class);
				
				System.out.println(t.Count());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void setSocket(Socket socket) {
		this.cliente = socket;
		
	}

}
