package template2;
/**
 * 
 * @author usuario
 * @param prepareCoffe
 * @param doDelivery
 * @param processOrder
 * @param Exception
 *
 */

public abstract class DoCoffe {
	
	 public boolean isBoiling;
	  
	    public abstract void putSugar();
	  
	    public abstract void putCoffe();
	   
	    public abstract void payment();
	  
	    public final void prepareCoffe()
	    {
	        try
	        {
	            System.out.println("O café está pronto, coloque o copo na máquina");
	        }
	        catch (Exception e)
	        {
	            System.out.println("Houve um problema");
	        }
	    }
	  
	    public abstract void doDelivery();
	  
	    public final void processOrder(boolean isBoiling)
	    {
	        putSugar();
	        putCoffe();
	        if (isBoiling) {
	            prepareCoffe();
	        }
	        doDelivery();
	    }
	  
}
