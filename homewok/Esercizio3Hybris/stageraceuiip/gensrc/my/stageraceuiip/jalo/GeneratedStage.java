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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.stageraceuiip.constants.StageraceuiipConstants;
import my.stageraceuiip.jalo.StageRace;
import my.stageraceuiip.jalo.StageRanKing;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStage extends GenericItem
{
	/** Qualifier of the <code>Stage.stageName</code> attribute **/
	public static final String STAGENAME = "stageName";
	/** Qualifier of the <code>Stage.start</code> attribute **/
	public static final String START = "start";
	/** Qualifier of the <code>Stage.finish</code> attribute **/
	public static final String FINISH = "finish";
	/** Qualifier of the <code>Stage.distance</code> attribute **/
	public static final String DISTANCE = "distance";
	/** Qualifier of the <code>Stage.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Stage.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Stage.stagerankings</code> attribute **/
	public static final String STAGERANKINGS = "stagerankings";
	/** Qualifier of the <code>Stage.stageraces</code> attribute **/
	public static final String STAGERACES = "stageraces";
	/** Relation ordering override parameter constants for StageRace2StageRelation from ((stageraceuiip))*/
	protected static String STAGERACE2STAGERELATION_SRC_ORDERED = "relation.StageRace2StageRelation.source.ordered";
	protected static String STAGERACE2STAGERELATION_TGT_ORDERED = "relation.StageRace2StageRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for StageRace2StageRelation from ((stageraceuiip))*/
	protected static String STAGERACE2STAGERELATION_MARKMODIFIED = "relation.StageRace2StageRelation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGERANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanKing> STAGERANKINGSHANDLER = new OneToManyHandler<StageRanKing>(
	StageraceuiipConstants.TC.STAGERANKING,
	false,
	"stage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STAGENAME, AttributeMode.INITIAL);
		tmp.put(START, AttributeMode.INITIAL);
		tmp.put(FINISH, AttributeMode.INITIAL);
		tmp.put(DISTANCE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.distance</code> attribute.
	 * @return the distance
	 */
	public Integer getDistance(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DISTANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.distance</code> attribute.
	 * @return the distance
	 */
	public Integer getDistance()
	{
		return getDistance( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.distance</code> attribute. 
	 * @return the distance
	 */
	public int getDistanceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDistance( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.distance</code> attribute. 
	 * @return the distance
	 */
	public int getDistanceAsPrimitive()
	{
		return getDistanceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.distance</code> attribute. 
	 * @param value the distance
	 */
	public void setDistance(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DISTANCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.distance</code> attribute. 
	 * @param value the distance
	 */
	public void setDistance(final Integer value)
	{
		setDistance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.distance</code> attribute. 
	 * @param value the distance
	 */
	public void setDistance(final SessionContext ctx, final int value)
	{
		setDistance( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.distance</code> attribute. 
	 * @param value the distance
	 */
	public void setDistance(final int value)
	{
		setDistance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.finish</code> attribute.
	 * @return the finish
	 */
	public String getFinish(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FINISH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.finish</code> attribute.
	 * @return the finish
	 */
	public String getFinish()
	{
		return getFinish( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.finish</code> attribute. 
	 * @param value the finish
	 */
	public void setFinish(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FINISH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.finish</code> attribute. 
	 * @param value the finish
	 */
	public void setFinish(final String value)
	{
		setFinish( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageName</code> attribute.
	 * @return the stageName
	 */
	public String getStageName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STAGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageName</code> attribute.
	 * @return the stageName
	 */
	public String getStageName()
	{
		return getStageName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageName</code> attribute. 
	 * @param value the stageName
	 */
	public void setStageName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STAGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageName</code> attribute. 
	 * @param value the stageName
	 */
	public void setStageName(final String value)
	{
		setStageName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageraces</code> attribute.
	 * @return the stageraces
	 */
	public Collection<StageRace> getStageraces(final SessionContext ctx)
	{
		final List<StageRace> items = getLinkedItems( 
			ctx,
			false,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			"StageRace",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageraces</code> attribute.
	 * @return the stageraces
	 */
	public Collection<StageRace> getStageraces()
	{
		return getStageraces( getSession().getSessionContext() );
	}
	
	public long getStageracesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			"StageRace",
			null
		);
	}
	
	public long getStageracesCount()
	{
		return getStageracesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageraces</code> attribute. 
	 * @param value the stageraces
	 */
	public void setStageraces(final SessionContext ctx, final Collection<StageRace> value)
	{
		setLinkedItems( 
			ctx,
			false,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGERACE2STAGERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageraces</code> attribute. 
	 * @param value the stageraces
	 */
	public void setStageraces(final Collection<StageRace> value)
	{
		setStageraces( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stageraces. 
	 * @param value the item to add to stageraces
	 */
	public void addToStageraces(final SessionContext ctx, final StageRace value)
	{
		addLinkedItems( 
			ctx,
			false,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGERACE2STAGERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stageraces. 
	 * @param value the item to add to stageraces
	 */
	public void addToStageraces(final StageRace value)
	{
		addToStageraces( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stageraces. 
	 * @param value the item to remove from stageraces
	 */
	public void removeFromStageraces(final SessionContext ctx, final StageRace value)
	{
		removeLinkedItems( 
			ctx,
			false,
			StageraceuiipConstants.Relations.STAGERACE2STAGERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGERACE2STAGERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stageraces. 
	 * @param value the item to remove from stageraces
	 */
	public void removeFromStageraces(final StageRace value)
	{
		removeFromStageraces( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerankings</code> attribute.
	 * @return the stagerankings
	 */
	public Collection<StageRanKing> getStagerankings(final SessionContext ctx)
	{
		return STAGERANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerankings</code> attribute.
	 * @return the stagerankings
	 */
	public Collection<StageRanKing> getStagerankings()
	{
		return getStagerankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerankings</code> attribute. 
	 * @param value the stagerankings
	 */
	public void setStagerankings(final SessionContext ctx, final Collection<StageRanKing> value)
	{
		STAGERANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerankings</code> attribute. 
	 * @param value the stagerankings
	 */
	public void setStagerankings(final Collection<StageRanKing> value)
	{
		setStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagerankings. 
	 * @param value the item to add to stagerankings
	 */
	public void addToStagerankings(final SessionContext ctx, final StageRanKing value)
	{
		STAGERANKINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagerankings. 
	 * @param value the item to add to stagerankings
	 */
	public void addToStagerankings(final StageRanKing value)
	{
		addToStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagerankings. 
	 * @param value the item to remove from stagerankings
	 */
	public void removeFromStagerankings(final SessionContext ctx, final StageRanKing value)
	{
		STAGERANKINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagerankings. 
	 * @param value the item to remove from stagerankings
	 */
	public void removeFromStagerankings(final StageRanKing value)
	{
		removeFromStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.start</code> attribute.
	 * @return the start
	 */
	public String getStart(final SessionContext ctx)
	{
		return (String)getProperty( ctx, START);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.start</code> attribute.
	 * @return the start
	 */
	public String getStart()
	{
		return getStart( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.start</code> attribute. 
	 * @param value the start
	 */
	public void setStart(final SessionContext ctx, final String value)
	{
		setProperty(ctx, START,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.start</code> attribute. 
	 * @param value the start
	 */
	public void setStart(final String value)
	{
		setStart( getSession().getSessionContext(), value );
	}
	
}
