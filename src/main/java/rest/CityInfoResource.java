package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.CityInfoDTO;
import dtos.RenameMeDTO;
import facades.CityInfoFacade;
import facades.FacadeExample;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Todo Remove or change relevant parts before ACTUAL use
@Path("cityinfo")
public class CityInfoResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    private static final CityInfoFacade FACADE =  CityInfoFacade.getFacadeExample(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAll() {
        return Response.ok().entity(GSON.toJson(FACADE.getAllCityInfo().getAll())).build();
    }

    @GET
    @Path("/{zipCode}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getCityInfoByZipCode(@PathParam("zipCode") int zipCode) {
        CityInfoDTO cityInfoDTO = FACADE.getCityByZipCode(zipCode);
        return Response.ok().entity(GSON.toJson(cityInfoDTO)).build();
    }

    @GET
    @Path("/cityByName/{city}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getCityInfoByCity(@PathParam("city") String city) {
        CityInfoDTO cityInfoDTO = FACADE.getCityByName(city);
        if (cityInfoDTO == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("City not found").build();
        }
        return Response.ok().entity(GSON.toJson(cityInfoDTO)).build();
    }

    @GET
    @Path("danish-zip-codes")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getDanishZipCodes() {
        return Response.ok().entity(GSON.toJson(FACADE.getDanishZipCodes())).build();
    }
}
