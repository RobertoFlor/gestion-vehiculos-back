package com.datapar.repository;

import com.datapar.model.Auto;
import com.datapar.shared.enums.Situacion;
import com.datapar.shared.enums.TipoServicio;
import com.datapar.shared.exception.CustomException;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ApplicationScoped
public class AutoRepository {

    private final List<Auto> autos;

    public List<Auto> getAll() {
        return autos.stream()
                .filter(u -> u.getSituacion().equals(Situacion.ACTIVO))
                .collect(Collectors.toList());
    }

    public Optional<Auto> getById(UUID chapa) {
        return autos.stream()
                .filter(u -> u.getChapa().equals(chapa))
                .findFirst();
    }



    //VERIFICAR
    public Auto save(@Valid Auto auto) throws Exception {
        Optional<Auto> autoExistente = autos.stream()
                .filter(u -> u.getChapa().equals(auto.getChapa()) &&
                        u.getLogin().equals(auto.getModelo()))
                .findFirst();

        if (autoExistente.isPresent()) throw new CustomException("El vehiculo ingresado ya esta registrado");



        //VERIFICAR
        auto.setId(UUID.randomUUID());
        autos.add(auto);

        return auto;
    }

    public Auto update(UUID chapa, @Valid Auto auto) throws Exception {
        Optional<Auto> autoExistente = autos.stream()
                .filter(u -> u.getChapa().equals(chapa))
                .findFirst();

        if (!autoExistente.isPresent()) throw new CustomException("Usuario con id:" + chapa + " no existe para modificar");

        autos.removeIf(u -> u.getChapa().equals(chapa));

        auto.setchapa(chapa);
        autos.add(auto);

        return auto;
    }


    //verificar
    public void delete(UUID chapa) throws Exception {
        Optional<Auto> auto = autos.stream()
                .filter(u -> u.getChapa().equals(chapa))
                .findFirst();

        if (!auto.isPresent()) throw new CustomException("Usuario no existe usuario con id:" + chapa + " para eliminar");

        auto.get().setSituacion(Situacion.INACTIVO);
        autos.removeIf(u -> u.getChapa().equals(chapa));
        autos.add(auto.get());
    }

    public AutoRepository() {
        this.autos = Stream.of(
                Auto
                        .builder()
                        .chapa(UUID.fromString("AXC 202"))
                        .chassis("asdasdqw1213")
                        .chapa(UUID.fromString("AXC 202"))
                        .anoFabricacion(Integer.parseInt("2001"))
                        .modelo("Clase C")
                        .fabricante("Toyota")
                        .kilometraje(Double.parseDouble("122.123213,201"))
                        .anoModelo(Integer.parseInt("22.006"))
                        .descripcion("Mercedes Benz auto xedan")
                        .tipoServicio(TipoServicio.ABASTECIMIENTO)
                        .situacion(Situacion.ACTIVO)
                        .build())
        .collect(Collectors.toList());
    }

}