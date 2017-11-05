/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 20.37.05                         ---
 * ----------------------------------------------------------------
 */
package my.recoverypatientcore.jalo;

import de.hybris.platform.jalo.GenericItem;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.recoverypatientcore.constants.RecoverypatientcoreConstants;
import my.recoverypatientcore.jalo.Department;
import my.recoverypatientcore.jalo.MedicalExamination;
import my.recoverypatientcore.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Recovery}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecovery extends GenericItem
{
	/** Qualifier of the <code>Recovery.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Recovery.beginDate</code> attribute **/
	public static final String BEGINDATE = "beginDate";
	/** Qualifier of the <code>Recovery.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>Recovery.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>Recovery.medicalExaminations</code> attribute **/
	public static final String MEDICALEXAMINATIONS = "medicalExaminations";
	/** Qualifier of the <code>Recovery.patient</code> attribute **/
	public static final String PATIENT = "patient";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRecovery> DEPARTMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedRecovery>(
	RecoverypatientcoreConstants.TC.RECOVERY,
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
	"recovery",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PATIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRecovery> PATIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedRecovery>(
	RecoverypatientcoreConstants.TC.RECOVERY,
	false,
	"patient",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(BEGINDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		tmp.put(PATIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.beginDate</code> attribute.
	 * @return the beginDate
	 */
	public Date getBeginDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BEGINDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.beginDate</code> attribute.
	 * @return the beginDate
	 */
	public Date getBeginDate()
	{
		return getBeginDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.beginDate</code> attribute. 
	 * @param value the beginDate
	 */
	public void setBeginDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BEGINDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.beginDate</code> attribute. 
	 * @param value the beginDate
	 */
	public void setBeginDate(final Date value)
	{
		setBeginDate( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DEPARTMENTHANDLER.newInstance(ctx, allAttributes);
		PATIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.medicalExaminations</code> attribute.
	 * @return the medicalExaminations
	 */
	public Collection<MedicalExamination> getMedicalExaminations(final SessionContext ctx)
	{
		return MEDICALEXAMINATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.medicalExaminations</code> attribute.
	 * @return the medicalExaminations
	 */
	public Collection<MedicalExamination> getMedicalExaminations()
	{
		return getMedicalExaminations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.medicalExaminations</code> attribute. 
	 * @param value the medicalExaminations
	 */
	public void setMedicalExaminations(final SessionContext ctx, final Collection<MedicalExamination> value)
	{
		MEDICALEXAMINATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.medicalExaminations</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Recovery.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient(final SessionContext ctx)
	{
		return (Patient)getProperty( ctx, PATIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recovery.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return getPatient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final SessionContext ctx, final Patient value)
	{
		PATIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recovery.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final Patient value)
	{
		setPatient( getSession().getSessionContext(), value );
	}
	
}
