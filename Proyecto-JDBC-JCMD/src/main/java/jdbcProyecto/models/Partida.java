package jdbcProyecto.models;

import java.util.Date;
import java.util.Objects;

public class Partida {
	private int id;
	private Jugador narradorId;
	private Date fecha;

	private enum resultado {
		TODOS, NADIE, ALGUNOS
	}

	/**
	 * 
	 */
	public Partida() {
		super();
	}

	/**
	 * @param narradorId
	 * @param fecha
	 */
	public Partida(Jugador narradorId, Date fecha) {
		super();
		this.narradorId = narradorId;
		this.fecha = fecha;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the narradorId
	 */
	public Jugador getNarradorId() {
		return narradorId;
	}

	/**
	 * @param narradorId the narradorId to set
	 */
	public void setNarradorId(Jugador narradorId) {
		this.narradorId = narradorId;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, id, narradorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partida other = (Partida) obj;
		return Objects.equals(fecha, other.fecha) && id == other.id && Objects.equals(narradorId, other.narradorId);
	}

	@Override
	public String toString() {
		return "Partida [id=" + id + ", narradorId=" + narradorId + ", fecha=" + fecha + "]";
	}
}