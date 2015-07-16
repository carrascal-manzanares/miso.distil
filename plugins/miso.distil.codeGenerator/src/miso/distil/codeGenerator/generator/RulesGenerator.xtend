/*
 * generated by Xtext
 */
package miso.distil.codeGenerator.generator

import codeGeneratorModel.Entity
import codeGeneratorModel.Artifact
import codeGeneratorModel.Root
import codeGeneratorModel.ServiceEnum
import com.google.inject.Inject

import miso.distil.codeGenerator.generator.entities.generateMain
import miso.distil.codeGenerator.generator.entities.generateArtifactClass
import miso.distil.codeGenerator.generator.entities.generateEntityClass
import miso.distil.codeGenerator.generator.entities.generateMongoDataBase

import miso.distil.codeGenerator.generator.basic.generateBasicCodes
import miso.distil.codeGenerator.generator.basic.generateBasicParam
import miso.distil.codeGenerator.generator.basic.generateBasicSpark

import miso.distil.codeGenerator.generator.custom.generateJson
import miso.distil.codeGenerator.generator.custom.generateCustomHtml

import miso.distil.codeGenerator.generator.html.generateHtmlJson
import miso.distil.codeGenerator.generator.html.generateHtmlSpark
import miso.distil.codeGenerator.generator.html.generateHtmlLinks
import miso.distil.codeGenerator.generator.html.generateHtmlView

import miso.distil.codeGenerator.generator.services.generateMultiService
import miso.distil.codeGenerator.generator.services.generateSimpleService
import miso.distil.codeGenerator.generator.services.generateServicesSpark

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.SimpleService
import codeGeneratorModel.MultiService
import codeGeneratorModel.Service

/**
 * This class contains custom generation rules. 
 * 
 * @author Carlos Carrascal
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RulesGenerator implements IGenerator {
	
	@Inject Names names
	
	@Inject generateMain genMain
	@Inject generateMongoDataBase genMongoDB
	@Inject generateJson genJso
	@Inject generateArtifactClass genArtifact
	@Inject generateEntityClass genEnti
	
	@Inject generateBasicCodes genBasCod
	@Inject generateBasicSpark genBasSpa
	@Inject generateBasicParam genBasPar
	
	@Inject generateHtmlSpark genHtmSpa
	@Inject generateHtmlJson genHtmJso
	@Inject generateHtmlLinks genHtmLin
	@Inject generateHtmlView genHtmVie
	
	@Inject generateMultiService genMulSer
	@Inject generateSimpleService genSimSer
	@Inject generateServicesSpark genSerSpa
	
	@Inject generateCustomHtml genCusHtm
		
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		// Root file (overwrite existing files)
		fsa.generateFile(
			names.mainFileStri + ".java",
			genMain.write())
			
		// Custom DB (overwrite)
		fsa.generateFile(
			names.DBFileStri + ".java",
			genMongoDB.write(resource.allContents.filter(Root).last))
			    	
		// Auxiliar entities (overwrite)
		resource.allContents.filter(Entity).forEach[
			fsa.generateFile(
				names.getEntityFileStri(it) + ".java",
		    	genEnti.write(it))
		]
		
		// Simple services (not overwrite existing files)
		resource.allContents.filter(SimpleService).forEach[
			fsa.generateFile(
				names.getServiceFileStri(it) + ".java",
				GeneratorOutputConfiguration::GEN_ONCE_OUTPUT,
		    	genSimSer.write(it))
		]
		
		// Multi services (overwrite)
		resource.allContents.filter(MultiService).forEach[
			fsa.generateFile(
				names.getServiceFileStri(it)+ ".java",
		    	genMulSer.write(it))
		]
		
		// Spark services (overwrite)
		if(!resource.allContents.filter(Root).last.services.empty) {
			fsa.generateFile(
					names.servicesSparkFileStri + ".java",
			    	genSerSpa.write(resource.allContents.filter(Root).last.services as EList<Service>))
		}

		// For each Artifact
		for(artifact : resource.allContents.filter(Root).last.artifacts as EList<Artifact>) {
			
			// Artifact file (overwrite)
			fsa.generateFile(
			    names.getArtifactFileStri(artifact) + ".java",
			    genArtifact.write(artifact))

			// Update/Upload methods (once)
			if(!artifact.basicServices.empty) {
				fsa.generateFile(
					names.getArtifactJsonFileStri(artifact) + ".java",
					GeneratorOutputConfiguration::GEN_ONCE_OUTPUT,
					genJso.write(artifact))
			}
			
			// Html custom cover (once)
			if(artifact.basicServices.contains(ServiceEnum.READ) || artifact.basicServices.contains(ServiceEnum.READ_ALL) || 
				artifact.basicServices.contains(ServiceEnum.UPDATE) || artifact.basicServices.contains(ServiceEnum.UPLOAD) ||
				artifact.basicServices.contains(ServiceEnum.SEARCH) || artifact.basicServices.contains(ServiceEnum.ALL))
			{
				fsa.generateFile(
					names.getArtifactCustomFileStri(artifact) + ".java",
					GeneratorOutputConfiguration::GEN_ONCE_OUTPUT,
					genCusHtm.write(artifact))
			}
							
			// Basic files (overwrite)
			if(!artifact.basicServices.empty)
			{
				fsa.generateFile(
					names.getBSparkFileStri(artifact) + ".java",
					genBasSpa.write(artifact))
					
				fsa.generateFile(
					names.getBCodesFileStri(artifact) + ".java",
					genBasCod.write(artifact))
					
				fsa.generateFile(
					names.getBParamFileStri(artifact) + ".java",
					genBasPar.write(artifact))
			}

			// Html Cover (overwrite)
			if(artifact.basicServices.contains(ServiceEnum.READ) || artifact.basicServices.contains(ServiceEnum.READ_ALL) || 
				artifact.basicServices.contains(ServiceEnum.UPDATE) || artifact.basicServices.contains(ServiceEnum.UPLOAD) ||
				artifact.basicServices.contains(ServiceEnum.SEARCH) || artifact.basicServices.contains(ServiceEnum.ALL))
			{				
				fsa.generateFile(
					names.getHSparkFileStri(artifact) + ".java",
					genHtmSpa.write(artifact))
					
				fsa.generateFile(
					names.getHViewFileStri(artifact) + ".java",
					genHtmVie.write(artifact))
					
				fsa.generateFile(
					names.getHJsonFileStri(artifact) + ".java",
					genHtmJso.write(artifact))
			}
			
			// Links (overwrite)
			if(artifact.basicServices.contains(ServiceEnum.READ) || artifact.basicServices.contains(ServiceEnum.DOWNLOAD) || 
				artifact.basicServices.contains(ServiceEnum.UPDATE) || artifact.basicServices.contains(ServiceEnum.DELETE) ||
				artifact.basicServices.contains(ServiceEnum.ALL))
			{
				fsa.generateFile(
					names.getHLinksFileStri(artifact) + ".java",
					genHtmLin.write(artifact))
			}			
		}
	}
}
