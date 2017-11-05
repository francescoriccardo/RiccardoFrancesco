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
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.recoverypatientcore.constants.RecoverypatientcoreConstants;
import my.recoverypatientcore.jalo.Medical;
import my.recoverypatientcore.jalo.Recovery;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MedicalExamination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMedicalExamination extends GenericItem
{
	/** Qualifier of the <code>MedicalExamination.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>MedicalExamination.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>MedicalExamination.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MedicalExamination.result</code> attribute **/
	public static final String RESULT = "result";
	/** Qualifier of the <code>MedicalExamination.medical</code> attribute **/
	public static final String MEDICAL = "medical";
	/** Qualifier of the <code>MedicalExamination.recovery</code> attribute **/
	public static final String RECOVERY = "recovery";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MEDICAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMedicalExamination> MEDICALHANDLER = new BidirectionalOneToManyHandler<GeneratedMedicalExamination>(
	RecoverypatientcoreConstants.TC.MEDICALEXAMINATION,
	false,
	"medical",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECOVERY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMedicalExamination> RECOVERYHANDLER = new BidirectionalOneToManyHandler<GeneratedMedicalExamination>(
	RecoverypatientcoreConstants.TC.MEDICALEXAMINATION,
	false,
	"recovery",
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
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(RESULT, AttributeMode.INITIAL);
		tmp.put(MEDICAL, AttributeMode.INITIAL);
		tmp.put(RECOVERY, AttributeMode.INITIAL);
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
		MEDICALHANDLER.newInstance(ctx, allAttributes);
		RECOVERYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.medical</code> attribute.
	 * @return the medical
	 */
	public Medical getMedical(final SessionContext ctx)
	{
		return (Medical)getProperty( ctx, MEDICAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.medical</code> attribute.
	 * @return the medical
	 */
	public Medical getMedical()
	{
		return getMedical( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.medical</code> attribute. 
	 * @param value the medical
	 */
	public void setMedical(final SessionContext ctx, final Medical value)
	{
		MEDICALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.medical</code> attribute. 
	 * @param value the medical
	 */
	public void setMedical(final Medical value)
	{
		setMedical( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.recovery</code> attribute.
	 * @return the recovery
	 */
	public Recovery getRecovery(final SessionContext ctx)
	{
		return (Recovery)getProperty( ctx, RECOVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.recovery</code> attribute.
	 * @return the recovery
	 */
	public Recovery getRecovery()
	{
		return getRecovery( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.recovery</code> attribute. 
	 * @param value the recovery
	 */
	public void setRecovery(final SessionContext ctx, final Recovery value)
	{
		RECOVERYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.recovery</code> attribute. 
	 * @param value the recovery
	 */
	public void setRecovery(final Recovery value)
	{
		setRecovery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.result</code> attribute.
	 * @return the result
	 */
	public String getResult(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RESULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MedicalExamination.result</code> attribute.
	 * @return the result
	 */
	public String getResult()
	{
		return getResult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RESULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MedicalExamination.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final String value)
	{
		setResult( getSession().getSessionContext(), value );
	}
	
}
