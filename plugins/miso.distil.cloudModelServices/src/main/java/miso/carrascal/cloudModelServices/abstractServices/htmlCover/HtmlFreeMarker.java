package miso.carrascal.cloudModelServices.abstractServices.htmlCover;

import static spark.Spark.modelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.htmlObjects.HtmlSelectBox;

/**
 * Class with information to use html pages.
 * 
 * @author Carlos Carrascal.
 */
public class HtmlFreeMarker {
	public static String FORM_HTML = "form.ftl.html";
	public static String READ_HTML = "read.ftl.html";
	public static String LIST_HTML = "list.ftl.html";
	
	public static String FORM = "FORM";
	public static String SELECTBOX = "SELECTBOX";
	public static String TEXTS = "TEXTS";
	public static String RADIOS = "RADIOS";
	public static String FILE = "FILES";
	public static String HIDDENS = "HIDDENS";
	public static String MULTI_ENTRIES = "MULTI_ENTRIES";
	public static String ENTRIES = "ENTRIES";
	
	public static String ENCTYPE_DEFAULT = "application/x-www-form-urlencoded";
	public static String ENCTYPE_FILE = "multipart/form-data";	

	public static String EMPTY = "EMPTY";
	public static String ERROR = "ERROR";
	public static String TEMPLATE = "TEMPLATE";
	public static String COUNT = "COUNT";
	public static String SYNONYMS_VALUES = "SYNONYMS_VALUES";
	
	private static String LAYOUTS = "LAYOUTS";
	private static String LAYOUT_HTML = "layout.ftl.html";
	
	/**
	 * Layouts, for each "string" or artifact's name, save multiple boxes, each one wit a link.
	 */
	private static Map<String, List<HtmlSelectBox>> layouts = new HashMap<String, List<HtmlSelectBox>>();
	
	/**
	 * To add permanent links in boxes in the principal layout.
	 * 
	 * @param label Artifact's name.
	 * @param layout List with links.
	 */
	public static void addLayout(String label, List<HtmlSelectBox> layout) {
		layouts.put(label, layout);
	}
	
	/**
	 * To finish and close an HTML before sending to the client.
	 * 
	 * @param viewObjects Speacial structure of SPARK.
	 * @return Speacial structure of SPARK.
	 */
	public static ModelAndView closeHtml(Map<String, Object> viewObjects) {
		viewObjects.put(LAYOUTS, layouts);
		return modelAndView(viewObjects, LAYOUT_HTML);				
	}
}

