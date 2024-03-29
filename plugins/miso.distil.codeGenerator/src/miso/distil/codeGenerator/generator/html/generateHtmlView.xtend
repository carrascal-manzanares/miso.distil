package miso.distil.codeGenerator.generator.html

import codeGeneratorModel.Attribute
import codeGeneratorModel.DataEnum
import codeGeneratorModel.Artifact
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.ServiceEnum
import codeGeneratorModel.Primitive
import codeGeneratorModel.ArtifactID

/**
 * To write HtmlXXXView.java.
 * 
 * @author Carlos Carrascal.
 */
class generateHtmlView {
	
	@Inject miso.distil.codeGenerator.generator.generateUtils genUti
	@Inject miso.distil.codeGenerator.generator.Names names

	/**
	 * To write Html"artifact.name"View.java.
	 * 
	 * @param artifact the artifact.
	 */				
	def write(Artifact artifact) '''
		«var EList<ServiceEnum> basicServices = artifact.basicServices»
		«val namelow = artifact.name.toLowerCase»
		«val name = artifact.name»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
		«var pos = -1»
		package «names.getHtmlChar(artifact)»;

		import java.util.ArrayList;
		«IF basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD)»
			import java.util.HashMap;
			import java.util.Map;
		«ENDIF»
		import java.util.List;

		import «names.MisoHtml».HtmlInterfaceView;
		«IF basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPDATE) || basicServices.contains(ServiceEnum.UPLOAD)»
			import «names.MisoHtml».HtmlFreeMarker;
		«ENDIF»
		import «names.MisoHtml».htmlObjects.*;
		«IF basicServices.contains(ServiceEnum.READ) || basicServices.contains(ServiceEnum.UPDATE)»
			«var util = false»
			«FOR att:allAtts»
				«IF (att instanceof Primitive || att instanceof ArtifactID) && att.many && !util»
					«{util = true; null}»
					import «names.MisoUtils».Utils;
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		
		«IF basicServices.contains(ServiceEnum.SEARCH) || basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.UPDATE)»
			import «names.getBParamFileChar(artifact)»;
		«ENDIF»
		«IF basicServices.contains(ServiceEnum.UPLOAD) || basicServices.contains(ServiceEnum.UPDATE)»
			import «names.getBSparkFileChar(artifact)»;
		«ENDIF»
		import «names.getArtifactFileChar(artifact)»;

		/**
		 * Auto-generated html view methods.
		 * 
		 * @author miso.distil.codeGenerator.
		 */
		public class Html«name»View implements HtmlInterfaceView<«name»>{

			«IF basicServices.contains(ServiceEnum.READ)»
				/**
				 * Auto-generated method to construct the information from an artifact.
				 * 
				 * @param «namelow» «name» to read.
				 * @return list with entries to show in html.
				 */
				@Override
				public List<HtmlEntry> constructInfoReadOne(«name» «namelow») {
					List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
					entries.add(new HtmlEntry(«namelow».getFilename(), EntrySize.H3));
					entries.add(new HtmlEntry(«namelow».getCreatedatString(), EntrySize.H4));
					entries.add(new HtmlEntry("FileSize (bytes): " + «namelow».getFilesize().toString(), EntrySize.H4));
					entries.add(new HtmlEntry("ObjectId : " + «namelow».getObjectid().toString(), EntrySize.H4));
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive»
							«val newName = genUti.getNewAttNameByPoint(pos, artifact)»
							«IF att.type.equals(DataEnum.STRING) && !att.many»
								entries.add(new HtmlEntry("«newName» : " + «genUti.getNestedGets(pos, artifact)», EntrySize.H5));
							«ELSEIF (att.type.equals(DataEnum.DOUBLE) || att.type.equals(DataEnum.DOUBLE) || att.type.equals(DataEnum.INTEGER)) && !att.many»
								entries.add(new HtmlEntry("«newName» : " + «genUti.getNestedGets(pos, artifact)».toString(), EntrySize.H5));
							«ELSEIF att.many»
								entries.add(new HtmlEntry("«newName» : " + Utils.listToString(«genUti.getNestedGets(pos, artifact)»), EntrySize.H5));				
							«ENDIF»
						«ENDIF»
						«IF att instanceof ArtifactID»
							«val newName = genUti.getNewAttName(pos, artifact)»
							«IF !att.many»
								entries.add(new HtmlEntry("«newName» : " + «genUti.getNestedGets(pos, artifact)», EntrySize.H5));
							«ELSE»
								entries.add(new HtmlEntry("«newName» : " + Utils.listToString(«genUti.getNestedGets(pos, artifact)»), EntrySize.H5));				
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					«IF basicServices.contains(ServiceEnum.DOWNLOAD)»
						entries.add(new HtmlEntry(Html«name»Links.getDownloadJsonLink(«namelow»), EntrySize.H5));
					«ENDIF»
					«IF basicServices.contains(ServiceEnum.UPDATE)»
						entries.add(new HtmlEntry(Html«name»Links.getUpdateHtmlLink(«namelow»), EntrySize.H5));
					«ENDIF»
					«IF basicServices.contains(ServiceEnum.DELETE)»
						entries.add(new HtmlEntry(Html«name»Links.getDeleteFormJsonLink(«namelow»), EntrySize.H5));
					«ENDIF»

					return entries;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.READ_ALL)»
				/**
				 * Auto-generated method to construct the information from an artifact's list.
				 * 
				 * @param «namelow»s list of «name» to read.
				 * @return list with lists of entries to show in html.
				 */
				@Override
				public List<List<HtmlEntry>> constructInfoReadAll(List<«name»> «namelow»s) {
					List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();
						for(«name» «namelow» : «namelow»s) {
							List<HtmlEntry> entries = new ArrayList<HtmlEntry>();
							«IF basicServices.contains(ServiceEnum.READ)»
								entries.add(new HtmlEntry(Html«name»Links.getReadHtmlLink(«namelow»), EntrySize.H3));
							«ENDIF»
							entries.add(new HtmlEntry(«namelow».getCreatedatString(), EntrySize.H4));
							«IF basicServices.contains(ServiceEnum.READ)»
								entries.add(new HtmlEntry(Html«name»Links.getReadJsonLink(«namelow»), EntrySize.H5));
							«ENDIF»
							«IF basicServices.contains(ServiceEnum.UPDATE)»
								entries.add(new HtmlEntry(Html«name»Links.getUpdateHtmlLink(«namelow»), EntrySize.H5));
							«ENDIF»
							«IF basicServices.contains(ServiceEnum.DELETE)»
								entries.add(new HtmlEntry(Html«name»Links.getDeleteFormJsonLink(«namelow»), EntrySize.H5));
							«ENDIF»
							multientries.add(entries);
						}

					return multientries;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.SEARCH)»
				/**
				 * Auto-generated method to construct the search form.
				 * 
				 * @return special map of SPARK to show objects in HTML.
				 */
				@Override
				public Map<String, Object> constructSearchForm() {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					HtmlForm form = new HtmlForm(Html«name»Spark.SearchHTML, "«namelow»-search-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Search", "GET");
					viewObjects.put(HtmlFreeMarker.FORM, form);
					
					Map<String, List<HtmlSelectBox>> selectbox = new HashMap<String, List<HtmlSelectBox>>();
					List<HtmlSelectBox> boxes = new ArrayList<HtmlSelectBox>();
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive || att instanceof ArtifactID»
							«val newName = genUti.getNewAttNameByPoint(pos, artifact)»
							boxes.add(new HtmlSelectBox("«newName»", "«newName»"));
						«ENDIF»
					«ENDFOR»
					selectbox.put(Basic«name»Param.Search_query, boxes);
					viewObjects.put(HtmlFreeMarker.SELECTBOX, selectbox);

					List<HtmlText> texts = new ArrayList<HtmlText>();
					texts.add(new HtmlText(Basic«name»Param.Search_value, "", "Value", "search", "Enter what do you want to search"));
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					radios.add(new HtmlRadio(Basic«name»Param.Search_synonyms, "Synonyms", "synonyms", true));
					viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					return viewObjects;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPDATE)»
				/**
				 * Auto-generated method to construct the update form.
				 * 
				 * @param «namelow» «name» to update.
				 * @return special map of SPARK to show objects in HTML.
				 */
				@Override
				public Map<String, Object> constructUpdateForm(«name» «namelow») {
					Map<String, Object> viewObjects = new HashMap<String, Object>();
					HtmlForm form = new HtmlForm(Basic«name»Spark.UpdateJson, "«namelow»-update-form", HtmlFreeMarker.ENCTYPE_DEFAULT, "Update", "POST");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					List<HtmlText> texts = new ArrayList<HtmlText>();
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive»
							«IF att.required»
								«val newName = genUti.getNewAttName(pos, artifact)»
								«val newPointName = genUti.getNewAttNameByPoint(pos, artifact)»
								«IF att.type.equals(DataEnum.STRING) && !att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName.toFirstUpper», «genUti.getNestedGets(pos, artifact)», "«newPointName.toLowerCase»", "«att.name»", ""));
								«ELSEIF (att.type.equals(DataEnum.DOUBLE) || att.type.equals(DataEnum.INTEGER)) && !att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName.toFirstUpper», «genUti.getNestedGets(pos, artifact)».toString(), "«newPointName.toLowerCase»", "«att.name»", ""));
								«ELSEIF att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName.toFirstUpper», Utils.listToString(«genUti.getNestedGets(pos, artifact)»), "«newPointName.toLowerCase» («att.name»1,«att.name»2,...)", "«att.name»", ""));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive»
							«IF att.required»
								«var newName = genUti.getNewAttName(pos, artifact)»
								«val newPointName = genUti.getNewAttNameByPoint(pos, artifact)»
								«IF att.type.equals(DataEnum.BOOLEAN) && !att.many»
									radios.add(new HtmlRadio(Basic«name»Param.«newName.toFirstUpper», "«newPointName.toLowerCase»", "«att.name»", «genUti.getNestedGets(pos, artifact)»));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();
					hiddens.add(new HtmlHidden(Basic«name»Param.IdPost, «namelow».getObjectid()));
					viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);
					return viewObjects;
				}

			«ENDIF»
			«IF basicServices.contains(ServiceEnum.UPLOAD)»
				/**
				 * Auto-generated method to construct the upload form.
				 * 
				 * @return special map of SPARK to show objects in HTML.
				 */
				@Override
				public Map<String, Object> constructUploadForm() {
					Map<String, Object> viewObjects = new HashMap<String, Object>();

					HtmlForm form = new HtmlForm(Basic«name»Spark.UploadJson, "«namelow»-upload-form", HtmlFreeMarker.ENCTYPE_FILE, "Upload", "POST");
					viewObjects.put(HtmlFreeMarker.FORM, form);

					List<HtmlText> texts = new ArrayList<HtmlText>();
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive»
							«IF att.required»
								«val newName = genUti.getNewAttName(pos, artifact)»
								«val newPointName = genUti.getNewAttNameByPoint(pos, artifact)»
								«IF !att.type.equals(DataEnum.BOOLEAN) && !att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName.toFirstUpper», "", "«newPointName.toLowerCase»", "«att.name»", "Enter valid «att.type.toString»"));
								«ELSEIF att.many»
									texts.add(new HtmlText(Basic«name»Param.«newName.toFirstUpper», "", "«newPointName.toLowerCase» («att.name»1,«att.name»2,...)", "«att.name»", "Enter new list of valid «att.type.toString»"));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.TEXTS, texts);

					List<HtmlRadio> radios = new ArrayList<HtmlRadio>();
					«{pos = -1; null}»
					«FOR att:allAtts»
						«{pos++; null}»
						«IF att instanceof Primitive»
							«IF att.required»
								«val newName = genUti.getNewAttName(pos, artifact)»
								«val newPointName = genUti.getNewAttNameByPoint(pos, artifact)»
								«IF att.type.equals(DataEnum.BOOLEAN) && !att.many»
									radios.add(new HtmlRadio(Basic«name»Param.«newName.toFirstUpper», "«newPointName.toLowerCase»", "«att.name»", true));
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					viewObjects.put(HtmlFreeMarker.RADIOS, radios);

					List<HtmlFile> file = new ArrayList<HtmlFile>();
					file.add(new HtmlFile(Basic«name»Param.File, "Choose your «namelow»", "file"));
					viewObjects.put(HtmlFreeMarker.FILE, file);

					return viewObjects;
				}
			«ENDIF»
		}
	'''
}