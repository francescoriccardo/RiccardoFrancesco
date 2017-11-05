/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 20.37.05                         ---
 * ----------------------------------------------------------------
 */
package my.recoverypatientcore.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.recoverypatientcore.constants.RecoverypatientcoreConstants;
import my.recoverypatientcore.jalo.Person;
import my.recoverypatientcore.jalo.Recovery;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends Person
{
	/** Qualifier of the <code>Patient.recoverys</code> attribute **/
	public static final String RECOVERYS = "recoverys";
	/**
	* {@link OneToManyHandler} for handling 1:n RECOVERYS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Recovery> RECOVERYSHANDLER = new OneToManyHandler<Recovery>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Person.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.recoverys</code> attribute.
	 * @return the recoverys
	 */
	public Collection<Recovery> getRecoverys(final SessionContext ctx)
	{
		return RECOVERYSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.recoverys</code> attribute.
	 * @return the recoverys
	 */
	public Collection<Recovery> getRecoverys()
	{
		return getRecoverys( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.recoverys</code> attribute. 
	 * @param value the recoverys
	 */
	public void setRecoverys(final SessionContext ctx, final Collection<Recovery> value)
	{
		RECOVERYSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.recoverys</code> attribute. 
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
