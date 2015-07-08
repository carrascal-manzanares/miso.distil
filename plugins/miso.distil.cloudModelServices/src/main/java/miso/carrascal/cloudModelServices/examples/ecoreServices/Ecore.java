package miso.carrascal.cloudModelServices.examples.ecoreServices;

import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.AbstractPersistentClass;
import miso.carrascal.cloudModelServices.abstractServices.filter.EType;
import miso.carrascal.cloudModelServices.examples.ecoreServices.filter.FilterEcoreInfo;
import miso.carrascal.cloudModelServices.utils.Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
 
public class Ecore extends AbstractPersistentClass {
	
	private static final long serialVersionUID = 1L;
	private String author;   
    private String summary;
    private Boolean active;
    private List<FilterEcoreInfo> filterInfo;
    private HashMap<EType, Boolean> filters;
    
    public Ecore() {
    	super();
    }
    
    public Ecore(String name, long fileSize, List<String> tags, String summary, String author, 
    		Boolean active,  List<FilterEcoreInfo> filterInfo, HashMap<EType, Boolean> filters) {
    	
    	super(name, fileSize, tags);
    	
        this.author = author;
        this.summary = summary;
        this.active = active;
        this.filterInfo = filterInfo;
        this.filters = filters;
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public List<FilterEcoreInfo> getFilterInfo() {
		return filterInfo;
	}

	public void setFilterInfo(List<FilterEcoreInfo> filterInfo) {
		this.filterInfo = filterInfo;
	}

	public String getFilterInfoJson() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return Utils.escapeHTML(gson.toJson(filterInfo));
	}

	public HashMap<EType, Boolean> getFilters() {
		return filters;
	}

	public void setFilters(HashMap<EType, Boolean> filters) {
		this.filters = filters;
	}
}