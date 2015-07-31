/**
 * generated by Xtext
 */
package miso.distil.codeGenerator.ui.quickfix;

import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.validation.RulesValidator;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
@SuppressWarnings("all")
public class RulesQuickfixProvider extends DefaultQuickfixProvider {
  @Inject
  private Names names;
  
  @Fix(RulesValidator.UPPER_CASE)
  public void capitalName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      final String firstLetter = xtextDocument.get((_offset).intValue(), 1);
      Integer _offset_1 = issue.getOffset();
      String _upperCase = firstLetter.toUpperCase();
      xtextDocument.replace((_offset_1).intValue(), 1, _upperCase);
    };
    acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", _function);
  }
  
  @Fix(RulesValidator.LOWER_CASE)
  public void lowerName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      Integer _length = issue.getLength();
      final String name = xtextDocument.get((_offset).intValue(), (_length).intValue());
      Integer _offset_1 = issue.getOffset();
      Integer _length_1 = issue.getLength();
      String _lowerCase = name.toLowerCase();
      xtextDocument.replace((_offset_1).intValue(), (_length_1).intValue(), _lowerCase);
    };
    acceptor.accept(issue, "Lowercase name", "Lowercase the name.", "lowercase.png", _function);
  }
  
  @Fix(RulesValidator.INVALID_NAME)
  public void validCharacter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      Integer _length = issue.getLength();
      final String name = xtextDocument.get((_offset).intValue(), (_length).intValue());
      String newname = "";
      for (int i = 0; (i < name.length()); i++) {
        int _codePointAt = name.codePointAt(i);
        boolean _isLetterOrDigit = Character.isLetterOrDigit(_codePointAt);
        if (_isLetterOrDigit) {
          char _charAt = name.charAt(i);
          String _plus = (newname + Character.valueOf(_charAt));
          newname = _plus;
        }
      }
      Integer _offset_1 = issue.getOffset();
      Integer _length_1 = issue.getLength();
      xtextDocument.replace((_offset_1).intValue(), (_length_1).intValue(), newname);
    };
    acceptor.accept(issue, "Delete invalid characters", "Delete invalid characters.", "deletecharacters.png", _function);
  }
  
  @Fix(RulesValidator.PROHIBITED_REFERENCE)
  public void prohibitedReference(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      Integer _length = issue.getLength();
      xtextDocument.replace((_offset).intValue(), (_length).intValue(), "");
    };
    acceptor.accept(issue, "Delete prohibited reference", "Delete the prohibited reference.", "delete.png", _function);
  }
  
  @Fix(RulesValidator.ARTIFACT_TODO)
  public void artifactToDo(final Issue issue, final IssueResolutionAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nArtifact cannot be resolved to a type.");
  }
  
  @Fix(RulesValidator.SERVICE_TODO)
  public void serviceToDo(final Issue issue, final IssueResolutionAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nSimpleService cannot be resolved to a type.");
  }
  
  @Fix(RulesValidator.EMPTY_MONGO_URI)
  public void serviceMongoURI(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      IXtextDocument xtextDocument = context.getXtextDocument();
      xtextDocument.replace(0, 0, "MongoURI : \"\"\n");
    };
    acceptor.accept(issue, "I will implement my own data base later", "I will implement my own data base later.", "mongol.png", _function);
    final IModification _function_1 = (IModificationContext context) -> {
      IXtextDocument xtextDocument = context.getXtextDocument();
      xtextDocument.replace(0, 0, "MongoURI : \"mongodb://[username]:[password]@[host]:[port1]/[database]\"\n");
    };
    acceptor.accept(issue, "I have no idea what i\'m doing", "I have no idea  what i\'m doing.", "mongol.png", _function_1);
  }
}
