my com.crud.mongodb;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

public class InsertOperation {

	/**
	 * 
	 * 
	 * {
			"database" : "test",
			"table" : "hosting",
			"detail" : 
				{
					records : 99,
					index : "vps_index1",
					active : "true"
					feedback : 
						{
							author : "Rana"
							comment : "MongoDB Java ex."
						}
				}
			}
		}
	 */

	public static void main(String[] args) {
		try {

			MongoClient mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("crud");

			DBCollection collection = db.getCollection("edurekacoll");

			// 1. BasicDBObject example
						System.out.println("BasicDBObject example...");
						BasicDBObject document = new BasicDBObject();
						document.put("database", "test");
						document.put("table", "hosting");

						BasicDBObject documentDetail = new BasicDBObject();
						documentDetail.put("records", 99);
						documentDetail.put("index", "vps_index1");
						documentDetail.put("active", "true");
						
						BasicDBObject feedback = new BasicDBObject();
						feedback.put("author", "Rana");
						feedback.put("comment", "this is first comment");
						
						documentDetail.put("feedback", feedback);
						
						document.put("detail", documentDetail);

						collection.insert(document);

						DBCursor cursorDoc = collection.find();
						while (cursorDoc.hasNext()) {
							System.out.println(cursorDoc.next());
						}
						
			// 2. BasicDBObjectBuilder example
						System.out.println("BasicDBObjectBuilder example...");
						BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
								.add("database", "test").add("table", "hosting");

						BasicDBObjectBuilder documentBuilderDetail = BasicDBObjectBuilder
								.start().add("records", "99").add("index", "vps_index1")
								.add("active", "true");

						documentBuilder.add("detail", documentBuilderDetail.get());

						collection.insert(documentBuilder.get());

						DBCursor cursorDocBuilder = collection.find();
						while (cursorDocBuilder.hasNext()) {
							System.out.println(cursorDocBuilder.next());
						}

						collection.remove(new BasicDBObject());

						// 3. Map example
						System.out.println("Map example...");
						Map<String, Object> documentMap = new HashMap<String, Object>();
						documentMap.put("database", "test");
						documentMap.put("table", "hosting");

						Map<String, Object> documentMapDetail = new HashMap<String, Object>();
						documentMapDetail.put("records", "99");
						documentMapDetail.put("index", "vps_index1");
						documentMapDetail.put("active", "true");

						documentMap.put("detail", documentMapDetail);

						collection.insert(new BasicDBObject(documentMap));

						DBCursor cursorDocMap = collection.find();
						while (cursorDocMap.hasNext()) {
							System.out.println(cursorDocMap.next());
						}

						collection.remove(new BasicDBObject());

						// 4. JSON parse example
						System.out.println("JSON parse example...");

						String json = "{'database' : 'test','table' : 'hosting',"
								+ "'detail' : {'records' : 99, 'index' : 'vps_index1', 'active' : 'true'}}}";

						DBObject dbObject = (DBObject) JSON.parse(json);

						collection.insert(dbObject);

						DBCursor cursorDocJSON = collection.find();
						while (cursorDocJSON.hasNext()) {
							System.out.println(cursorDocJSON.next());
						}

						collection.remove(new BasicDBObject());


			
			//collection.remove(new BasicDBObject()); /// you can remove this while submitting the project

			

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}

	}

}
