package com.datapar.model;

import com.datapar.shared.enums.TipoServicio;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Servicio {
    @NotBlank(
            message = "Usuario no puede ser vacio"
    )
    private Usuario usuario;
    @NotBlank(
            message = "Auto no puede ser vacio"
    )
    private Auto auto;
    private TipoServicio tipoServicio;
    @NotBlank(
            message = "Auto no puede ser vacio"
    )
    private BigDecimal valorServicio;
    private Date fechaServicio;
    @Min(
            message = "KM inicial no puede ser vacio",
            value = 0L
    )
    private Double kmInicial;
    @Min(
            message = "KM inicial no puede ser vacio",
            value = 0L
    )
    private Double kmFinal;
    private String descripcion;

    Servicio(final Usuario usuario, final Auto auto, final TipoServicio tipoServicio, final BigDecimal valorServicio, final Date fechaServicio, final Double kmInicial, final Double kmFinal, final String descripcion) {
        this.usuario = usuario;
        this.auto = auto;
        this.tipoServicio = tipoServicio;
        this.valorServicio = valorServicio;
        this.fechaServicio = fechaServicio;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.descripcion = descripcion;
    }

    public static Servicio.ServicioBuilder builder() {
        return new Servicio.ServicioBuilder();
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Auto getAuto() {
        return this.auto;
    }

    public TipoServicio getTipoServicio() {
        return this.tipoServicio;
    }

    public BigDecimal getValorServicio() {
        return this.valorServicio;
    }

    public Date getFechaServicio() {
        return this.fechaServicio;
    }

    public Double getKmInicial() {
        return this.kmInicial;
    }

    public Double getKmFinal() {
        return this.kmFinal;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Servicio)) {
            return false;
        } else {
            Servicio other = (Servicio)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label107: {
                    Object this$usuario = this.getUsuario();
                    Object other$usuario = other.getUsuario();
                    if (this$usuario == null) {
                        if (other$usuario == null) {
                            break label107;
                        }
                    } else if (this$usuario.equals(other$usuario)) {
                        break label107;
                    }

                    return false;
                }

                Object this$auto = this.getAuto();
                Object other$auto = other.getAuto();
                if (this$auto == null) {
                    if (other$auto != null) {
                        return false;
                    }
                } else if (!this$auto.equals(other$auto)) {
                    return false;
                }

                Object this$tipoServicio = this.getTipoServicio();
                Object other$tipoServicio = other.getTipoServicio();
                if (this$tipoServicio == null) {
                    if (other$tipoServicio != null) {
                        return false;
                    }
                } else if (!this$tipoServicio.equals(other$tipoServicio)) {
                    return false;
                }

                label86: {
                    Object this$valorServicio = this.getValorServicio();
                    Object other$valorServicio = other.getValorServicio();
                    if (this$valorServicio == null) {
                        if (other$valorServicio == null) {
                            break label86;
                        }
                    } else if (this$valorServicio.equals(other$valorServicio)) {
                        break label86;
                    }

                    return false;
                }

                label79: {
                    Object this$fechaServicio = this.getFechaServicio();
                    Object other$fechaServicio = other.getFechaServicio();
                    if (this$fechaServicio == null) {
                        if (other$fechaServicio == null) {
                            break label79;
                        }
                    } else if (this$fechaServicio.equals(other$fechaServicio)) {
                        break label79;
                    }

                    return false;
                }

                label72: {
                    Object this$kmInicial = this.getKmInicial();
                    Object other$kmInicial = other.getKmInicial();
                    if (this$kmInicial == null) {
                        if (other$kmInicial == null) {
                            break label72;
                        }
                    } else if (this$kmInicial.equals(other$kmInicial)) {
                        break label72;
                    }

                    return false;
                }

                Object this$kmFinal = this.getKmFinal();
                Object other$kmFinal = other.getKmFinal();
                if (this$kmFinal == null) {
                    if (other$kmFinal != null) {
                        return false;
                    }
                } else if (!this$kmFinal.equals(other$kmFinal)) {
                    return false;
                }

                Object this$descripcion = this.getDescripcion();
                Object other$descripcion = other.getDescripcion();
                if (this$descripcion == null) {
                    if (other$descripcion != null) {
                        return false;
                    }
                } else if (!this$descripcion.equals(other$descripcion)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Servicio;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $usuario = this.getUsuario();
        result = result * 59 + ($usuario == null ? 43 : $usuario.hashCode());
        Object $auto = this.getAuto();
        result = result * 59 + ($auto == null ? 43 : $auto.hashCode());
        Object $tipoServicio = this.getTipoServicio();
        result = result * 59 + ($tipoServicio == null ? 43 : $tipoServicio.hashCode());
        Object $valorServicio = this.getValorServicio();
        result = result * 59 + ($valorServicio == null ? 43 : $valorServicio.hashCode());
        Object $fechaServicio = this.getFechaServicio();
        result = result * 59 + ($fechaServicio == null ? 43 : $fechaServicio.hashCode());
        Object $kmInicial = this.getKmInicial();
        result = result * 59 + ($kmInicial == null ? 43 : $kmInicial.hashCode());
        Object $kmFinal = this.getKmFinal();
        result = result * 59 + ($kmFinal == null ? 43 : $kmFinal.hashCode());
        Object $descripcion = this.getDescripcion();
        result = result * 59 + ($descripcion == null ? 43 : $descripcion.hashCode());
        return result;
    }

    public String toString() {
        Usuario var10000 = this.getUsuario();
        return "Servicio(usuario=" + var10000 + ", auto=" + this.getAuto() + ", tipoServicio=" + this.getTipoServicio() + ", valorServicio=" + this.getValorServicio() + ", fechaServicio=" + this.getFechaServicio() + ", kmInicial=" + this.getKmInicial() + ", kmFinal=" + this.getKmFinal() + ", descripcion=" + this.getDescripcion() + ")";
    }

    public static class ServicioBuilder {
        private Usuario usuario;
        private Auto auto;
        private TipoServicio tipoServicio;
        private BigDecimal valorServicio;
        private Date fechaServicio;
        private Double kmInicial;
        private Double kmFinal;
        private String descripcion;

        ServicioBuilder() {
        }

        public Servicio.ServicioBuilder usuario(final Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

        public Servicio.ServicioBuilder auto(final Auto auto) {
            this.auto = auto;
            return this;
        }

        public Servicio.ServicioBuilder tipoServicio(final TipoServicio tipoServicio) {
            this.tipoServicio = tipoServicio;
            return this;
        }

        public Servicio.ServicioBuilder valorServicio(final BigDecimal valorServicio) {
            this.valorServicio = valorServicio;
            return this;
        }

        public Servicio.ServicioBuilder fechaServicio(final Date fechaServicio) {
            this.fechaServicio = fechaServicio;
            return this;
        }

        public Servicio.ServicioBuilder kmInicial(final Double kmInicial) {
            this.kmInicial = kmInicial;
            return this;
        }

        public Servicio.ServicioBuilder kmFinal(final Double kmFinal) {
            this.kmFinal = kmFinal;
            return this;
        }

        public Servicio.ServicioBuilder descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Servicio build() {
            return new Servicio(this.usuario, this.auto, this.tipoServicio, this.valorServicio, this.fechaServicio, this.kmInicial, this.kmFinal, this.descripcion);
        }

        public String toString() {
            return "Servicio.ServicioBuilder(usuario=" + this.usuario + ", auto=" + this.auto + ", tipoServicio=" + this.tipoServicio + ", valorServicio=" + this.valorServicio + ", fechaServicio=" + this.fechaServicio + ", kmInicial=" + this.kmInicial + ", kmFinal=" + this.kmFinal + ", descripcion=" + this.descripcion + ")";
        }
    }
}
