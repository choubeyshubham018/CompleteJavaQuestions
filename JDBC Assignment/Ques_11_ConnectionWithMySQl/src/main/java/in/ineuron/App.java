package in.ineuron;

import in.ineuron.dao.SelectOperation;

public class App 
{
    public static void main( String[] args )
    {
      SelectOperation sel = new SelectOperation();
      sel.selectOperation(3);
    }
}
