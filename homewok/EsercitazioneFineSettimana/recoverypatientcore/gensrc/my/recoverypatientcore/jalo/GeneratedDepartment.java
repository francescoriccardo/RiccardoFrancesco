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
import java.util.HashMap;
import java.util.Map;
import my.recoverypatientcore.constants.RecoverypatientcoreConstants;
import my.recoverypatientcore.jalo.Hospital;
import my.recoverypatientcore.jalo.Medical;
import my.recoverypatientcore.jalo.Recovery;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Department}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDepartment extends GenericItem
{
	/** Qualifier of the <code>Department.departmentName</code> attribute **/
	public static final String DEPARTMENTNAME = "departmentName";
	/** Qualifier of the <code>Department.hospital</code> attribute **/
	public static final String HOSPITAL = "hospital";
	/** Qualifier of the <code>Department.medicals</code> attribute **/
	public static final String MEDICALS = "medicals";
	/** Qualifier of the <code>Department.recoverys</code> attribute **/
	public static final String RECOVERYS = "recoverys";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOSPITAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDepartment> HOSPITALHANDLER = new BidirectionalOneToManyHandler<GeneratedDepartment>(
	RecoverypatientcoreConstants.TC.DEPARTMENT,
	false,
	"hospital",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDICALS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Medical> MEDICALSHANDLER = new OneToManyHandler<Medical>(
	RecoverypatientcoreConstants.TC.MEDICAL,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RECOVERYS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Recovery> RECOVERYSHANDLER = new OneToManyHandler<Recovery>(
	RecoverypatientcoreConstants.TC.RECOVERY,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEPARTMENTNAME, AttributeMode.INITIAL);
		tmp.put(HOSPITAL, AttributeMode.INITIAL);
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
		HOSPITALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.departmentName</code> attribute.
	 * @return the departmentName
	 */
	public String getDepartmentName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPARTMENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.departmentName</code> attribute.
	 * @return the departmentName
	 */
	public String getDepartmentName()
	{
		return getDepartmentName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.departmentName</code> attribute. 
	 * @param value the departmentName
	 */
	public void setDepartmentName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPARTMENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.departmentName</code> attribute. 
	 * @param value the departmentName
	 */
	public void setDepartmentName(final String value)
	{
		setDepartmentName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.hospital</code> attribute.
	 * @return the hospital
	 */
	public Hospital getHospital(final SessionContext ctx)
	{
		return (Hospital)getProperty( ctx, HOSPITAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.hospital</code> attribute.
	 * @return the hospital
	 */
	public Hospital getHospital()
	{
		return getHospital( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.hospital</code> attribute. 
	 * @param value the hospital
	 */
	public void setHospital(final SessionContext ctx, final Hospital value)
	{
		HOSPITALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.hospital</code> attribute. 
	 * @param value the hospital
	 */
	public void setHospital(final Hospital value)
	{
		setHospital( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.medicals</code> attribute.
	 * @return the medicals
	 */
	public Collection<Medical> getMedicals(final SessionContext ctx)
	{
		return MEDICALSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.medicals</code> attribute.
	 * @return the medicals
	 */
	public Collection<Medical> getMedicals()
	{
		return getMedicals( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.medicals</code> attribute. 
	 * @param value the medicals
	 */
	public void setMedicals(final SessionContext ctx, final Collection<Medical> value)
	{
		MEDICALSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.medicals</code> attribute. 
	 * @param value the medicals
	 */
	public void setMedicals(final Collection<Medical> value)
	{
		setMedicals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medicals. 
	 * @param value the item to add to medicals
	 */
	public void addToMedicals(final SessionContext ctx, final Medical value)
	{
		MEDICALSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medicals. 
	 * @param value the item to add to medicals
	 */
	public void addToMedicals(final Medical value)
	{
		addToMedicals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medicals. 
	 * @param value the item to remove from medicals
	 */
	public void removeFromMedicals(final SessionContext ctx, final Medical value)
	{
		MEDICALSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medicals. 
	 * @param value the item to remove from medicals
	 */
	public void removeFromMedicals(final Medical value)
	{
		removeFromMedicals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.recoverys</code> attribute.
	 * @return the recoverys
	 */
	public Collection<Recovery> getRecoverys(final SessionContext ctx)
	{
		return RECOVERYSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.recoverys</code> attribute.
	 * @return the recoverys
	 */
	public Collection<Recovery> getRecoverys()
	{
		return getRecoverys( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.recoverys</code> attribute. 
	 * @param value the recoverys
	 */
	public void setRecoverys(final SessionContext ctx, final Collection<Recovery> value)
	{
		RECOVERYSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.recoverys</code> attribute. 
	 * @param value the recoverys
	 */
	public void setRecoverys(final Collection<Recovery> value)
	{
		setRecoverys( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recoverys. 
	 * @param value the item to add to recoverys
	 */
	public void addToRecoverys(final SessionContext ctx, final Recovery value)
	{
		RECOVERYSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recoverys. 
	 * @param value the item to add to recoverys
	 */
	public void addToRecoverys(final Recovery value)
	{
		addToRecoverys( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recoverys. 
	 * @param value the item to remove from recoverys
	 */
	public void removeFromRecoverys(final SessionContext ctx, final Recovery value)
	{
		RECOVERYSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recoverys. 
	 * @param value the item to remove from recoverys
	 */
	public void removeFromRecoverys(final Recovery value)
	{
		removeFromRecoverys( getSession().getSessionContext(), value );
	}
	
}
