package demo;

import java.io.Serializable;

import static org.omnifaces.util.Faces.isValidationFailed;
import static org.omnifaces.util.Messages.addGlobalInfo;
import static org.omnifaces.util.Messages.addGlobalWarn;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")

@NoArgsConstructor
@ViewScoped
@Named

// 3 - annotation placée
public class EvenementPageBean implements Serializable
{
	@Getter
	@Setter
	@Size(min = 2)
	String libelle;

	@Getter
	@Setter	
	@Inject
    Evenement event;
	

	public void save()
	{		
			addGlobalInfo("Validation Ok.");
	}

}
