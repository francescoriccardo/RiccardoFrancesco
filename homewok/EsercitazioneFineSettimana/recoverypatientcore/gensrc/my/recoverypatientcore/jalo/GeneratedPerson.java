/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 20.37.05                         ---
 * ----------------------------------------------------------------
 */
package my.recoverypatientcore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.recoverypatientcore.constants.RecoverypatientcoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Person}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPerson extends GenericItem
{
	/** Qualifier of the <code>Person.fiscalCode</code> attribute **/
	public static final String FISCALCODE = "fiscalCode";
	/** Qualifier of the <code>Person.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Person.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Person.birthDate</code> attribute **/
	public static final String BIRTHDATE = "birthDate";
	/** Qualifier of the <code>Person.birtplace</code> attribute **/
	public static final String BIRTPLACE = "birtplace";
	/** Qualifier of the <code>Person.sex</code> attribute **/
	public static final String SEX = "sex";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FISCALCODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(BIRTHDATE, AttributeMode.INITIAL);
		tmp.put(BIRTPLACE, AttributeMode.INITIAL);
		tmp.put(SEX, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate()
	{
		return getBirthDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final Date value)
	{
		setBirthDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.birtplace</code> attribute.
	 * @return the birtplace
	 */
	public String getBirtplace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BIRTPLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.birtplace</code> attribute.
	 * @return the birtplace
	 */
	public String getBirtplace()
	{
		return getBirtplace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.birtplace</code> attribute. 
	 * @param value the birtplace
	 */
	public void setBirtplace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BIRTPLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.birtplace</code> attribute. 
	 * @param value the birtplace
	 */
	public void setBirtplace(final String value)
	{
		setBirtplace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.fiscalCode</code> attribute.
	 * @return the fiscalCode
	 */
	public String getFiscalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FISCALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.fiscalCode</code> attribute.
	 * @return the fiscalCode
	 */
	public String getFiscalCode()
	{
		return getFiscalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.fiscalCode</code> attribute. 
	 * @param value the fiscalCode
	 */
	public void setFiscalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FISCALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.fiscalCode</code> attribute. 
	 * @param value the fiscalCode
	 */
	public void setFiscalCode(final String value)
	{
		setFiscalCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.sex</code> attribute.
	 * @return the sex
	 */
	public EnumerationValue getSex(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.sex</code> attribute.
	 * @return the sex
	 */
	public EnumerationValue getSex()
	{
		return getSex( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.sex</code> attribute. 
	 * @param value the sex
	 */
	public void setSex(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.sex</code> attribute. 
	 * @param value the sex
	 */
	public void setSex(final EnumerationValue value)
	{
		setSex( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Person.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Person.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
