package mx.utng.sesion29.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Partido {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "equipo_local", referencedColumnName = "id")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante", referencedColumnName = "id")
    private Equipo equipoVisitante;

    private Integer marcadorLocal;

    private Integer marcadorVisitante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Integer getMarcadorLocal() {
        return marcadorLocal;
    }

    public void setMarcadorLocal(Integer marcadorLocal) {
        this.marcadorLocal = marcadorLocal;
    }

    public Integer getMarcadorVisitante() {
        return marcadorVisitante;
    }

    public void setMarcadorVisitante(Integer marcadorVisitante) {
        this.marcadorVisitante = marcadorVisitante;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((equipoLocal == null) ? 0 : equipoLocal.hashCode());
        result = prime * result + ((equipoVisitante == null) ? 0 : equipoVisitante.hashCode());
        result = prime * result + ((marcadorLocal == null) ? 0 : marcadorLocal.hashCode());
        result = prime * result + ((marcadorVisitante == null) ? 0 : marcadorVisitante.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Partido other = (Partido) obj;
        if (id != other.id)
            return false;
        if (equipoLocal == null) {
            if (other.equipoLocal != null)
                return false;
        } else if (!equipoLocal.equals(other.equipoLocal))
            return false;
        if (equipoVisitante == null) {
            if (other.equipoVisitante != null)
                return false;
        } else if (!equipoVisitante.equals(other.equipoVisitante))
            return false;
        if (marcadorLocal == null) {
            if (other.marcadorLocal != null)
                return false;
        } else if (!marcadorLocal.equals(other.marcadorLocal))
            return false;
        if (marcadorVisitante == null) {
            if (other.marcadorVisitante != null)
                return false;
        } else if (!marcadorVisitante.equals(other.marcadorVisitante))
            return false;
        return true;
    }

    
}