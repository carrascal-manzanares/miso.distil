/*
 * generated by Xtext
 */
package miso.distil.codeGenerator.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import miso.distil.codeGenerator.ui.internal.RulesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RulesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RulesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RulesActivator.getInstance().getInjector(RulesActivator.MISO_DISTIL_CODEGENERATOR_RULES);
	}
	
}