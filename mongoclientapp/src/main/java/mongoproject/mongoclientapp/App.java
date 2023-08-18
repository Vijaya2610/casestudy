package mongoproject.mongoclientapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	
       /* MongoApp obj=new MongoApp();
        //obj.createCollection();
        obj.getCollections();
        //obj.viewDocuments();
        //obj.updateDocument();
       // obj.viewDocuments();
       obj.addToCollection("Peter", "Sales");
        obj.addToCollection("Sam","Training");
        obj.viewDocuments(); */
        
        PhoneApp obj=new PhoneApp();
    	//obj.createCollection();
    	obj.getCollections();
    	//obj.addToCollection(1, "1234567890", "9087654321",50,30);
    	//obj.addToCollection(2, "9988700654", "9006598123",34,35);
    	
    	obj.updateDocument();
    	obj.viewDocuments();
        
    }
}
