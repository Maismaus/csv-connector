// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package csv.proxies;

public class ExampleEntity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject exampleEntityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CSV.ExampleEntity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		C01Column1("C01Column1"),
		C02Column2("C02Column2"),
		C03Column3("C03Column3");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ExampleEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CSV.ExampleEntity"));
	}

	protected ExampleEntity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject exampleEntityMendixObject)
	{
		if (exampleEntityMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CSV.ExampleEntity", exampleEntityMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CSV.ExampleEntity");

		this.exampleEntityMendixObject = exampleEntityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ExampleEntity.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static csv.proxies.ExampleEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return csv.proxies.ExampleEntity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static csv.proxies.ExampleEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new csv.proxies.ExampleEntity(context, mendixObject);
	}

	public static csv.proxies.ExampleEntity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return csv.proxies.ExampleEntity.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of C01Column1
	 */
	public final java.lang.String getC01Column1()
	{
		return getC01Column1(getContext());
	}

	/**
	 * @param context
	 * @return value of C01Column1
	 */
	public final java.lang.String getC01Column1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.C01Column1.toString());
	}

	/**
	 * Set value of C01Column1
	 * @param c01column1
	 */
	public final void setC01Column1(java.lang.String c01column1)
	{
		setC01Column1(getContext(), c01column1);
	}

	/**
	 * Set value of C01Column1
	 * @param context
	 * @param c01column1
	 */
	public final void setC01Column1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String c01column1)
	{
		getMendixObject().setValue(context, MemberNames.C01Column1.toString(), c01column1);
	}

	/**
	 * @return value of C02Column2
	 */
	public final java.lang.String getC02Column2()
	{
		return getC02Column2(getContext());
	}

	/**
	 * @param context
	 * @return value of C02Column2
	 */
	public final java.lang.String getC02Column2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.C02Column2.toString());
	}

	/**
	 * Set value of C02Column2
	 * @param c02column2
	 */
	public final void setC02Column2(java.lang.String c02column2)
	{
		setC02Column2(getContext(), c02column2);
	}

	/**
	 * Set value of C02Column2
	 * @param context
	 * @param c02column2
	 */
	public final void setC02Column2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String c02column2)
	{
		getMendixObject().setValue(context, MemberNames.C02Column2.toString(), c02column2);
	}

	/**
	 * @return value of C03Column3
	 */
	public final java.lang.String getC03Column3()
	{
		return getC03Column3(getContext());
	}

	/**
	 * @param context
	 * @return value of C03Column3
	 */
	public final java.lang.String getC03Column3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.C03Column3.toString());
	}

	/**
	 * Set value of C03Column3
	 * @param c03column3
	 */
	public final void setC03Column3(java.lang.String c03column3)
	{
		setC03Column3(getContext(), c03column3);
	}

	/**
	 * Set value of C03Column3
	 * @param context
	 * @param c03column3
	 */
	public final void setC03Column3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String c03column3)
	{
		getMendixObject().setValue(context, MemberNames.C03Column3.toString(), c03column3);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return exampleEntityMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final csv.proxies.ExampleEntity that = (csv.proxies.ExampleEntity) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "CSV.ExampleEntity";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
