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


    //Llamar a todos los autos
    public List<Auto> getAll() {
        return autos.stream()
                .filter(u -> u.getSituacion().equals(Situacion.ACTIVO))
                .collect(Collectors.toList());
    }


    //Llamar por chapa
    public Optional<Auto> getById(UUID id) {
        return autos.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }




    //VERIFICAR
    //Agregar un nuevo auto
    public Auto save(@Valid Auto auto)
            throws Exception
    {
        Optional<Auto> autoExistente = autos.stream()
                .filter(u -> u.getId().equals(auto.getId()) &&
                        u.getLogin().equals(auto.getModelo()))
                .findFirst();

        if (autoExistente.isPresent()) throw new CustomException("El vehiculo ingresado ya esta registrado");



        //VERIFICAR
        auto.setId(UUID.randomUUID());
        autos.add(auto);
        return auto;
    }


    //Modificar o actualizar un dato
    public Auto update(UUID id, @Valid Auto auto)
            throws Exception
    {
        Optional<Auto> autoExistente = autos.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();

        if (autoExistente.isEmpty()) throw new CustomException("El vehiculo con la chapa:" + id + " no se encuentra en el sistema ...");

        autos.removeIf(u -> u.getId().equals(id));

        auto.setId(id);
        autos.add(auto);
        return auto;
    }


    //verificar
    //Borrar un auto
    public void delete(UUID id)
            throws Exception
    {
        Optional<Auto> auto = autos.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();

        if (auto.isEmpty()) throw new CustomException("El vehiculo con la" + id + "no se encuentra en el sistema");

        auto.get().setSituacion(Situacion.INACTIVO);
        autos.removeIf(u -> u.getId().equals(id));
        autos.add(auto.get());
    }



    //Repositorio de los autos
    //Corregir
    public AutoRepository() {
        this.autos = Stream.of(
                Auto
                        .builder()
                        .id(UUID.fromString("c8618e55-447b-4e7e-b539-b37c2063381c"))
                        .fabricante("Mercedes Benz")
                        .chapa("AXC 202")
                        .modelo("Clase C")
                        .chassis("CHASsis1")
                        .descripcion("Auto sedan de 4 puertas")
                        .anoModelo(2006)
                        .anoFabricacion(2001)
                        .kilometraje(122520)
                        .tipoServicio(TipoServicio.ABASTECIMIENTO)
                        .situacion(Situacion.ACTIVO)
                        .build(),

                Auto
                        .builder()
                        .id(UUID.fromString("68f28061-4821-421c-91a0-784f111d034"))
                        .fabricante("Kia")
                        .chapa("OBZ 665")
                        .modelo("Sportage")
                        .chassis("CHASsis1321das")
                        .descripcion("Camioneta tipo SUV de 4 puertas")
                        .anoModelo(2016)
                        .anoFabricacion(2015)
                        .kilometraje(50000)
                        .tipoServicio(TipoServicio.TALLER)
                        .situacion(Situacion.ACTIVO)
                        .build())
        .collect(Collectors.toList());
    }
}