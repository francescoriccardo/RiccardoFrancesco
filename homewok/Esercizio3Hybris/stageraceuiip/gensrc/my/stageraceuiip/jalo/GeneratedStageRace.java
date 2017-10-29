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
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.stageraceuiip.constants.StageraceuiipConstants;
import my.stageraceuiip.jalo.Stage;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem StageRace}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStageRace extends GenericItem
{
	/** Qualifier of the <code>StageRace.idStageRace</code> attribute **/
	public static final String IDSTAGERACE = "idStageRace";
	/** Qualifier of the <code>StageRace.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>StageRace.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>StageRace.stages</code> attribute **/
	public static final String STAGES = "stages";
	/** Relation ordering override parameter constants for StageRace2StageRelation from ((stageraceuiip))*/
	protected static String STAGERACE2STAGERELATION_SRC_ORDERED = "relation.StageRace2StageRelation.source.ordered";
	protected static String STAGERACE2STAGERELATION_TGT_ORDERED = "relation.StageRace2StageRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for StageRace2StageRelation from ((stageraceuiip))*/
	protected static String STAGERACE2STAGERELATION_MARKMODIFIED = "relation.StageRace2StageRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(IDSTAGERACE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.idStageRace</code> attribute.
	 * @return the idStageRace
	 */
	public String getIdStageRace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IDSTAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.idStageRace</code> attribute.
	 * @return the idStageRace
	 */
	public String getIdStageRace()
	{
		return getIdStageRace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.idStageRace</code> attribute. 
	 * @param value the idStageRace
	 */
	public void setIdStageRace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IDSTAGERACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.idStageRace</code> attribute. 
	 * @param value the idStageRace
	 */
	public void setIdStageRace(final String value)
	{
		setIdStageRace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages(final SessionContext ctx)
	{
		final List<Stage> items = getLinkedItems( 
			ctx,
			true,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			"Stage",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages()
	{
		return getStages( getSession().getSessionContext() );
	}
	
	public long getStagesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			"Stage",
			null
		);
	}
	
	public long getStagesCount()
	{
		return getStagesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final SessionContext ctx, final Collection<Stage> value)
	{
		setLinkedItems( 
			ctx,
			true,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGERACE2STAGERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final Collection<Stage> value)
	{
		setStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final SessionContext ctx, final Stage value)
	{
		addLinkedItems( 
			ctx,
			true,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGERACE2STAGERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final Stage value)
	{
		addToStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final SessionContext ctx, final Stage value)
	{
		removeLinkedItems( 
			ctx,
			true,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGERACE2STAGERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final Stage value)
	{
		removeFromStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute.
	 * @return the year
	 */
	public String getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final String value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
