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
        System.out.println("A água do café está fervendo");
        System.out.println("Verifique o pedido do cliente");
        System.out.println("Veja a qual foi o copo escolhido e coloque na máquina");
    }
  
    @Override
    public void putCoffe()
    {
        System.out.println
                   ("Adicione o café na máquina");
    }
  
    @Override
    public void payment()
    {
        System.out.println
                   ("Pagar em dinheiro, cartão ou pix");
    }
    
    @Override
    public void doDelivery()
    {
        System.out.println
                    ("Entregue o café para o cliente");
    }
}
