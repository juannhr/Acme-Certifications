
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Ejemplo extends DomainEntity {

	private String				nombre;
	private Date				fecha;
	private int					numero;
	private float				precio;

	Collection<Announcement>	anuncio;


	@NotBlank
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(final Date fecha) {
		this.fecha = fecha;
	}

	@Range(min = 0, max = 10)
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(final int numero) {
		this.numero = numero;
	}

	@Min(0)
	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(final float precio) {
		this.precio = precio;
	}

	@NotNull
	@OneToMany(mappedBy = "ejemplo")
	public Collection<Announcement> getAnuncio() {
		return this.anuncio;
	}

	public void setAnuncio(final Collection<Announcement> anuncio) {
		this.anuncio = anuncio;
	}

}
