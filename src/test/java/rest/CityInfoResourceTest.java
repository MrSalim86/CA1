package rest;//package rest;
//
//import entities.CityInfo;
//import entities.RenameMe;
//import io.restassured.RestAssured;
//import io.restassured.parsing.Parser;
//import org.glassfish.grizzly.http.server.HttpServer;
//import org.glassfish.grizzly.http.util.HttpStatus;
//import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
//import org.glassfish.jersey.server.ResourceConfig;
//import org.junit.jupiter.api.*;
//import utils.EMF_Creator;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.ws.rs.core.UriBuilder;
//import java.net.URI;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
////Uncomment the line below, to temporarily disable this test
//@Disabled
//
//public class CityInfoResourceTest {
//
//    private static final int SERVER_PORT = 7777;
//    private static final String SERVER_URL = "http://localhost/api";
//    private static CityInfo cityInfo1, cityInfo2;
//
//    static final URI BASE_URI = UriBuilder.fromUri(SERVER_URL).port(SERVER_PORT).build();
//    private static HttpServer httpServer;
//    private static EntityManagerFactory emf;
//
//    static HttpServer startServer() {
//        ResourceConfig rc = ResourceConfig.forApplication(new ApplicationConfig());
//        return GrizzlyHttpServerFactory.createHttpServer(BASE_URI, rc);
//    }
//
//    @BeforeAll
//    public static void setUpClass() {
//        //This method must be called before you request the EntityManagerFactory
//        EMF_Creator.startREST_TestWithDB();
//        emf = EMF_Creator.createEntityManagerFactoryForTest();
//
//        httpServer = startServer();
//        //Setup RestAssured
//        RestAssured.baseURI = SERVER_URL;
//        RestAssured.port = SERVER_PORT;
//        RestAssured.defaultParser = Parser.JSON;
//
//        EntityManager em = emf.createEntityManager();
//        cityInfo1 = new CityInfo(2800, "Lyngby");
//        cityInfo2 = new CityInfo(2500, "Valby");
//
//        try {
//            em.getTransaction().begin();
//            em.createNamedQuery("CityInfo.deleteAllRows").executeUpdate();
//            em.persist(cityInfo1);
//            em.persist(cityInfo2);
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//    }
//
//    @AfterAll
//    public static void closeTestServer() {
//        //System.in.read();
//
//        //Don't forget this, if you called its counterpart in @BeforeAll
//        EMF_Creator.endREST_TestWithDB();
//        httpServer.shutdownNow();
//    }
//
//    // Setup the DataBase (used by the test-server and this test) in a known state BEFORE EACH TEST
//    //TODO -- Make sure to change the EntityClass used below to use YOUR OWN (renamed) Entity class
////    @BeforeEach
////    public void setUp() {
////        EntityManager em = emf.createEntityManager();
////        r1 = new RenameMe("Some txt", "More text");
////        r2 = new RenameMe("aaa", "bbb");
////        try {
////            em.getTransaction().begin();
////            em.createNamedQuery("RenameMe.deleteAllRows").executeUpdate();
////            em.persist(r1);
////            em.persist(r2);
////            em.getTransaction().commit();
////        } finally {
////            em.close();
////        }
////    }
//
//    @Test
//    public void testServerIsUp() {
//        System.out.println("Testing is server UP");
//        given().when().get("/cityinfo/getall").then().statusCode(200);
//    }
//
//    //This test assumes the database contains two rows
////    @Test
////    public void testDummyMsg() throws Exception {
////        given()
////                .contentType("application/json")
////                .get("/xxx/").then()
////                .assertThat()
////                .statusCode(HttpStatus.OK_200.getStatusCode())
////                .body("msg", equalTo("Hello World"));
////    }
////
////    @Test
////    public void testCount() throws Exception {
////        given()
////                .contentType("application/json")
////                .get("/xxx/count").then()
////                .assertThat()
////                .statusCode(HttpStatus.OK_200.getStatusCode())
////                .body("count", equalTo(2));
////    }
//
////    @Test
////    public void testGetAll() throws Exception {
////        given()
////                .contentType("application/json")
////                .when()
////                .get("/cityinfo/getall")
////                .then()
////                .statusCode(HttpStatus.OK_200.getStatusCode())
////                .body(2, equalTo(2));
////    }
////
