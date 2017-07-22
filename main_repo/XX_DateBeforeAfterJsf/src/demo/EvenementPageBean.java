package demo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@SuppressWarnings("serial")
@ViewScoped
@Named
public class EvenementPageBean implements Serializable
{
	@Getter	@Setter
	@Size(min = 2)
	String libelle;

	@Getter	@Setter
	@NotNull
	LocalDate debut;

	@Getter	@Setter
	@NotNull
	LocalDate fin;
	
	public void save()
	{
		FacesMessage msg = new FacesMessage("Validation OK, les dates sont correctes");
		FacesContext.getCurrentInstance().addMessage("growl", msg);
	}

}
