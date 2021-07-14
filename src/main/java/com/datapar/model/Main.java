//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.model;

import com.datapar.shared.enums.Situacion;
import com.datapar.shared.enums.TipoServicio;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.json.bind.annotation.JsonbDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Main
    {
    @JsonProperty(
                    access = Access.READ_ONLY
    )

    private UUID chapa;
        @JsonProperty(
                access = Access.READ_ONLY
        )

    private UUID id;
    @JsonProperty(
            access = Access.READ_ONLY
    )

    @JsonbDateFormat("dd/MM/yyyy HH:mm:ss ")
    private Date fechaCreacion = new Date();
    @JsonProperty(
            access = Access.READ_ONLY
    )
    @JsonbDateFormat("dd/MM/yyyy HH:mm:ss ")
    private Date fechaAlteracion = new Date();
    @JsonProperty(
            access = Access.READ_ONLY
    )
    private Situacion situacion;

    protected Main(final Main.MainBuilder<?, ?> b) {
        this.id = b.id;
        this.fechaCreacion = b.fechaCreacion;
        this.fechaAlteracion = b.fechaAlteracion;
        this.situacion = b.situacion;
    }

    //AUTO
    public UUID getChapa() {
            return this.chapa;
        }


        

    public UUID getId() {
        return this.id;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public Date getFechaAlteracion() {
        return this.fechaAlteracion;
    }

    public Situacion getSituacion() {
        return this.situacion;
    }

    @JsonProperty(
            access = Access.READ_ONLY
    )
    public void setId(final UUID id) {
        this.id = id;
    }

    @JsonProperty(
            access = Access.READ_ONLY
    )
    public void setFechaCreacion(final Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @JsonProperty(
            access = Access.READ_ONLY
    )
    public void setFechaAlteracion(final Date fechaAlteracion) {
        this.fechaAlteracion = fechaAlteracion;
    }

    @JsonProperty(
            access = Access.READ_ONLY
    )
    public void setSituacion(final Situacion situacion) {
        this.situacion = situacion;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Main)) {
            return false;
        } else {
            Main other = (Main)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label59;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label59;
                    }

                    return false;
                }

                Object this$fechaCreacion = this.getFechaCreacion();
                Object other$fechaCreacion = other.getFechaCreacion();
                if (this$fechaCreacion == null) {
                    if (other$fechaCreacion != null) {
                        return false;
                    }
                } else if (!this$fechaCreacion.equals(other$fechaCreacion)) {
                    return false;
                }

                Object this$fechaAlteracion = this.getFechaAlteracion();
                Object other$fechaAlteracion = other.getFechaAlteracion();
                if (this$fechaAlteracion == null) {
                    if (other$fechaAlteracion != null) {
                        return false;
                    }
                } else if (!this$fechaAlteracion.equals(other$fechaAlteracion)) {
                    return false;
                }

                Object this$situacion = this.getSituacion();
                Object other$situacion = other.getSituacion();
                if (this$situacion == null) {
                    if (other$situacion != null) {
                        return false;
                    }
                } else if (!this$situacion.equals(other$situacion)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Main;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $fechaCreacion = this.getFechaCreacion();
        result = result * 59 + ($fechaCreacion == null ? 43 : $fechaCreacion.hashCode());
        Object $fechaAlteracion = this.getFechaAlteracion();
        result = result * 59 + ($fechaAlteracion == null ? 43 : $fechaAlteracion.hashCode());
        Object $situacion = this.getSituacion();
        result = result * 59 + ($situacion == null ? 43 : $situacion.hashCode());
        return result;
    }

    public String toString() {
        UUID var10000 = this.getId();
        return "Main(id=" + var10000 + ", fechaCreacion=" + this.getFechaCreacion() + ", fechaAlteracion=" + this.getFechaAlteracion() + ", situacion=" + this.getSituacion() + ")";
    }

    public Main(final UUID id, final Date fechaCreacion, final Date fechaAlteracion, final Situacion situacion) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaAlteracion = fechaAlteracion;
        this.situacion = situacion;
    }

    public Main() {
    }

        public abstract void setchapa(UUID chapa);

        public abstract Object getLogin();

        public void setChapa(UUID chapa) {
            this.chapa = chapa;
        }

        public abstract static class MainBuilder<C extends Main, B extends Main.MainBuilder<C, B>> {
        private UUID id;
        private Date fechaCreacion;
        private Date fechaAlteracion;
        private Situacion situacion;
        private TipoServicio tipoServicio;

            public MainBuilder() {
        }

        protected abstract B self();

        public abstract C build();

        @JsonProperty(
                access = Access.READ_ONLY
        )
        public B id(final UUID id) {
            this.id = id;
            return this.self();
        }

        @JsonProperty(
                access = Access.READ_ONLY
        )
        public B fechaCreacion(final Date fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
            return this.self();
        }

        @JsonProperty(
                access = Access.READ_ONLY
        )
        public B fechaAlteracion(final Date fechaAlteracion) {
            this.fechaAlteracion = fechaAlteracion;
            return this.self();
        }

        @JsonProperty(
                access = Access.READ_ONLY
        )
        public B situacion(final Situacion situacion) {
            this.situacion = situacion;
            return this.self();
        }

            public B tipoServicio(final TipoServicio tipoServicio) {
                this.tipoServicio = tipoServicio;
                return this.self();
            }

        public String toString() {
            return "Main.MainBuilder(id=" + this.id + ", fechaCreacion=" + this.fechaCreacion + ", fechaAlteracion=" + this.fechaAlteracion + ", situacion=" + this.situacion + ")";
        }
    }
}
