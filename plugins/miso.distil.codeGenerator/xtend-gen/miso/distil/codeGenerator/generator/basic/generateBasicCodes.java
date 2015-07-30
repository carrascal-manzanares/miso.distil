package miso.distil.codeGenerator.generator.basic;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write BasicXXXCodes.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateBasicCodes {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write Basic<artifact.name>Codes.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    EList<Attribute> _attributes = artifact.getAttributes();
    final EList<Attribute> allAtts = this.genUti.getAllNestedAttributes(_attributes);
    _builder.newLineIfNotEmpty();
    int pos = (-1);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _basicChar = this.names.getBasicChar(artifact);
    _builder.append(_basicChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated error codes");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author miso.distil.codeGenerator");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class Basic");
    _builder.append(name, "");
    _builder.append("Codes {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Param_error = \"ParameterError : Parameter is incorrect\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Parameters errors");
    _builder.newLine();
    _builder.append("\t");
    Object _xblockexpression = null;
    {
      pos = (-1);
      _xblockexpression = null;
    }
    _builder.append(_xblockexpression, "\t");
    _builder.newLineIfNotEmpty();
    {
      for(final Attribute att : allAtts) {
        _builder.append("\t");
        Object _xblockexpression_1 = null;
        {
          pos++;
          _xblockexpression_1 = null;
        }
        _builder.append(_xblockexpression_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String Param_");
        String _newAttName = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
        _builder.append(_newAttName, "\t");
        _builder.append(" = \"ParameterError : ");
        String _newAttName_1 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
        _builder.append(_newAttName_1, "\t");
        _builder.append(" is incorrect\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Param_emptyfile = \"ParameterError : File or filename not found\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Param_corruptfile = \"ParameterError : Corrupt file\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String DB_notfound = \"DataBaseError : ");
    _builder.append(name, "\t");
    _builder.append(" not found\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static String DB_notupdated = \"DataBaseError : ");
    _builder.append(name, "\t");
    _builder.append(" not updated\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static String DB_notuploaded = \"DataBaseError : ");
    _builder.append(name, "\t");
    _builder.append(" not uploaded\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String ");
    _builder.append(name, "\t");
    _builder.append("_notfound = \"");
    _builder.append(name, "\t");
    _builder.append(" not found. Try again later\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}