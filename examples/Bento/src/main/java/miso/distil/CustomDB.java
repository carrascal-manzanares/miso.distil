package miso.distil;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.InterfaceDB;

/**
 * Auto-generated custom data base class
 * 
 * @author miso.distil.codeGenerator
 */
public class CustomDB implements InterfaceDB, BasicInterfaceSpark 
{
	/**
	 * Auto-generated spark service to find and activate this data base.
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {
		// To create your own DB implementation (implementing InterfaceDB)
		// CustomDB customDB = new CustomDB();

		// To create another MongoDB
		// String MONGO_URI = ""; // Valid mongo uri!! Example : mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]
		// MongoDB mongoDB = new MongoDB(MONGO_URI);

		// To register them or set default one of them
		// Remember : all auto-generated code use the default DB
    	// Integer positionDB = RecordDB.register(customDB); 	// (Use RecordDB.getDB(positionDB) to reach it)
    	// RecordDB.setDefault(mongoDB);						// (Use RecordDB.getDefault() to reach it)
	}

	/**
	 * Auto-generated empty constructor.
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public CustomDB() {
		// Do something
	}

	/**
	 * Auto-generated save method. It has to save "artifact" and his associated file's "inputstream".
	 * When saved, it will be necessary to store the artifact class
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Boolean save(Persistent artifact, InputStream inputStream) {
		return false;
	}

	/**
	 * Auto-generated delete method. It has to delete the "id" artifact, knowing his class "classType".
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Boolean delete(String id, Class<? extends Persistent> classType) {
		return false;
	}

	/**
	 * Auto-generated read method. It has to return the "id" artifact, knowing his class "classType".
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public Persistent readOne(String id, Class<? extends Persistent> classType) {
		return null;
	}

	/**
	 * Auto-generated readAll method. It has to return all the artifacts with "classType" class.
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ArrayList<? extends Persistent> readAll(Class<? extends Persistent> classType) {
		return new ArrayList<Persistent>();
	}

	/**
	 * Auto-generated search method. It has to return all the artifacts with and "attribute" coincident with "value" with class "classType".
	 * "synonymes_att" allows to search "attribute" synonymes and "synonymes_val" allows to search "value" synonymes. 
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ArrayList<? extends Persistent> search(String attribute, Boolean synonymes_att, String value, Boolean synonymes_val, Class<? extends Persistent> classType) {
		return new ArrayList<Persistent>();
	}

	/**
	 * Auto-generated search by tag method. Its similar to search("tags", false, tag, synonymes, classType).
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ArrayList<? extends Persistent> searchTag(String tag, Boolean synonymes, Class<? extends Persistent> classType) {
		return new ArrayList<Persistent>();
	}

	/**
	 * Auto-generated synonymes method. It returns the synonymes used with a word "query" in search and searchTag.
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public List<String> getSynonymes(String query) {
		return new ArrayList<String>();
	}

	/**
	 * Auto-generated getInputStream method. It has to return the input stream associated to the "id" artifact with class "classType"
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public InputStream getInputStream(String id, Class<? extends Persistent> classType) {
		return null;
	}

	/**
	 * Auto-generated count method. It returns the quantity of artifacts stored.
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public long count() {
		return 0;
	}

	/**
	 * Auto-generated count method. It returns the quantity of artifacts with class "classType" stored.
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public long count(Class<? extends Persistent> classType) {
		return 0;
	}

	/**
	 * Auto-generated max size method. It returns the maximum size allowed to one artifact.
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public int maxSaveSize() {
		return 0;
	}
}