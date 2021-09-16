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
		SolucionA("Andres","12 Pack de Hamburguesas");
	}

	private static void SolucionA(String string, String string2) {
		// TODO Auto-generated method stub
		MultipleCCircularPedidosClientes aux=new MultipleCCircularPedidosClientes();
		
	}

}
