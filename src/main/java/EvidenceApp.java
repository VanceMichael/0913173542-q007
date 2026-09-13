import io.javalin.Javalin;
public class EvidenceApp { public static void main(String[] a){Javalin.create().get("/healthz",c->c.json(java.util.Map.of("status","ok"))).post("/entries",c->c.status(201)).start(8080);} }
