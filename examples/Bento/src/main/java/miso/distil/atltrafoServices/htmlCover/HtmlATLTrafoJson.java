package miso.distil.atltrafoServices.htmlCover;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceJson;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlFreeMarker;
import miso.carrascal.cloudModelServices.abstractServices.htmlCover.HtmlInterfaceView;

import miso.distil.atltrafoServices.basic.BasicATLTrafoCodes;
import miso.distil.atltrafoServices.ATLTrafoJson;
import miso.distil.atltrafoServices.CustomATLTrafoHtml;
import miso.distil.atltrafoServices.ATLTrafo;

/**
 * Auto-generated html methods
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlATLTrafoJson implements HtmlInterfaceJson {

	private ATLTrafoJson Json = new ATLTrafoJson();
	private HtmlATLTrafoView View = new HtmlATLTrafoView();
	private HtmlInterfaceView<ATLTrafo> customView;

	/**
	 * Auto-generated empty constructor
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlATLTrafoJson() {
		customView = View;
	}

	/**
	 * Auto-generated constructor with a custom view
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public HtmlATLTrafoJson(CustomATLTrafoHtml View) {
		customView = View;
	}

	/**
	 * Auto-generated method to read the information from an artifact
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getRead(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		ATLTrafo atltrafo = (ATLTrafo) Json.getRead(req, res);
		if(atltrafo == null) {
			viewObjects.put(HtmlFreeMarker.ERROR, BasicATLTrafoCodes.DB_notfound);
		} else {
			viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(atltrafo));
		}
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to read the information from an artifact's list
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getReadAll(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		ArrayList<ATLTrafo> atltrafos = new ArrayList<ATLTrafo>();
		for(Persistent atltrafo : Json.getReadAll(req, res)) {
			atltrafos.add((ATLTrafo)atltrafo);
		}
		viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(atltrafos));
		viewObjects.put(HtmlFreeMarker.COUNT, atltrafos.size());
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to construct the search form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getSearchForm() {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		viewObjects = View.constructSearchForm();
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
	
		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to read the information from the result list of a search
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getSearch(Request req, Response res) {	
		Map<String, Object> viewObjects = new HashMap<String, Object>();

		ArrayList<ATLTrafo> atltrafos = new ArrayList<ATLTrafo>();
		for(Persistent atltrafo : Json.getSearch(req, res)) {
			atltrafos.add((ATLTrafo)atltrafo);
		}
		if(atltrafos.isEmpty()) {
			viewObjects = View.constructSearchForm();
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 
			viewObjects.put(HtmlFreeMarker.EMPTY, BasicATLTrafoCodes.ATLTrafo_notfound);
		} else {	
			viewObjects = new HashMap<String, Object>();
			viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(atltrafos));
			viewObjects.put(HtmlFreeMarker.COUNT, atltrafos.size());
			viewObjects.put(HtmlFreeMarker.SYNONYMS_QUERY, Json.getSynonymesQuery(req, res));
			viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUE, Json.getSynonymesValue(req, res));
			viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);
		}

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

	/**
	 * Auto-generated method to construct the upload form
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public ModelAndView getUploadForm(Request req, Response res) {
		Map<String, Object> viewObjects = new HashMap<String, Object>();
		viewObjects = customView.constructUploadForm(req);
		viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); 

		return HtmlFreeMarker.closeHtml(viewObjects);
	}

}
