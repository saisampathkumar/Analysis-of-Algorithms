package stackpack;

public class stackll {
	
	 int data;	 
	 protected stackll link;
	 
	    public stackll()
	    {
	        link = null;
	        data = 0;
	    }	 
	    public stackll(int d,stackll n)
	    {
	        data = d;
	        link = n;
	    }    
	   
	    
	    public void setLink(stackll n)
	    {
	        link = n;
	    }    
	    public void setData(int d)
	    {
	        data = d;
	    }    
	    
	    
	    public stackll getLink()
	    {
	        return link;
	    }    
	    public int getData()
	    {
	        return data;
	    }
}
