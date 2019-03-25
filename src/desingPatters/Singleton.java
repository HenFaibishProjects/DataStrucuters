package desingPatters;

class Singleton
{
    private static Singleton single_instance = null;


    private Singleton() { }


    public static Singleton getInstance()
    {

        {
            synchronized (Singleton.class)
            {
                if(single_instance==null)
                {
                    single_instance = new Singleton();
                }

            }
        }
        return single_instance;
    }
}
