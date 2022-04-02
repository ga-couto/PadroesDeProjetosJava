package subsistema2.cep;

import com.Singleton.SingletonEager;

public class CepAPI {
	
	private static CepAPI instancia = new CepAPI();
	private CepAPI() {
		super();
	}
	public static CepAPI getInstancia() {
		return instancia;
	}
	
	
	public String recuperarCidade() {
		return "Registro";
	}
	public String recuperarEstado() {
		return "São Paulo";
	}
}
