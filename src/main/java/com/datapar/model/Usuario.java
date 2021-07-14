//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.model;

import com.datapar.shared.enums.TipoUsuario;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Usuario extends Main {
    @NotNull(
            message = "El nombre no puede ser nulo"
    )
    private String nombre;
    @NotBlank(
            message = "Login no puede ser vacio"
    )
    private String login;
    @NotBlank(
            message = "Contraseña no puede ser vacio"
    )
    private String contrasena;
    @NotNull(
            message = "Tipo Usuario no puede ser vacio"
    )
    private TipoUsuario tipoUsuario;

    protected Usuario(final Usuario.UsuarioBuilder<?, ?> b) {
        super(b);
        this.nombre = b.nombre;
        this.login = b.login;
        this.contrasena = b.contrasena;
        this.tipoUsuario = b.tipoUsuario;
    }

    public static Usuario.UsuarioBuilder<?, ?> builder() {
        return new Usuario.UsuarioBuilderImpl();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getLogin() {
        return this.login;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Usuario)) {
            return false;
        } else {
            Usuario other = (Usuario)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$nombre = this.getNombre();
                    Object other$nombre = other.getNombre();
                    if (this$nombre == null) {
                        if (other$nombre == null) {
                            break label59;
                        }
                    } else if (this$nombre.equals(other$nombre)) {
                        break label59;
                    }

                    return false;
                }

                Object this$login = this.getLogin();
                Object other$login = other.getLogin();
                if (this$login == null) {
                    if (other$login != null) {
                        return false;
                    }
                } else if (!this$login.equals(other$login)) {
                    return false;
                }

                Object this$contrasena = this.getContrasena();
                Object other$contrasena = other.getContrasena();
                if (this$contrasena == null) {
                    if (other$contrasena != null) {
                        return false;
                    }
                } else if (!this$contrasena.equals(other$contrasena)) {
                    return false;
                }

                Object this$tipoUsuario = this.getTipoUsuario();
                Object other$tipoUsuario = other.getTipoUsuario();
                if (this$tipoUsuario == null) {
                    if (other$tipoUsuario != null) {
                        return false;
                    }
                } else if (!this$tipoUsuario.equals(other$tipoUsuario)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Usuario;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $nombre = this.getNombre();
        result = result * 59 + ($nombre == null ? 43 : $nombre.hashCode());
        Object $login = this.getLogin();
        result = result * 59 + ($login == null ? 43 : $login.hashCode());
        Object $contrasena = this.getContrasena();
        result = result * 59 + ($contrasena == null ? 43 : $contrasena.hashCode());
        Object $tipoUsuario = this.getTipoUsuario();
        result = result * 59 + ($tipoUsuario == null ? 43 : $tipoUsuario.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getNombre();
        return "Usuario(nombre=" + var10000 + ", login=" + this.getLogin() + ", contrasena=" + this.getContrasena() + ", tipoUsuario=" + this.getTipoUsuario() + ")";
    }

    public Usuario(final String nombre, final String login, final String contrasena, final TipoUsuario tipoUsuario) {
        this.nombre = nombre;
        this.login = login;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }

    @Override
    public void setchapa(UUID chapa) {

    }

    private static final class UsuarioBuilderImpl extends Usuario.UsuarioBuilder<Usuario, Usuario.UsuarioBuilderImpl> {
        private UsuarioBuilderImpl() {
        }

        protected Usuario.UsuarioBuilderImpl self() {
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    public abstract static class UsuarioBuilder<C extends Usuario, B extends Usuario.UsuarioBuilder<C, B>> extends MainBuilder<C, B> {
        private String nombre;
        private String login;
        private String contrasena;
        private TipoUsuario tipoUsuario;

        public UsuarioBuilder() {
        }

        protected abstract B self();

        public abstract C build();

        public B nombre(final String nombre) {
            this.nombre = nombre;
            return this.self();
        }

        public B login(final String login) {
            this.login = login;
            return this.self();
        }

        public B contrasena(final String contrasena) {
            this.contrasena = contrasena;
            return this.self();
        }

        public B tipoUsuario(final TipoUsuario tipoUsuario) {
            this.tipoUsuario = tipoUsuario;
            return this.self();
        }

        public String toString() {
            String var10000 = super.toString();
            return "Usuario.UsuarioBuilder(super=" + var10000 + ", nombre=" + this.nombre + ", login=" + this.login + ", contrasena=" + this.contrasena + ", tipoUsuario=" + this.tipoUsuario + ")";
        }
    }
}
