import com.Facade.Facade;
import com.Singleton.SingletonEager;
import com.Singleton.SingletonLazy;
import com.Singleton.SingletonLazyHolder;
import com.Strategy.IComportamento;
import com.Strategy.ComportamentoAgressivo;
import com.Strategy.ComportamentoDefensivo;
import com.Strategy.ComportamentoNormal;
import com.Strategy.Robo;

public class Main {
	public static void main(String args[]) {
		
		
		System.out.println("Teste relacionado ao Desing Pattern Singleton: ");
		//Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyh = SingletonLazyHolder.getInstancia();
		System.out.println(lazyh);
		lazyh = SingletonLazyHolder.getInstancia();
		System.out.println(lazyh);
		
		
		//Strategy
		
		IComportamento defensivo = new ComportamentoDefensivo();
		IComportamento normal = new ComportamentoNormal();
		IComportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		//Facade
		System.out.println("Testes com Facade");
		
		Facade facade = new Facade();
		facade.migrarCLiente("Gabriel", "431....123");
		
		
	}
}
