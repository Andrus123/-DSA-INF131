package MultiplesPedidos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircularCombos cc1=new CCircularCombos();
		cc1.llenar();
		cc1.mostrar();
		MultipleCCircularPedidosClientes mccp1= new MultipleCCircularPedidosClientes();
		mccp1.llenar();
		mccp1.mostrar();
		//a Mostrar los pedidos efectuados por el cliente X,
		// que tengan al combo con descripcion Y
		SolucionA(mccp1,cc1,"Andres","12 Pack de Hamburguesas");
	}
	private static void SolucionA(MultipleCCircularPedidosClientes mccp1, CCircularCombos cc1, String Clientex,
			String desc) {
		// TODO Auto-generated method stub
		CCircularPedidosClientes auxcp=new CCircularPedidosClientes();
		for(int i=1; i<=mccp1.getN();i++) {
			while(!mccp1.esvacia(i)) {
				ClientePedido x=mccp1.eliminar(i);
				if(x.getNomCliente().equals(Clientex))
					BuscarComboxDescripcion(x.getPd(),desc,cc1);
				auxcp.adicionar(x);
			}
		  mccp1.vaciar(i, auxcp);
		}
	}
	private static void BuscarComboxDescripcion(Pilapedidos pd, String desc,CCircularCombos c) {
		// TODO Auto-generated method stub
		CCircularCombos aux1= new CCircularCombos();
		Pilapedidos aux=new Pilapedidos();
		while(!c.esvacia()) {
			Combo x=c.eliminar();
			if(x.getDescripcion().equals(desc))
				System.out.println("Combo "+x.getNro_combo());
				ColaSimpleProductos xp=x.getP();
				xp.mostrar();
			aux1.adicionar(x);
		}
		c.vaciar(aux1);
	}
}
