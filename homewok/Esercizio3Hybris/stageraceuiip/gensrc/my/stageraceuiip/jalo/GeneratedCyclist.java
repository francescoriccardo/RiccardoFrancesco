/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 20.03.47                        ---
 * ----------------------------------------------------------------
 */
package my.stageraceuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.stageraceuiip.constants.StageraceuiipConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cyclist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclist extends GenericItem
{
	/** Qualifier of the <code>Cyclist.cf</code> attribute **/
	public static final String CF = "cf";
	/** Qualifier of the <code>Cyclist.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Cyclist.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Cyclist.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Cyclist.sex</code> attribute **/
	public static final String SEX = "sex";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CF, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(SEX, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.cf</code> attribute.
	 * @return the cf
	 */
	public String getCf(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.cf</code> attribute.
	 * @return the cf
	 */
	public String getCf()
	{
		return getCf( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.cf</code> attribute. 
	 * @param value the cf
	 */
	public void setCf(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.cf</code> attribute. 
	 * @param value the cf
	 */
	public void setCf(final String value)
	{
		setCf( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.sex</code> attribute.
	 * @return the sex
	 */
	public EnumerationValue getSex(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.sex</code> attribute.
	 * @return the sex
	 */
	public EnumerationValue getSex()
	{
		return getSex( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.sex</code> attribute. 
	 * @param value the sex
	 */
	public void setSex(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.sex</code> attribute. 
	 * @param value the sex
	 */
	public void setSex(final EnumerationValue value)
	{
		setSex( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
