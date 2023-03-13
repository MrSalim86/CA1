package rest;

import dtos.PersonDTO;
import facades.PersonFacade;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    private final PersonFacade facade = new PersonFacade();

    @GET
    public Response getAllPersons() {
        List<PersonDTO> personDTOs = facade.getAllPersons();
        return Response.ok(personDTOs).build();
    }

    @GET
    @Path("{id}")
    public Response getPersonById(@PathParam("id") long id) {
        PersonDTO personDTO = facade.getPersonById(id);
        return Response.ok(personDTO).build();
    }

    @POST
    public Response addPerson(PersonDTO personDTO) {
        PersonDTO addedPersonDTO = facade.addPerson(personDTO);
        return Response.ok(addedPersonDTO).build();
    }

    @PUT
    @Path("{id}")
    public Response editPerson(@PathParam("id") int id, PersonDTO personDTO) {
        personDTO.setId(id);
        PersonDTO editedPersonDTO = facade.editPerson(personDTO);
        return Response.ok(editedPersonDTO).build();
    }

    @DELETE
    @Path("{id}")
    public Response deletePerson(@PathParam("id") long id) {
        facade.deletePerson(id);
        return Response.ok().build();
    }
}