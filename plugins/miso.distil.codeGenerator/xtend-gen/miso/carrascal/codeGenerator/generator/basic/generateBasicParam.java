package miso.carrascal.codeGenerator.generator.basic;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.SimpleAttribute;
import com.google.inject.Inject;
import miso.carrascal.codeGenerator.generator.generateUtils;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class generateBasicParam {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private packages pack;
  
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    EList _attributes = artifact.getAttributes();
    final EList<Attribute> allAtts = this.genUti.getAllNestedAttributes(_attributes);
    _builder.newLineIfNotEmpty();
    int pos = (-1);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _basicChar = this.pack.getBasicChar(artifact);
    _builder.append(_basicChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoBasic, "");
    _builder.append(".BasicAbstractParam;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Basic");
    _builder.append(name, "");
    _builder.append("Param extends BasicAbstractParam {");
    _builder.newLineIfNotEmpty();
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
        {
          if ((att instanceof SimpleAttribute)) {
            {
              boolean _isRequired = ((SimpleAttribute)att).isRequired();
              if (_isRequired) {
                _builder.append("\t");
                _builder.append("public static String ");
                String _newAttName = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                String _firstUpper = StringExtensions.toFirstUpper(_newAttName);
                _builder.append(_firstUpper, "\t");
                _builder.append(" = \"");
                String _newAttName_1 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                String _upperCase = _newAttName_1.toUpperCase();
                _builder.append(_upperCase, "\t");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static List<String> values = new ArrayList<String>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static List<String> values() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(values.isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("values.addAll(BasicAbstractParam.values());");
    _builder.newLine();
    _builder.append("\t\t\t");
    Object _xblockexpression_2 = null;
    {
      pos = (-1);
      _xblockexpression_2 = null;
    }
    _builder.append(_xblockexpression_2, "\t\t\t");
    _builder.newLineIfNotEmpty();
    {
      for(final Attribute att_1 : allAtts) {
        _builder.append("\t\t\t");
        Object _xblockexpression_3 = null;
        {
          pos++;
          _xblockexpression_3 = null;
        }
        _builder.append(_xblockexpression_3, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          if ((att_1 instanceof SimpleAttribute)) {
            {
              boolean _isRequired_1 = ((SimpleAttribute)att_1).isRequired();
              if (_isRequired_1) {
                _builder.append("\t\t\t");
                _builder.append("values.add(");
                String _newAttName_2 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                String _firstUpper_1 = StringExtensions.toFirstUpper(_newAttName_2);
                _builder.append(_firstUpper_1, "\t\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return values;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
