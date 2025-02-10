package jdbcProyecto.models;

import java.util.Objects;

public class Jugador {
	private int id;
	private String nombre;
	private String email;
	private int puntosTotales;

	/**
	 * 
	 */
	public Jugador() {
		super();
	}

	/**
	 * @param nombre
	 * @param email
	 * @param puntosTotales
	 */
	public Jugador(String nombre, String email, int puntosTotales) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.puntosTotales = puntosTotales;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the puntosTotales
	 */
	public int getPuntosTotales() {
		return puntosTotales;
	}

	/**
	 * @param puntosTotales the puntosTotales to set
	 */
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nombre, puntosTotales);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(nombre, other.nombre)
				&& puntosTotales == other.puntosTotales;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", email=" + email + ", puntosTotales=" + puntosTotales
				+ "]";
	}
}