/**
 */
package codeGeneratorModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codeGeneratorModel.CodeGeneratorModelFactory
 * @model kind="package"
 * @generated
 */
public interface CodeGeneratorModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeGeneratorModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso/distil/codeGeneratorModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "miso.distil.codeGeneratorModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeGeneratorModelPackage eINSTANCE = codeGeneratorModel.impl.CodeGeneratorModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.RootImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ARTIFACTS = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Mongo UR Is</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MONGO_UR_IS = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.AbstractEntityImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getAbstractEntity()
	 * @generated
	 */
	int ABSTRACT_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Abstract Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.ArtifactImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ATTRIBUTES = ABSTRACT_ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = ABSTRACT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXTENSION = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__FORMAT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basic Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__BASIC_SERVICES = ABSTRACT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = ABSTRACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.AttributeImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MANY = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.PrimitiveImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__MANY = ATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__REQUIRED = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.EntityImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = ABSTRACT_ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ABSTRACT_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ABSTRACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.ServiceImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__WHEN = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.SimpleServiceImpl <em>Simple Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.SimpleServiceImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getSimpleService()
	 * @generated
	 */
	int SIMPLE_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__WHEN = SERVICE__WHEN;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__INPUT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE__OUTPUT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.MultiServiceImpl <em>Multi Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.MultiServiceImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getMultiService()
	 * @generated
	 */
	int MULTI_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SERVICE__WHEN = SERVICE__WHEN;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SERVICE__SERVICES = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SERVICE__PARALLEL = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.OnServiceImpl <em>On Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.OnServiceImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getOnService()
	 * @generated
	 */
	int ON_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SERVICE__ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>When Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SERVICE__WHEN_SERVICES = 1;

	/**
	 * The number of structural features of the '<em>On Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>On Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.ReferenceImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MANY = ATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.InoutImpl <em>Inout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.InoutImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getInout()
	 * @generated
	 */
	int INOUT = 11;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOUT__MANY = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOUT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOUT__COMPATIBILITY = 2;

	/**
	 * The number of structural features of the '<em>Inout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.impl.ArtifactIDImpl <em>Artifact ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.impl.ArtifactIDImpl
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getArtifactID()
	 * @generated
	 */
	int ARTIFACT_ID = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ID__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ID__MANY = ATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ID__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ID_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ID_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.DataEnum <em>Data Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.DataEnum
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getDataEnum()
	 * @generated
	 */
	int DATA_ENUM = 13;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.FormatEnum <em>Format Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.FormatEnum
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getFormatEnum()
	 * @generated
	 */
	int FORMAT_ENUM = 14;

	/**
	 * The meta object id for the '{@link codeGeneratorModel.ServiceEnum <em>Service Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codeGeneratorModel.ServiceEnum
	 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getServiceEnum()
	 * @generated
	 */
	int SERVICE_ENUM = 15;


	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see codeGeneratorModel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link codeGeneratorModel.Root#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see codeGeneratorModel.Root#getArtifacts()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link codeGeneratorModel.Root#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see codeGeneratorModel.Root#getEntities()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link codeGeneratorModel.Root#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see codeGeneratorModel.Root#getServices()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Services();

	/**
	 * Returns the meta object for the attribute list '{@link codeGeneratorModel.Root#getMongoURIs <em>Mongo UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mongo UR Is</em>'.
	 * @see codeGeneratorModel.Root#getMongoURIs()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_MongoURIs();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see codeGeneratorModel.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Artifact#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see codeGeneratorModel.Artifact#getExtension()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Extension();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Artifact#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see codeGeneratorModel.Artifact#getFormat()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Format();

	/**
	 * Returns the meta object for the attribute list '{@link codeGeneratorModel.Artifact#getBasicServices <em>Basic Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basic Services</em>'.
	 * @see codeGeneratorModel.Artifact#getBasicServices()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_BasicServices();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.AbstractEntity <em>Abstract Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entity</em>'.
	 * @see codeGeneratorModel.AbstractEntity
	 * @generated
	 */
	EClass getAbstractEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link codeGeneratorModel.AbstractEntity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see codeGeneratorModel.AbstractEntity#getAttributes()
	 * @see #getAbstractEntity()
	 * @generated
	 */
	EReference getAbstractEntity_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.AbstractEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codeGeneratorModel.AbstractEntity#getName()
	 * @see #getAbstractEntity()
	 * @generated
	 */
	EAttribute getAbstractEntity_Name();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see codeGeneratorModel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codeGeneratorModel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Attribute#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see codeGeneratorModel.Attribute#isMany()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Many();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see codeGeneratorModel.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Primitive#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see codeGeneratorModel.Primitive#getType()
	 * @see #getPrimitive()
	 * @generated
	 */
	EAttribute getPrimitive_Type();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Primitive#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see codeGeneratorModel.Primitive#isRequired()
	 * @see #getPrimitive()
	 * @generated
	 */
	EAttribute getPrimitive_Required();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see codeGeneratorModel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.SimpleService <em>Simple Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Service</em>'.
	 * @see codeGeneratorModel.SimpleService
	 * @generated
	 */
	EClass getSimpleService();

	/**
	 * Returns the meta object for the containment reference list '{@link codeGeneratorModel.SimpleService#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see codeGeneratorModel.SimpleService#getInput()
	 * @see #getSimpleService()
	 * @generated
	 */
	EReference getSimpleService_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link codeGeneratorModel.SimpleService#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see codeGeneratorModel.SimpleService#getOutput()
	 * @see #getSimpleService()
	 * @generated
	 */
	EReference getSimpleService_Output();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.MultiService <em>Multi Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Service</em>'.
	 * @see codeGeneratorModel.MultiService
	 * @generated
	 */
	EClass getMultiService();

	/**
	 * Returns the meta object for the reference list '{@link codeGeneratorModel.MultiService#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see codeGeneratorModel.MultiService#getServices()
	 * @see #getMultiService()
	 * @generated
	 */
	EReference getMultiService_Services();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.MultiService#isParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see codeGeneratorModel.MultiService#isParallel()
	 * @see #getMultiService()
	 * @generated
	 */
	EAttribute getMultiService_Parallel();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see codeGeneratorModel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see codeGeneratorModel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link codeGeneratorModel.Service#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see codeGeneratorModel.Service#getWhen()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_When();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.OnService <em>On Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Service</em>'.
	 * @see codeGeneratorModel.OnService
	 * @generated
	 */
	EClass getOnService();

	/**
	 * Returns the meta object for the reference '{@link codeGeneratorModel.OnService#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artifact</em>'.
	 * @see codeGeneratorModel.OnService#getArtifact()
	 * @see #getOnService()
	 * @generated
	 */
	EReference getOnService_Artifact();

	/**
	 * Returns the meta object for the attribute list '{@link codeGeneratorModel.OnService#getWhenServices <em>When Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>When Services</em>'.
	 * @see codeGeneratorModel.OnService#getWhenServices()
	 * @see #getOnService()
	 * @generated
	 */
	EAttribute getOnService_WhenServices();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see codeGeneratorModel.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link codeGeneratorModel.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see codeGeneratorModel.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Type();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.Inout <em>Inout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inout</em>'.
	 * @see codeGeneratorModel.Inout
	 * @generated
	 */
	EClass getInout();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Inout#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see codeGeneratorModel.Inout#isMany()
	 * @see #getInout()
	 * @generated
	 */
	EAttribute getInout_Many();

	/**
	 * Returns the meta object for the reference '{@link codeGeneratorModel.Inout#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see codeGeneratorModel.Inout#getType()
	 * @see #getInout()
	 * @generated
	 */
	EReference getInout_Type();

	/**
	 * Returns the meta object for the attribute '{@link codeGeneratorModel.Inout#getCompatibility <em>Compatibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compatibility</em>'.
	 * @see codeGeneratorModel.Inout#getCompatibility()
	 * @see #getInout()
	 * @generated
	 */
	EAttribute getInout_Compatibility();

	/**
	 * Returns the meta object for class '{@link codeGeneratorModel.ArtifactID <em>Artifact ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact ID</em>'.
	 * @see codeGeneratorModel.ArtifactID
	 * @generated
	 */
	EClass getArtifactID();

	/**
	 * Returns the meta object for the reference '{@link codeGeneratorModel.ArtifactID#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see codeGeneratorModel.ArtifactID#getType()
	 * @see #getArtifactID()
	 * @generated
	 */
	EReference getArtifactID_Type();

	/**
	 * Returns the meta object for enum '{@link codeGeneratorModel.DataEnum <em>Data Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Enum</em>'.
	 * @see codeGeneratorModel.DataEnum
	 * @generated
	 */
	EEnum getDataEnum();

	/**
	 * Returns the meta object for enum '{@link codeGeneratorModel.FormatEnum <em>Format Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Enum</em>'.
	 * @see codeGeneratorModel.FormatEnum
	 * @generated
	 */
	EEnum getFormatEnum();

	/**
	 * Returns the meta object for enum '{@link codeGeneratorModel.ServiceEnum <em>Service Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Enum</em>'.
	 * @see codeGeneratorModel.ServiceEnum
	 * @generated
	 */
	EEnum getServiceEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeGeneratorModelFactory getCodeGeneratorModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.RootImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ARTIFACTS = eINSTANCE.getRoot_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ENTITIES = eINSTANCE.getRoot_Entities();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SERVICES = eINSTANCE.getRoot_Services();

		/**
		 * The meta object literal for the '<em><b>Mongo UR Is</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__MONGO_UR_IS = eINSTANCE.getRoot_MongoURIs();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.ArtifactImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__EXTENSION = eINSTANCE.getArtifact_Extension();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__FORMAT = eINSTANCE.getArtifact_Format();

		/**
		 * The meta object literal for the '<em><b>Basic Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__BASIC_SERVICES = eINSTANCE.getArtifact_BasicServices();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.AbstractEntityImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getAbstractEntity()
		 * @generated
		 */
		EClass ABSTRACT_ENTITY = eINSTANCE.getAbstractEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ENTITY__ATTRIBUTES = eINSTANCE.getAbstractEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ENTITY__NAME = eINSTANCE.getAbstractEntity_Name();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.AttributeImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MANY = eINSTANCE.getAttribute_Many();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.PrimitiveImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE__TYPE = eINSTANCE.getPrimitive_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE__REQUIRED = eINSTANCE.getPrimitive_Required();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.EntityImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.SimpleServiceImpl <em>Simple Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.SimpleServiceImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getSimpleService()
		 * @generated
		 */
		EClass SIMPLE_SERVICE = eINSTANCE.getSimpleService();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SERVICE__INPUT = eINSTANCE.getSimpleService_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SERVICE__OUTPUT = eINSTANCE.getSimpleService_Output();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.MultiServiceImpl <em>Multi Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.MultiServiceImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getMultiService()
		 * @generated
		 */
		EClass MULTI_SERVICE = eINSTANCE.getMultiService();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_SERVICE__SERVICES = eINSTANCE.getMultiService_Services();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_SERVICE__PARALLEL = eINSTANCE.getMultiService_Parallel();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.ServiceImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__WHEN = eINSTANCE.getService_When();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.OnServiceImpl <em>On Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.OnServiceImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getOnService()
		 * @generated
		 */
		EClass ON_SERVICE = eINSTANCE.getOnService();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_SERVICE__ARTIFACT = eINSTANCE.getOnService_Artifact();

		/**
		 * The meta object literal for the '<em><b>When Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_SERVICE__WHEN_SERVICES = eINSTANCE.getOnService_WhenServices();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.ReferenceImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.InoutImpl <em>Inout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.InoutImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getInout()
		 * @generated
		 */
		EClass INOUT = eINSTANCE.getInout();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INOUT__MANY = eINSTANCE.getInout_Many();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INOUT__TYPE = eINSTANCE.getInout_Type();

		/**
		 * The meta object literal for the '<em><b>Compatibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INOUT__COMPATIBILITY = eINSTANCE.getInout_Compatibility();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.impl.ArtifactIDImpl <em>Artifact ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.impl.ArtifactIDImpl
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getArtifactID()
		 * @generated
		 */
		EClass ARTIFACT_ID = eINSTANCE.getArtifactID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_ID__TYPE = eINSTANCE.getArtifactID_Type();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.DataEnum <em>Data Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.DataEnum
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getDataEnum()
		 * @generated
		 */
		EEnum DATA_ENUM = eINSTANCE.getDataEnum();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.FormatEnum <em>Format Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.FormatEnum
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getFormatEnum()
		 * @generated
		 */
		EEnum FORMAT_ENUM = eINSTANCE.getFormatEnum();

		/**
		 * The meta object literal for the '{@link codeGeneratorModel.ServiceEnum <em>Service Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codeGeneratorModel.ServiceEnum
		 * @see codeGeneratorModel.impl.CodeGeneratorModelPackageImpl#getServiceEnum()
		 * @generated
		 */
		EEnum SERVICE_ENUM = eINSTANCE.getServiceEnum();

	}

} //CodeGeneratorModelPackage
