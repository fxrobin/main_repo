package demo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.enterprise.context.Dependent;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@NoArgsConstructor

@ValidEvenement
@Dependent
public class Evenement implements Serializable, Cloneable
{
	@Getter
	@Setter
	@NotNull
	private LocalDate debut;

	@Getter
	@Setter
	@NotNull
	private LocalDate fin;
	
}
