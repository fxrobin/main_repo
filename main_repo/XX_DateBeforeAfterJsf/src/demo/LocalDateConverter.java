package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * convertisseur LocalDate / Date JSF. Chopé sur StackOverflow :
 * https://stackoverflow.com/questions/30395398/fconvertdatetime-support-for-java8-localdate-localdatetime
 * 
 * @author CDT RBN
 *
 */

@FacesConverter(forClass = java.time.LocalDate.class)
public class LocalDateConverter implements Converter
{
	private static final String PATTERN = "dd/MM/yy";

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value)
	{
		return LocalDate.parse(value, DateTimeFormatter.ofPattern(PATTERN));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value)
	{
		LocalDate dateValue = (LocalDate) value;
		return dateValue.format(DateTimeFormatter.ofPattern(PATTERN));
	}
}
