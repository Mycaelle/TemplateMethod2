package template2;

/**
 * 
 * @author usuario
 * @param putSugar
 * @param payment
 * @param putCoffe
 *
 */


public class Order extends DoCoffe {
	
	@Override
    public void putSugar()
    {
        System.out.println("A �gua do caf� est� fervendo");
        System.out.println("Verifique o pedido do cliente");
        System.out.println("Veja a qual foi o copo escolhido e coloque na m�quina");
    }
  
    @Override
    public void putCoffe()
    {
        System.out.println
                   ("Adicione o caf� na m�quina");
    }
  
    @Override
    public void payment()
    {
        System.out.println
                   ("Pagar em dinheiro, cart�o ou pix");
    }
    
    @Override
    public void doDelivery()
    {
        System.out.println
                    ("Entregue o caf� para o cliente");
    }
}
