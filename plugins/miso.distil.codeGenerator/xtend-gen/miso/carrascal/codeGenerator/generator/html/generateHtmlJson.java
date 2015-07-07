package miso.carrascal.codeGenerator.generator.html;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class generateHtmlJson {
  @Inject
  private packages pack;
  
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ServiceEnum> basicServices = artifact.getBasicServices();
    _builder.newLineIfNotEmpty();
    String _name = artifact.getName();
    final String namelow = _name.toLowerCase();
    _builder.newLineIfNotEmpty();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _htmlChar = this.pack.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import spark.ModelAndView;");
    _builder.newLine();
    _builder.append("import spark.Request;");
    _builder.newLine();
    _builder.append("import spark.Response;");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _or = false;
      boolean _contains = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains) {
        _or = true;
      } else {
        boolean _contains_1 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or = _contains_1;
      }
      if (_or) {
        _builder.append("import java.util.ArrayList;");
        _builder.newLine();
      }
    }
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoHtml, "");
    _builder.append(".HtmlInterfaceJson;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _or_1 = false;
      boolean _contains_2 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_2) {
        _or_1 = true;
      } else {
        boolean _contains_3 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_1 = _contains_3;
      }
      if (_or_1) {
        _builder.append("import ");
        _builder.append(this.pack.MisoAbstract, "");
        _builder.append(".AbstractPersistentClass;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    _builder.append(this.pack.MisoHtml, "");
    _builder.append(".HtmlFreeMarker;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.pack.MisoHtml, "");
    _builder.append(".HtmlInterfaceView;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _contains_4 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_4) {
        _or_3 = true;
      } else {
        boolean _contains_5 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_3 = _contains_5;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        boolean _contains_6 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
        _or_2 = _contains_6;
      }
      if (_or_2) {
        _builder.append("import ");
        CharSequence _basicChar = this.pack.getBasicChar(artifact);
        _builder.append(_basicChar, "");
        _builder.append(".Basic");
        _builder.append(name, "");
        _builder.append("Codes;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _or_4 = false;
      boolean _or_5 = false;
      boolean _or_6 = false;
      boolean _contains_7 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_7) {
        _or_6 = true;
      } else {
        boolean _contains_8 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
        _or_6 = _contains_8;
      }
      if (_or_6) {
        _or_5 = true;
      } else {
        boolean _contains_9 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
        _or_5 = _contains_9;
      }
      if (_or_5) {
        _or_4 = true;
      } else {
        boolean _contains_10 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_4 = _contains_10;
      }
      if (_or_4) {
        _builder.append("import ");
        CharSequence _artifactChar = this.pack.getArtifactChar(artifact);
        _builder.append(_artifactChar, "");
        _builder.append(".");
        _builder.append(name, "");
        _builder.append("Json;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    CharSequence _artifactChar_1 = this.pack.getArtifactChar(artifact);
    _builder.append(_artifactChar_1, "");
    _builder.append(".Custom");
    _builder.append(name, "");
    _builder.append("Html;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _artifactChar_2 = this.pack.getArtifactChar(artifact);
    _builder.append(_artifactChar_2, "");
    _builder.append(".");
    _builder.append(name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Html");
    _builder.append(name, "");
    _builder.append("Json implements HtmlInterfaceJson {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _or_7 = false;
      boolean _or_8 = false;
      boolean _or_9 = false;
      boolean _contains_11 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_11) {
        _or_9 = true;
      } else {
        boolean _contains_12 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
        _or_9 = _contains_12;
      }
      if (_or_9) {
        _or_8 = true;
      } else {
        boolean _contains_13 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
        _or_8 = _contains_13;
      }
      if (_or_8) {
        _or_7 = true;
      } else {
        boolean _contains_14 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_7 = _contains_14;
      }
      if (_or_7) {
        _builder.append("\t");
        _builder.append("private ");
        _builder.append(name, "\t");
        _builder.append("Json Json = new ");
        _builder.append(name, "\t");
        _builder.append("Json();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("private Html");
    _builder.append(name, "\t");
    _builder.append("View View = new Html");
    _builder.append(name, "\t");
    _builder.append("View();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private HtmlInterfaceView<");
    _builder.append(name, "\t");
    _builder.append("> customView;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Html");
    _builder.append(name, "\t");
    _builder.append("Json() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("customView = View;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Html");
    _builder.append(name, "\t");
    _builder.append("Json(Custom");
    _builder.append(name, "\t");
    _builder.append("Html View) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("customView = View;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _contains_15 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_15) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getRead(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(name, "\t\t");
        _builder.append(" ");
        _builder.append(namelow, "\t\t");
        _builder.append(" = (");
        _builder.append(name, "\t\t");
        _builder.append(") Json.getRead(req, res);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(");
        _builder.append(namelow, "\t\t");
        _builder.append(" == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.ERROR, Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.DB_notfound);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(");
        _builder.append(namelow, "\t\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_16 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_16) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getReadAll(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append("> ");
        _builder.append(namelow, "\t\t");
        _builder.append("s = new ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append(">();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for(AbstractPersistentClass ");
        _builder.append(namelow, "\t\t");
        _builder.append(" : Json.getReadAll(req, res)) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append(namelow, "\t\t\t");
        _builder.append("s.add((");
        _builder.append(name, "\t\t\t");
        _builder.append(")");
        _builder.append(namelow, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(");
        _builder.append(namelow, "\t\t");
        _builder.append("s));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.COUNT, ");
        _builder.append(namelow, "\t\t");
        _builder.append("s.size());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_17 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_17) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getSearchForm() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects = View.constructSearchForm();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); ");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_18 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_18) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getSearch(Request req, Response res) {\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append("> ");
        _builder.append(namelow, "\t\t");
        _builder.append("s = new ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append(">();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for(AbstractPersistentClass ");
        _builder.append(namelow, "\t\t");
        _builder.append(" : Json.getSearch(req, res)) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append(namelow, "\t\t\t");
        _builder.append("s.add((");
        _builder.append(name, "\t\t\t");
        _builder.append(")");
        _builder.append(namelow, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(");
        _builder.append(namelow, "\t\t");
        _builder.append("s.isEmpty()) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects = View.constructSearchForm();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.EMPTY, Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.");
        _builder.append(name, "\t\t\t");
        _builder.append("_notfound);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(");
        _builder.append(namelow, "\t\t\t");
        _builder.append("s));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.COUNT, ");
        _builder.append(namelow, "\t\t\t");
        _builder.append("s.size());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.SYNONYMS_QUERY, Json.getSynonymesQuery(req, res));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUE, Json.getSynonymesValue(req, res));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_19 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_19) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getUpdateForm(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(name, "\t\t");
        _builder.append(" ");
        _builder.append(namelow, "\t\t");
        _builder.append(" = (");
        _builder.append(name, "\t\t");
        _builder.append(") Json.getRead(req, res);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(");
        _builder.append(namelow, "\t\t");
        _builder.append(" == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.ERROR, Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.");
        _builder.append(name, "\t\t\t");
        _builder.append("_notfound);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects = customView.constructUpdateForm(");
        _builder.append(namelow, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_20 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
      if (_contains_20) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getUploadForm(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects = customView.constructUploadForm(req);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); ");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
