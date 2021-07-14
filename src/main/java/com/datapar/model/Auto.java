//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.model;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Auto extends Main {
    private final UUID chapa;
    @NotBlank(
            message = "El vehiculo no se puede registrar sin el numero de chasis"
    )
    private final String chassis;

    private final String fabricante;
    private final String modelo;
    @NotBlank(
            message = "Kilometrage no puede ser vacio"
    )
    private final Double kilometraje;
    private final Integer anoModelo;
    private final Integer anoFabricacion;
    private final String descripcion;

    protected Auto(final Auto.AutoBuilder<?, ?> b) {
        super(b);
        this.chapa = b.chapa;
        this.chassis = b.chassis;
        this.fabricante = b.fabricante;
        this.modelo = b.modelo;
        this.kilometraje = b.kilometraje;
        this.anoModelo = b.anoModelo;
        this.anoFabricacion = b.anoFabricacion;
        this.descripcion = b.descripcion;
    }

    public static Auto.AutoBuilder<?, ?> builder() {
        return new Auto.AutoBuilderImpl();
    }

    public UUID getChapa() {
        return this.chapa;
    }

    public String getChassis() {
        return this.chassis;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Double getKilometraje() {
        return this.kilometraje;
    }

    public Integer getAnoModelo() {
        return this.anoModelo;
    }

    public Integer getAnoFabricacion() {
        return this.anoFabricacion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Auto)) {
            return false;
        } else {
            Auto other = (Auto)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label107: {
                    Object this$chapa = this.getChapa();
                    Object other$chapa = other.getChapa();
                    if (this$chapa == null) {
                        if (other$chapa == null) {
                            break label107;
                        }
                    } else if (this$chapa.equals(other$chapa)) {
                        break label107;
                    }

                    return false;
                }

                Object this$chassis = this.getChassis();
                Object other$chassis = other.getChassis();
                if (this$chassis == null) {
                    if (other$chassis != null) {
                        return false;
                    }
                } else if (!this$chassis.equals(other$chassis)) {
                    return false;
                }

                Object this$fabricante = this.getFabricante();
                Object other$fabricante = other.getFabricante();
                if (this$fabricante == null) {
                    if (other$fabricante != null) {
                        return false;
                    }
                } else if (!this$fabricante.equals(other$fabricante)) {
                    return false;
                }

                label86: {
                    Object this$modelo = this.getModelo();
                    Object other$modelo = other.getModelo();
                    if (this$modelo == null) {
                        if (other$modelo == null) {
                            break label86;
                        }
                    } else if (this$modelo.equals(other$modelo)) {
                        break label86;
                    }

                    return false;
                }

                label79: {
                    Object this$kilometraje = this.getKilometraje();
                    Object other$kilometraje = other.getKilometraje();
                    if (this$kilometraje == null) {
                        if (other$kilometraje == null) {
                            break label79;
                        }
                    } else if (this$kilometraje.equals(other$kilometraje)) {
                        break label79;
                    }

                    return false;
                }

                label72: {
                    Object this$anoModelo = this.getAnoModelo();
                    Object other$anoModelo = other.getAnoModelo();
                    if (this$anoModelo == null) {
                        if (other$anoModelo == null) {
                            break label72;
                        }
                    } else if (this$anoModelo.equals(other$anoModelo)) {
                        break label72;
                    }

                    return false;
                }

                Object this$anoFabricacion = this.getAnoFabricacion();
                Object other$anoFabricacion = other.getAnoFabricacion();
                if (this$anoFabricacion == null) {
                    if (other$anoFabricacion != null) {
                        return false;
                    }
                } else if (!this$anoFabricacion.equals(other$anoFabricacion)) {
                    return false;
                }

                Object this$descripcion = this.getDescripcion();
                Object other$descripcion = other.getDescripcion();
                if (this$descripcion == null) {
                    return other$descripcion == null;
                } else return this$descripcion.equals(other$descripcion);
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Auto;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $chapa = this.getChapa();
        result = result * 59 + ($chapa == null ? 43 : $chapa.hashCode());
        Object $chassis = this.getChassis();
        result = result * 59 + ($chassis == null ? 43 : $chassis.hashCode());
        Object $fabricante = this.getFabricante();
        result = result * 59 + ($fabricante == null ? 43 : $fabricante.hashCode());
        Object $modelo = this.getModelo();
        result = result * 59 + ($modelo == null ? 43 : $modelo.hashCode());
        Object $kilometraje = this.getKilometraje();
        result = result * 59 + ($kilometraje == null ? 43 : $kilometraje.hashCode());
        Object $anoModelo = this.getAnoModelo();
        result = result * 59 + ($anoModelo == null ? 43 : $anoModelo.hashCode());
        Object $anoFabricacion = this.getAnoFabricacion();
        result = result * 59 + ($anoFabricacion == null ? 43 : $anoFabricacion.hashCode());
        Object $descripcion = this.getDescripcion();
        result = result * 59 + ($descripcion == null ? 43 : $descripcion.hashCode());
        return result;
    }

    public String toString() {
        UUID var10000 = this.getChapa();
        return "Auto(chapa=" + var10000 + ", chassis=" + this.getChassis() + ", fabricante=" + this.getFabricante() + ", modelo=" + this.getModelo() + ", kilometraje=" + this.getKilometraje() + ", anoModelo=" + this.getAnoModelo() + ", anoFabricacion=" + this.getAnoFabricacion() + ", descripcion=" + this.getDescripcion() + ")";
    }

    @Override
    public void setchapa(UUID chapa) {

    }

    @Override
    public Object getLogin() {
        return null;
    }

    private static final class AutoBuilderImpl extends Auto.AutoBuilder<Auto, Auto.AutoBuilderImpl> {
        private AutoBuilderImpl() {
        }

        protected Auto.AutoBuilderImpl self() {
            return this;
        }

        public Auto build() {
            return new Auto(this);
        }
    }

    public abstract static class AutoBuilder<C extends Auto, B extends Auto.AutoBuilder<C, B>> extends MainBuilder<C, B> {
        private UUID chapa;
        private String chassis;
        private String fabricante;
        private String modelo;
        private @NotBlank(
                message = "Kilometrage no puede ser vacio"
        ) Double kilometraje;
        private Integer anoModelo;
        private Integer anoFabricacion;
        private String descripcion;

        public AutoBuilder() {
        }

        protected abstract B self();

        public abstract C build();

        public B chapa(final UUID chapa) {
            this.chapa = chapa;
            return this.self();
        }

        public B chassis(final String chassis) {
            this.chassis = chassis;
            return this.self();
        }

        public B fabricante(final String fabricante) {
            this.fabricante = fabricante;
            return this.self();
        }

        public B modelo(final String modelo) {
            this.modelo = modelo;
            return this.self();
        }

        public B kilometraje(final double kilometraje) {
            this.kilometraje = kilometraje;
            return this.self();
        }

        public B anoModelo(final int anoModelo) {
            this.anoModelo = anoModelo;
            return this.self();
        }

        public B anoFabricacion(final int anoFabricacion) {
            this.anoFabricacion = anoFabricacion;
            return this.self();
        }

        public B descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this.self();
        }

        public String toString() {
            String var10000 = super.toString();
            return "Auto.AutoBuilder(super=" + var10000 + ", chapa=" + this.chapa + ", chassis=" + this.chassis + ", fabricante=" + this.fabricante + ", modelo=" + this.modelo + ", kilometraje=" + this.kilometraje + ", anoModelo=" + this.anoModelo + ", anoFabricacion=" + this.anoFabricacion + ", descripcion=" + this.descripcion + ")";
        }
    }
}
