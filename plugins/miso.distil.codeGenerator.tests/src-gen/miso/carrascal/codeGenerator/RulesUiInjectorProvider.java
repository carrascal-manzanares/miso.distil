/*
 * generated by Xtext
 */
package miso.carrascal.codeGenerator;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class RulesUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return miso.carrascal.codeGenerator.ui.internal.RulesActivator.getInstance().getInjector("miso.carrascal.codeGenerator.Rules");
	}
	
}
