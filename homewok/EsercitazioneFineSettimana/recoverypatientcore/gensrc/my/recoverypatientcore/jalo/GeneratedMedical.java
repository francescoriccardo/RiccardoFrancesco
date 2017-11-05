/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 20.37.05                         ---
 * ----------------------------------------------------------------
 */
package my.recoverypatientcore.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.recoverypatientcore.constants.RecoverypatientcoreConstants;
import my.recoverypatientcore.jalo.Department;
import my.recoverypatientcore.jalo.MedicalExamination;
import my.recoverypatientcore.jalo.Person;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Medical}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMedical extends Person
{
	/** Qualifier of the <code>Medical.medicalNumber</code> attribute **/
	public static final String MEDICALNUMBER = "medicalNumber";
	/** Qualifier of the <code>Medical.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>Medical.medicalExaminations</code> attribute **/
	public static final String MEDICALEXAMINATIONS = "medicalExaminations";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMedical> DEPARTMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedMedical>(
	RecoverypatientcoreConstants.TC.MEDICAL,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDICALEXAMINATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MedicalExamination> MEDICALEXAMINATIONSHANDLER = new OneToManyHandler<MedicalExamination>(
	RecoverypatientcoreConstants.TC.MEDICALEXAMINATION,
	false,
	"medical",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Person.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MEDICALNUMBER, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DEPARTMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.medicalExaminations</code> attribute.
	 * @return the medicalExaminations
	 */
	public Collection<MedicalExamination> getMedicalExaminations(final SessionContext ctx)
	{
		return MEDICALEXAMINATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.medicalExaminations</code> attribute.
	 * @return the medicalExaminations
	 */
	public Collection<MedicalExamination> getMedicalExaminations()
	{
		return getMedicalExaminations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.medicalExaminations</code> attribute. 
	 * @param value the medicalExaminations
	 */
	public void setMedicalExaminations(final SessionContext ctx, final Collection<MedicalExamination> value)
	{
		MEDICALEXAMINATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.medicalExaminations</code> attribute. 
	 * @param value the medicalExaminations
	 */
	public void setMedicalExaminations(final Collection<MedicalExamination> value)
	{
		setMedicalExaminations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medicalExaminations. 
	 * @param value the item to add to medicalExaminations
	 */
	public void addToMedicalExaminations(final SessionContext ctx, final MedicalExamination value)
	{
		MEDICALEXAMINATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medicalExaminations. 
	 * @param value the item to add to medicalExaminations
	 */
	public void addToMedicalExaminations(final MedicalExamination value)
	{
		addToMedicalExaminations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medicalExaminations. 
	 * @param value the item to remove from medicalExaminations
	 */
	public void removeFromMedicalExaminations(final SessionContext ctx, final MedicalExamination value)
	{
		MEDICALEXAMINATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medicalExaminations. 
	 * @param value the item to remove from medicalExaminations
	 */
	public void removeFromMedicalExaminations(final MedicalExamination value)
	{
		removeFromMedicalExaminations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.medicalNumber</code> attribute.
	 * @return the medicalNumber
	 */
	public String getMedicalNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEDICALNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.medicalNumber</code> attribute.
	 * @return the medicalNumber
	 */
	public String getMedicalNumber()
	{
		return getMedicalNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.medicalNumber</code> attribute. 
	 * @param value the medicalNumber
	 */
	public void setMedicalNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEDICALNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.medicalNumber</code> attribute. 
	 * @param value the medicalNumber
	 */
	public void setMedicalNumber(final String value)
	{
		setMedicalNumber( getSession().getSessionContext(), value );
	}
	
}
