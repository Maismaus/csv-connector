// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package csv.actions;

import java.io.InputStreamReader;
import java.util.Map.Entry;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IDataType;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import com.mendix.webui.CustomJavaAction;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import csv.impl.CSV;

/**
 * This action will import a CSV.
 */
public class ImportCSV extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __file;
	private system.proxies.FileDocument file;
	private java.lang.String microflow;
	private IMendixObject microflowParameter;
	private java.lang.Boolean useSystemContext;
	private java.lang.String separator;
	private java.lang.String quoteCharacter;
	private java.lang.String escapeCharacter;
	private java.lang.Long skipLines;
	private java.lang.String returnEntity;
	private java.lang.String characterSet;

	public ImportCSV(IContext context, IMendixObject file, java.lang.String microflow, IMendixObject microflowParameter, java.lang.Boolean useSystemContext, java.lang.String separator, java.lang.String quoteCharacter, java.lang.String escapeCharacter, java.lang.Long skipLines, java.lang.String returnEntity, java.lang.String characterSet)
	{
		super(context);
		this.__file = file;
		this.microflow = microflow;
		this.microflowParameter = microflowParameter;
		this.useSystemContext = useSystemContext;
		this.separator = separator;
		this.quoteCharacter = quoteCharacter;
		this.escapeCharacter = escapeCharacter;
		this.skipLines = skipLines;
		this.returnEntity = returnEntity;
		this.characterSet = characterSet;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.file = __file == null ? null : system.proxies.FileDocument.initialize(getContext(), __file);

		// BEGIN USER CODE
		ILogNode logger = CSV.getLogger();
		
		logger.debug("Opening CSV file..");
		
		CSVParserBuilder parserBuilder = new CSVParserBuilder()
				.withSeparator(this.separator == null ? CSVWriter.DEFAULT_SEPARATOR : this.separator.charAt(0))
				.withQuoteChar(this.quoteCharacter == null ? CSVWriter.NO_QUOTE_CHARACTER : this.quoteCharacter.charAt(0))
				.withEscapeChar(this.escapeCharacter == null ? CSVWriter.DEFAULT_ESCAPE_CHARACTER : this.escapeCharacter.charAt(0));
		
		CSVParser parser = parserBuilder.build();
		
		CSVReader reader = new CSVReaderBuilder(
					new InputStreamReader(Core.getFileDocumentContent(getContext(), this.file.getMendixObject()), 
							(this.characterSet != null ? this.characterSet : "UTF-8")
					)
				)
				.withSkipLines((int) skipLines.intValue())
				.withCSVParser(parser)
				.build();
		
		logger.debug("CSV file opened..");
		
		IContext context = getContext();
		if (useSystemContext) {
			context = Core.createSystemContext();
		}
		Object result = null;

		try {
			context.getData().put(CSV.CONTEXT_READER_OBJ, reader);
			if (this.microflowParameter != null) {
				String argument = null;
				for(Entry<String, IDataType> entry : Core.getInputParameters(microflow).entrySet()) {
					IDataType dataType = entry.getValue();
					if (dataType.isMendixObject()) {
						if (dataType.getObjectType().equals(microflowParameter.getType())) {
							argument = entry.getKey();
							break;
						}
 						
						IMetaObject metaObject = Core.getMetaObject(dataType.getObjectType());
						if (microflowParameter.getMetaObject().isSubClassOf(metaObject)) {
							argument = entry.getKey();
							break;
						}
					}
				}
					
				if (argument == null) {
					throw new CoreException("No suitable argument could be found in microflow " + microflow + " for " + microflowParameter.getType());
				}
				result = Core.microflowCall(microflow).withParam(argument, microflowParameter).execute(context);
			} else {
				result = Core.microflowCall(this.microflow).execute(context);
			}
			logger.debug("Sucessfully imported CSV file.");
			
			if (useSystemContext) {
				while (context.isInTransaction())
					context.endTransaction();
			}
			
		} finally {
			logger.debug("Closing CSV file..");
			reader.close();
		}
		
		
		if (result != null && result instanceof IMendixObject) {
			return (IMendixObject) result;
		} else {		
			return null;
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ImportCSV";
	}

	// BEGIN EXTRA CODE

	// END EXTRA CODE
}
