package com.crud.mongodb;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
 
/**
 * Java MongoDB : Save image example
 * 
 */
 
public class SaveImage {
	public static void main(String[] args) {
 
		try {
 
			// boolean auth = db.authenticate("testdb", "password".toCharArray());
			// if (auth) {
			// do operation
			//}
			
			//Mongo mongo = new Mongo("localhost", 27017);
			MongoClient mongo = new MongoClient("localhost", 27017);
			
			DB db = mongo.getDB("record");
			//DBCollection collection = db.getCollection("dummyColl");
 
			String newFileName = "my_java_image2.jpg";
 
			File imageFile = new File("D:\\Rana2\\workspace\\gridfs\\image\\geojson_polygon.jpg");
 
			// create/connect a "photo" namespace
			GridFS gfsPhoto = new GridFS(db, "photo");
			//GridFS gfsPhoto = new GridFS(db);
 
			// get image file from local drive
			GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
 
			// set a new filename for identify purpose
			gfsFile.setFilename(newFileName);
 
			// save the image file into mongoDB
			gfsFile.save();// mongofiles -d record put edureka_java_image1.jpg -l "D:\\Rana2\\workspace\\gridfs\\image\\image1.jpg"
 
			// print the result
			DBCursor cursor = gfsPhoto.getFileList(); // mongofiles -d record list
			while (cursor.hasNext()) {
				//System.out.println(cursor.next());
				DBObject obj = cursor.next();
				System.out.println(obj.get("filename"));
			}
 
			// get image file by it's filename
			GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName); // mongofiles -d record get my_java_image1.jpg 
 
			// save it into a new image file
			imageForOutput.writeTo("D:\\Rana2\\workspace\\gridfs\\output\\geojson_polygon_2.jpg");
 
			// remove the image file from mongoDB
			// gfsPhoto.remove(gfsPhoto.findOne(newFileName));
 
			System.out.println("Done");
 
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
}
