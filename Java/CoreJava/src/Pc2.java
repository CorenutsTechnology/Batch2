
public class Pc2
{
	int count = 0;
	 
    void A() throws Exception
    {
        try
        {
            count++;
            System.out.println(count);
             
            try
            {
                count++;
                System.out.println(count);

                try
                {
                    count++;
                    System.out.println(count);

                    throw new Exception();
 
                }
                 
                catch(Exception ex)
                {
                    count++;
                    System.out.println(count);

                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;
                System.out.println(count);

            }
        }
         
        catch(Exception ex)
        {
            count++;
        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
        Pc2 obj = new Pc2();
        obj.A();
        obj.display();
    }
}
