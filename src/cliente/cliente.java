package cliente;

import java.io.IOException;

public class cliente {
	public static void main(String[] args) throws IOException {

		Conexão conexão = new Conexão("127.0.0.1", 5001);
		conexão.AbrirConexão(new TratadorMensagemServidor());
		conexão.EnviarInformação(new Teste());
	}
}