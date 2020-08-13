package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class ServicosREST {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ServicosREST
public static Var alteraPosto() throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    resposta = cronapi.util.Operations.getURLFromOthers(Var.valueOf("PUT"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto").toString() + Var.valueOf("(_objectKey=\'").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.idPosto")).toString() + Var.valueOf("\')").toString()), cronapi.map.Operations.createObjectMapWith(Var.valueOf("posto",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nomePosto"))) , Var.valueOf("cidade",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.cidadePosto"))) , Var.valueOf("uf",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.ufPosto")))), cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(obterToken())) , Var.valueOf("Accept",Var.valueOf("application/json"))), Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resp"), resposta);
    return resposta;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ServicosREST
public static Var getPosto() throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    resposta = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto?$format=json").toString()), Var.VAR_NULL, cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(obterToken()))), Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resp"), resposta);
    return resposta;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ServicosREST
public static Var inserePosto() throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    resposta = cronapi.util.Operations.getURLFromOthers(Var.valueOf("POST"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto").toString()), cronapi.map.Operations.createObjectMapWith(Var.valueOf("posto",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nomePosto"))) , Var.valueOf("cidade",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.cidadePosto"))) , Var.valueOf("uf",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.ufPosto")))), cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(obterToken())) , Var.valueOf("Accept",Var.valueOf("application/json"))), Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resp"), resposta);
    return resposta;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ServicosREST
public static Var obterToken() throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    resposta = cronapi.util.Operations.getURLFromOthers(Var.valueOf("POST"), Var.valueOf("application/x-www-form-urlencoded"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/auth").toString()), cronapi.map.Operations.createObjectMapWith(Var.valueOf("username",Var.valueOf("maria@gmail.com")) , Var.valueOf("password",Var.valueOf("maria"))), Var.VAR_NULL, Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resp"), resposta);
    return cronapi.json.Operations.getJsonOrMapField(cronapi.json.Operations.toJson(resposta), Var.valueOf("token"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ServicosREST
public static Var removePosto() throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    resposta = cronapi.util.Operations.getURLFromOthers(Var.valueOf("DELETE"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto").toString() + Var.valueOf("(_objectKey=\'").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.idPosto")).toString() + Var.valueOf("\')").toString()), Var.VAR_NULL, cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(obterToken())) , Var.valueOf("Accept",Var.valueOf("application/json"))), Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resp"), resposta);
    return resposta;
   }
 }.call();
}

/**
 *
 * @param nome
 * @param cidade
 * @return Var
 */
// Descreva esta função...
public static Var hello(Var nome, Var cidade) throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",nome) , Var.valueOf("cidade",cidade) , Var.valueOf("mensagem",Var.valueOf(Var.valueOf("Olá ").toString() + nome.toString() + Var.valueOf(" de ").toString() + cidade.toString() + Var.valueOf("! Tudo bem? ").toString())));
   }
 }.call();
}

}

