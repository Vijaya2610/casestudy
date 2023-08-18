package mongoproject.mongoclientapp;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.bson.conversions.Bson;

public class PhoneApp {
	
	MongoClient client;
	MongoDatabase phonedb;
	MongoCollection<Document> collection;
	public static final String COLLECTION_NAME="phone_coll";
	
	public PhoneApp()
	{
		 try {
		client=new MongoClient("localhost",27017);
		 phonedb=client.getDatabase("phone");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 }
	
	public void createCollection()
	{
  try {
	   phonedb.createCollection(COLLECTION_NAME);
  }
  catch(Exception e)
  {
System.out.println(e);	  
  }
	}

	public void getCollections()
	{
		collection=phonedb.getCollection(COLLECTION_NAME);
	}
	
	public void addToCollection(int transaction_id,String sender_no,String receiver_no,int message_length,float receiving_time)
	{
		Document doc=new Document();
		doc.put("transaction_id", transaction_id);
		doc.put("sender_no", sender_no);
		doc.put("receiver_no", receiver_no);
		doc.put("message_length", message_length);
		doc.put("receiving_time", receiving_time);
		collection.insertOne(doc);
	}
	
	
	
 public void viewDocuments()
 {
	    FindIterable<Document> iterable=collection.find();

    for(Document d :iterable)
    {
    	 System.out.println(d);
    }
 }
 
 
 public void updateDocument()
 {
	 Document query=new Document().append("sender_no","1234567890" );
	 try {
		  Bson updates=Updates.combine(Updates.set("receiving_time", 10.45));
		  UpdateResult updateresult=collection.updateOne(query,updates);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
 }
 

}


