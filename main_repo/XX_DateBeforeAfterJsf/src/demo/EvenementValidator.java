package demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import lombok.extern.apachecommons.CommonsLog;


@CommonsLog
public class EvenementValidator implements ConstraintValidator<ValidEvenement, Evenement>
{

	@Override
	public void initialize(ValidEvenement constraint)
	{
		// rien de spécial.
	}

	@Override
	public boolean isValid(Evenement event, ConstraintValidatorContext ctx)
	{
		log.info("Validation ...");
		if (event == null || event.getDebut() == null || event.getFin() == null)
		{
			log.error("Préconditions non respectées");
			return false;
		}
		else
		{
			log.info("Verification des dates");
			// ici on vérifie bien que le début est avant la fin.
			return event.getDebut().isBefore(event.getFin());
		}
	}

}
