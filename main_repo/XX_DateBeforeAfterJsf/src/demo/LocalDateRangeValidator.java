package demo;

import java.time.LocalDate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * valifdator JSF pour comparer 2 LocalDate dont l'une doit être postérieure à l'autre.
 *  
 * 
 * @author CDT RBN
 *
 */

@FacesValidator("localDateRangeValidator")
public class LocalDateRangeValidator implements Validator
{
	public static final String ATTRIBUTE_NAME = "startDate";

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException
	{
		Object startDateValue = component.getAttributes().get(ATTRIBUTE_NAME);		
		if (value != null && startDateValue != null )
		{
			LocalDate startDate = (LocalDate) startDateValue;
			LocalDate endDate = (LocalDate) value;

			if (endDate.isBefore(startDate))
			{
				String message = String.format("La date doit être postérieure à %s", startDate);
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Date incompatible",message));
			}
		}
	}
}