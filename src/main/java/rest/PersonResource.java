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

    /**
     * Henter en liste over alle Person-entiteter i databasen.
     * @return En liste af PersonDTO'er.
     */
    @GET
    public Response getAllPersons() {
        List<PersonDTO> personDTOs = facade.getAllPersons();
        return Response.ok(personDTOs).build();
    }

    /**
     * Henter en Person-entitet ud fra dens id.
     * @param id Id'en på den ønskede Person-entitet.
     * @return En PersonDTO.
     */
    @GET
    @Path("{id}")
    public Response getPersonById(@PathParam("id") int id) {
        PersonDTO personDTO = facade.getPersonById(id);
        return Response.ok(personDTO).build();
    }

    /**
     * Tilføjer en Person-entitet til databasen.
     * @param personDTO PersonDTO'en der skal tilføjes.
     * @return Den tilføjede PersonDTO.
     */
    @POST
    public Response addPerson(PersonDTO personDTO) {
        PersonDTO addedPersonDTO = facade.addPerson(personDTO);
        return Response.ok(addedPersonDTO).build();
    }

    /**
     * Opdaterer en Person-entitet i databasen.
     * @param id Id'en på den Person-entitet der skal opdateres.
     * @param personDTO PersonDTO'en der skal opdateres.
     * @return Den opdaterede PersonDTO.
     */
    @PUT
    @Path("{id}")
    public Response editPerson(@PathParam("id") int id, PersonDTO personDTO) {
        personDTO.setId(id);
        PersonDTO editedPersonDTO = facade.editPerson(personDTO);
        return Response.ok(editedPersonDTO).build();
    }

    /**
     * Sletter en Person-entitet fra databasen.
     * @param id Id'en på den Person-entitet der skal slettes.
     * @return En Response med status 200 OK hvis Person-entiteten blev slettet
     * eller 404 Not Found hvis den ikke blev fundet i databasen.
     */
    @DELETE
    @Path("{id}")
    public Response deletePerson(@PathParam("id") int id) {
        facade.deletePerson(id);
        return Response.ok().build();
    }
}